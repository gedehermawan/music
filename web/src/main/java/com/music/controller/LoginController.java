package com.music.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;

@Controller
public class LoginController {
  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String viewRoot(Principal principal){
    if(principal!=null){
      return "redirect:/home";
    }
    return "authenticate/login";
  }

  @RequestMapping(value = "/login", method = RequestMethod.GET)
  public String view(Model model, Principal principal,
                     @RequestParam(value="error", required=false) String error)
  {
    if(principal!=null){
      return "redirect:/home";
    }

    if(error != null) {
      model.addAttribute("errorMessage", "Email dan kata sandi tidak cocok");
    } else {
      model.addAttribute("errorMessage", "");
    }
    return "authenticate/login";
  }

  @RequestMapping(value = "/login", method = RequestMethod.POST)
  public String login(Model model){
    model.addAttribute("test","test");
    return "home";
  }
}
