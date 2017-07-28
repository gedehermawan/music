package com.syeftipay.backend.service.restaurant;


public class RestaurantNotFoundException  extends RuntimeException  {
  public RestaurantNotFoundException(long id) {
    super("Restaurant with id "+id+" is not found");
  }
}
