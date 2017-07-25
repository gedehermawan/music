package com.syeftipay.backend.service.province;


public class ProvinceNotFoundException extends RuntimeException {
  public ProvinceNotFoundException(long id) {
    super("province with id "+id+" is not found");
  }
}
