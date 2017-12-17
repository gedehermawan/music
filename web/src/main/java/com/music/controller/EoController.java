package com.music.controller;

import com.music.service.account.EmailAlreadyExistsException;
import com.music.service.eventorganizer.AddEventOrganizerRequest;
import com.music.service.eventorganizer.EventOrganizerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/eo")
public class EoController {
  @Autowired
  EventOrganizerService eventOrganizerService;

  @RequestMapping(value = "/register", method = RequestMethod.GET)
  public String registerEoView(Model model){
    return "register/register_eo";
  }

  @RequestMapping(value = "/register", method = RequestMethod.POST)
  public String registerEoPost(AddEventOrganizerRequest addEventOrganizerRequest,
                               RedirectAttributes redirectAttributes){
    try {
      eventOrganizerService.add(addEventOrganizerRequest);
      return "redirect:/login";
    }catch (EmailAlreadyExistsException e){
      redirectAttributes.addFlashAttribute("message", e.getMessage());
      return "redirect:/eo/register";
    }
  }
}
