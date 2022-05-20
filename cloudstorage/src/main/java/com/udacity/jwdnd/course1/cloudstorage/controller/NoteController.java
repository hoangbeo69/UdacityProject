package com.udacity.jwdnd.course1.cloudstorage.controller;

import com.udacity.jwdnd.course1.cloudstorage.model.User;
import com.udacity.jwdnd.course1.cloudstorage.model.dto.NoteDto;
import com.udacity.jwdnd.course1.cloudstorage.services.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author smurF3r Created on 5/18/2022
 */
@Controller
@RequestMapping(value = "note")
public class NoteController {

  @Autowired
  NoteService noteService;

  @PostMapping("/update")
  public String updateNote(@ModelAttribute("note") NoteDto note) {
    noteService.updateNote(note);
    return "redirect:/home";
  }

  @PostMapping
  public String insertNote(@ModelAttribute("note") NoteDto note, Authentication authentication) {
    User user =(User) authentication.getPrincipal();
    note.setUserId(user.getUserId());
    noteService.addNote(note);
    return "redirect:/home";
  }

  @GetMapping("/delete")
  public String deleteNote(@RequestParam("noteId") Integer id) {
    System.out.println(id);
    noteService.deleteNote(id);
    return "redirect:/home";
  }
}