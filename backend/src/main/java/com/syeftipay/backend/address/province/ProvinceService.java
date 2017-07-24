package com.syeftipay.backend.address.province;


import java.util.List;

public interface ProvinceService {
  List<Province> findAll();
  Province findById(long id);
}
