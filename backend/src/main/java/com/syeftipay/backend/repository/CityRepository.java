package com.syeftipay.backend.repository;

import com.syeftipay.backend.domain.Province;
import com.syeftipay.backend.domain.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface CityRepository extends JpaRepository<City,Long> {
  List<City> findAllByProvince(@Param("province")Province province);
}