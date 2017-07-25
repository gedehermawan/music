package com.syeftipay.backend.service.district;


public class DistrictNotFoundException extends RuntimeException {
  public DistrictNotFoundException(long id) {
    super("District with id "+id+" is not found");
  }
}
