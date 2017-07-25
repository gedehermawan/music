package com.syeftipay.backend.service.province;


import com.syeftipay.backend.domain.Province;

import java.util.List;

public interface ProvinceService {
  List<Province> findAll();
  Province findById(long id);
}
