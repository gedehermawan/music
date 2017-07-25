package com.syeftipay.backend.service.district;

import com.syeftipay.backend.domain.City;
import com.syeftipay.backend.service.city.CityService;
import com.syeftipay.backend.domain.Province;
import com.syeftipay.backend.service.province.ProvinceService;
import com.syeftipay.backend.domain.District;
import com.syeftipay.backend.repository.DistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictServiceImpl implements DistrictService{
  @Autowired
  DistrictRepository districtRepository;

  @Autowired
  CityService cityService;

  @Autowired
  ProvinceService provinceService;

  @Override
  public List<District> findAll() {
    return districtRepository.findAll();
  }

  @Override
  public List<District> findAllByProvinceAndCity(long provinceId, long cityId) {
    Province province = provinceService.findById(provinceId);
    City city = cityService.findById(cityId);
    return districtRepository.findAllByProvinceAndCity(province,city);
  }

  @Override
  public District findById(long id) {
    District district = districtRepository.findOne(id);
    if(district == null){
      throw new DistrictNotFoundException(id);
    }
    return district;
  }
}
