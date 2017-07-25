package com.syeftipay.backend.service.district;

import com.syeftipay.backend.domain.District;

import java.util.List;


public interface DistrictService {
  List<District> findAll();
  List<District> findAllByProvinceAndCity(long provinceId, long cityId);
  District findById(long id);
}
