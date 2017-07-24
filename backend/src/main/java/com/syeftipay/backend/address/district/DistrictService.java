package com.peentar.syeftipay.backend.address.district;

import java.util.List;


public interface DistrictService {
  List<District> findAll();
  List<District> findAllByProvinceAndCity(long provinceId, long cityId);
  District findById(long id);
}
