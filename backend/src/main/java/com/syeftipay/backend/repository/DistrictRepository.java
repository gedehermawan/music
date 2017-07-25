package com.syeftipay.backend.repository;

import com.syeftipay.backend.domain.City;
import com.syeftipay.backend.domain.Province;
import com.syeftipay.backend.domain.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface DistrictRepository extends JpaRepository<District, Long> {
  List<District> findAllByProvinceAndCity(@Param("province")Province province, @Param("city")City city);
}
