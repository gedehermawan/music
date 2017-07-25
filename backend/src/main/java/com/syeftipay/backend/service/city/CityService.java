package com.syeftipay.backend.service.city;


import com.syeftipay.backend.domain.City;

import java.util.List;

public interface CityService {
  List<City> findAll();
  List<City> findAllByProvince(long provinceId);
  City findById(long id);
}
