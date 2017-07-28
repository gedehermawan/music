package com.syeftipay.api.menu.api.v1;

import com.syeftipay.backend.service.menu.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController("syeftipay.api.menu.v1.MenuApi")
@RequestMapping("/menu/v1")
public class MenuApi {
  @Autowired
  private MenuService menuService;

  @Autowired
  private MenuMapper menuMapper;

  @RequestMapping(path = "/find-in-restaurant", method = RequestMethod.GET,  produces = APPLICATION_JSON_VALUE)
  public List<Menu> login(@RequestParam("restaurantId")long restaurantId) {
    return menuService.findMenuByRestaurant(restaurantId).stream().map(menuMapper ::menuToMenu).collect(Collectors.toList());
  }
}
