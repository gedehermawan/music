package com.syeftipay.backend.repository;

import com.syeftipay.backend.domain.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MenuRepository extends JpaRepository<Menu, Long> {
  @Query(nativeQuery = true,
        value = "select m.* from menu m where m.menu_id = :menuId and m.restaurant_id = :restaurantId")
  Menu findByMenuAndRestaurant(@Param("menuId")long menuId, @Param("restaurantId")long restaurantId);

  @Query(nativeQuery = true,
  value = "select m.* from menu m where m.restaurant_id = :restaurantId")
  List<Menu> findAllByRestaurant(@Param("restaurantId")long restaurantId);
}
