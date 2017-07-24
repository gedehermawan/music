package com.peentar.syeftipay.backend.address.province;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinceServiceImpl implements ProvinceService{
  @Autowired
  ProvinceRepository provinceRepository;

  @Override
  public List<Province> findAll() {
    return provinceRepository.findAll();
  }

  @Override
  public Province findById(long id) {
    Province province = provinceRepository.findOne(id);
    if(province == null){
      throw new ProvinceNotFoundException(id);
    }
    return findById(id);
  }
}
