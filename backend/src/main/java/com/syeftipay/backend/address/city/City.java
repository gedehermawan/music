package com.peentar.syeftipay.backend.address.city;

import com.peentar.syeftipay.backend.address.province.Province;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "city")
public class City {
  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  @Column(name="city_id")
  long cityId;

  @Column(name = "city_name")
  String cityName;

  @ManyToOne
  @JoinColumn(name = "province_id")
  Province province;

  @Column(name = "create_at")
  Date createAt;

  @Column(name = "update_at")
  Date updateAt;

  public City() {
  }

  public long getCityId() {
    return cityId;
  }

  public void setCityId(long cityId) {
    this.cityId = cityId;
  }

  public String getCityName() {
    return cityName;
  }

  public void setCityName(String cityName) {
    this.cityName = cityName;
  }

  public Province getProvince() {
    return province;
  }

  public void setProvince(Province province) {
    this.province = province;
  }

  public Date getCreateAt() {
    return createAt;
  }

  public void setCreateAt(Date createAt) {
    this.createAt = createAt;
  }

  public Date getUpdateAt() {
    return updateAt;
  }

  public void setUpdateAt(Date updateAt) {
    this.updateAt = updateAt;
  }
}
