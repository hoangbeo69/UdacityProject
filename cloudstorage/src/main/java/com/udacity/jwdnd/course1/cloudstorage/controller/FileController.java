package com.udacity.jwdnd.course1.cloudstorage.controller;

import com.udacity.jwdnd.course1.cloudstorage.model.dto.FileDto;
import com.udacity.jwdnd.course1.cloudstorage.services.FileService;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
  public String upload(@RequestParam("fileUpload") MultipartFile file) throws IOException {
    FileDto fileDto = FileDto.builder()
        .fileName(file.getOriginalFilename())
        .contentType(file.getContentType())
        .fileSize(file.getSize())
        .fileData(file.getBytes())
        .build();

    return "home";
  }
}
