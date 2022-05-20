package com.udacity.jwdnd.course1.cloudstorage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author smurF3r Created on 5/18/2022
 */
@Controller
public class LoginController {
  @GetMapping("/login")
  public String index() {
    return "login";
  }

}
