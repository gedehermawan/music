package com.syeftipay.backend.address.city;


public class CityNotFoundException extends RuntimeException{
  public CityNotFoundException(long id) {
    super("City with id "+id+" is not found");
  }
}
