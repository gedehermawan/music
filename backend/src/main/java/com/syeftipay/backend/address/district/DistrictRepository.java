package com.syeftipay.backend.address.district;

import com.syeftipay.backend.address.city.City;
import com.syeftipay.backend.address.province.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface DistrictRepository extends JpaRepository<District, Long> {
  List<District> findAllByProvinceAndCity(@Param("province")Province province, @Param("city")City city);
}
