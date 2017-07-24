package com.syeftipay.backend.address.city;


import java.util.List;

public interface CityService {
  List<City> findAll();
  List<City> findAllByProvince(long provinceId);
  City findById(long id);
}
