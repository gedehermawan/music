package com.music.controller;

import com.music.service.account.EmailAlreadyExistsException;
import com.music.service.talent.AddTalentRequest;
import com.music.service.talent.TalentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/talent")
public class TalentController {
  @Autowired
  TalentService talentService;

  @RequestMapping(value = "/{id}/detail", method = RequestMethod.GET)
  public String viewDetail(Model model, @PathVariable("id") long id, HttpServletRequest request){
    model.addAttribute("user", request.getSession().getAttribute("user"));
    model.addAttribute("talent", talentService.findById(id));
    return "talent/detail";
  }

  @RequestMapping(value = "/register", method = RequestMethod.GET)
  public String registerTalent(){
    return "talent/register_talent";
  }

  @RequestMapping(value = "/register", method = RequestMethod.POST)
  public String registerTalentPost(AddTalentRequest addTalentRequest,
                                   RedirectAttributes redirectAttributes){
    try {
      talentService.add(addTalentRequest);
      return "redirect:/home";
    }catch (EmailAlreadyExistsException e){
      redirectAttributes.addFlashAttribute("message", e.getMessage());
      return "redirect:/talent/register";
    }
  }
}
