package com.syeftipay.backend.service.menu;

import com.syeftipay.backend.domain.Menu;
import com.syeftipay.backend.domain.Restaurant;
import com.syeftipay.backend.repository.MenuRepository;
import com.syeftipay.backend.repository.RestaurantRepository;
import com.syeftipay.backend.service.restaurant.RestaurantNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService{
  @Autowired
  private MenuRepository menuRepository;

  @Autowired
  private RestaurantRepository restaurantRepository;

  @Override
  public Menu createMenu(Menu menu) {
    return null;
  }

  @Override
  public List<Menu> findMenuByRestaurant(long restaurantId) {
    Restaurant restaurant = restaurantRepository.findOne(restaurantId);

    if(restaurant == null){
      throw new RestaurantNotFoundException(restaurantId);
    }

    return menuRepository.findAllByRestaurant(restaurantId);
  }
}
