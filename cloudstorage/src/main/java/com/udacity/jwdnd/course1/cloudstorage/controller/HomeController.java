package com.udacity.jwdnd.course1.cloudstorage.controller;

import com.udacity.jwdnd.course1.cloudstorage.model.User;
import com.udacity.jwdnd.course1.cloudstorage.model.dto.FileDto;
import com.udacity.jwdnd.course1.cloudstorage.model.dto.NoteDto;
import com.udacity.jwdnd.course1.cloudstorage.services.FileService;
import com.udacity.jwdnd.course1.cloudstorage.services.NoteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author smurF3r Created on 5/18/2022
 */
@Controller
@RequestMapping(value = "/home")
public class HomeController {

  @Autowired
  NoteService noteService;

  @Autowired
  FileService fileService;

  @GetMapping
  public String getHomePage(Model model, Authentication authentication) {
    User user =(User) authentication.getPrincipal();
    List<NoteDto> notes = noteService.getAllByUserId(user.getUserId());
    List<FileDto> files = fileService.getAllByUserId(user.getUserId());
    model.addAttribute("notes",notes);
    model.addAttribute("files",files);
    return "home";
  }
}
