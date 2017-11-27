package com.music.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String viewRoot(Model model){
    return "/authenticate/login";
  }

  @RequestMapping(value = "/login", method = RequestMethod.GET)
  public String view(Model model){
    model.addAttribute("test","test");
    return "/authenticate/login";
  }

  @RequestMapping(value = "/login", method = RequestMethod.POST)
  public String login(Model model){
    model.addAttribute("test","test");
    return "/home";
  }
}
