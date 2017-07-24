package com.peentar.syeftipay.backend.address.province;


public class ProvinceNotFoundException extends RuntimeException {
  public ProvinceNotFoundException(long id) {
    super("province with id "+id+" is not found");
  }
}
