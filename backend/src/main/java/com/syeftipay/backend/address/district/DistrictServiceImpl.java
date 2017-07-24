package com.peentar.syeftipay.backend.address.district;

import com.peentar.syeftipay.backend.address.city.City;
import com.peentar.syeftipay.backend.address.city.CityService;
import com.peentar.syeftipay.backend.address.province.Province;
import com.peentar.syeftipay.backend.address.province.ProvinceService;
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
