package com.syeftipay.backend.restaurant;

import com.syeftipay.backend.address.city.City;
import com.syeftipay.backend.address.district.District;
import com.syeftipay.backend.address.province.Province;
import com.syeftipay.backend.user.Account;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "restaurant")
public class Restaurant {
  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  @Column(name="restaurant_id")
  long restaurantId;

  @Column(name="restaurant_name")
  String name;

  @ManyToOne
  @JoinColumn(name = "province_id")
  Province province;

  @ManyToOne
  @JoinColumn(name = "city_id")
  City city;

  @ManyToOne
  @JoinColumn(name = "district_id")
  District district;

  @Column(name="village_name")
  String villageName;

  @Column(name="street")
  String street;

  @Column(name="post_code")
  String postCode;

  @Column(name="latitude")
  double latitude;

  @Column(name="longitude")
  double longitude;

  @Column(name="restaurant_tax")
  double restaurantTax;

  @Column(name="service_tax")
  double serviceTax;

  @Column(name = "create_at")
  Date createAt;

  @Column(name = "update_at")
  Date updateAt;

  @Column(name = "deleted")
  char deleted;

  @ManyToOne
  @JoinColumn(name = "create_by")
  Account createBy;

  @ManyToOne
  @JoinColumn(name = "update_by")
  Account updateBy;

  public Restaurant() {
  }

  public long getRestaurantId() {
    return restaurantId;
  }

  public void setRestaurantId(long restaurantId) {
    this.restaurantId = restaurantId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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

  public District getDistrict() {
    return district;
  }

  public void setDistrict(District district) {
    this.district = district;
  }

  public String getVillageName() {
    return villageName;
  }

  public void setVillageName(String villageName) {
    this.villageName = villageName;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  public double getLatitude() {
    return latitude;
  }

  public void setLatitude(double latitude) {
    this.latitude = latitude;
  }

  public double getLongitude() {
    return longitude;
  }

  public void setLongitude(double longitude) {
    this.longitude = longitude;
  }

  public double getRestaurantTax() {
    return restaurantTax;
  }

  public void setRestaurantTax(double restaurantTax) {
    this.restaurantTax = restaurantTax;
  }

  public double getServiceTax() {
    return serviceTax;
  }

  public void setServiceTax(double serviceTax) {
    this.serviceTax = serviceTax;
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

  public char getDeleted() {
    return deleted;
  }

  public void setDeleted(char deleted) {
    this.deleted = deleted;
  }

  public Account getCreateBy() {
    return createBy;
  }

  public void setCreateBy(Account createBy) {
    this.createBy = createBy;
  }

  public Account getUpdateBy() {
    return updateBy;
  }

  public void setUpdateBy(Account updateBy) {
    this.updateBy = updateBy;
  }
}
