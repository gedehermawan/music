package com.music.controller;

import com.music.service.talent.TalentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
  @Autowired
  TalentService talentService;

  @RequestMapping(value = "/home", method = RequestMethod.GET)
  public String view(Model model, HttpServletRequest request){
    model.addAttribute("user", request.getSession().getAttribute("user"));
    model.addAttribute("talents", talentService.findAll());
    return "home/home";
  }
}
