package com.syeftipay.backend.service.city;


public class CityNotFoundException extends RuntimeException{
  public CityNotFoundException(long id) {
    super("City with id "+id+" is not found");
  }
}
