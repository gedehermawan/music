package com.syeftipay.backend.service.menu;

import com.syeftipay.backend.domain.Menu;

import java.util.List;

public interface MenuService {
  Menu createMenu(Menu menu);
  List<Menu> findMenuByRestaurant(long restaurantId);
}
