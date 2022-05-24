package com.udacity.jwdnd.course1.cloudstorage.controller;

import com.udacity.jwdnd.course1.cloudstorage.model.User;
import com.udacity.jwdnd.course1.cloudstorage.model.dto.FileDto;
import com.udacity.jwdnd.course1.cloudstorage.services.FileService;
import java.io.IOException;
import java.io.InputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author smurF3r Created on 5/20/2022
 */
@Controller
@RequestMapping("/file")
public class FileController {

  @Autowired
  FileService fileService;

  @PostMapping
  public String upload(@RequestParam("fileUpload") MultipartFile file, Authentication authentication) throws Exception {
    User user =(User) authentication.getPrincipal();
    FileDto fileDto = FileDto.builder()
        .fileName(file.getOriginalFilename())
        .contentType(file.getContentType())
        .fileSize(file.getSize())
        .fileData(file.getBytes())
        .userId(user.getUserId())
        .build();
    fileService.addFile(fileDto);
    return "redirect:/home";
  }

  @GetMapping(
      value = "/download",
      produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
  public @ResponseBody byte[] download(@RequestParam("fileId") Integer fileId) throws IOException {
    FileDto fileDto = fileService.getFileById(fileId);
    return fileDto.getFileData();
  }

  @GetMapping("/delete")
  public String delete(@RequestParam("fileId") Integer fileId) throws IOException {
    fileService.deleteFile(fileId);
    return "redirect:/home";
  }
}