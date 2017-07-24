package com.syeftipay.backend.address.district;

import com.syeftipay.backend.address.city.City;
import com.syeftipay.backend.address.province.Province;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "district")
public class District {
  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  @Column(name="district_id")
  long districtId;

  @Column(name = "district_name")
  String districtName;

  @ManyToOne
  @JoinColumn(name = "province_id")
  Province province;

  @ManyToOne
  @JoinColumn(name = "city_id")
  City city;

  @Column(name = "create_at")
  Date createAt;

  @Column(name = "update_at")
  Date updateAt;

  public District() {
  }

  public long getDistrictId() {
    return districtId;
  }

  public void setDistrictId(long districtId) {
    this.districtId = districtId;
  }

  public String getDistrictName() {
    return districtName;
  }

  public void setDistrictName(String districtName) {
    this.districtName = districtName;
  }

  public Province getProvince() {
    return province;
  }

  public void setProvince(Province province) {
    this.province = province;
  }

  public City getCity() {
    return city;
  }

  public void setCity(City city) {
    this.city = city;
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
