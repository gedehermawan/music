package com.peentar.syeftipay.backend.address.city;

import com.peentar.syeftipay.backend.address.province.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface CityRepository extends JpaRepository<City,Long> {
  List<City> findAllByProvince(@Param("province")Province province);
}