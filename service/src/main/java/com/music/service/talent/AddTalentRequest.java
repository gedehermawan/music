package com.music.service.talent;


import java.math.BigDecimal;

public class AddTalentRequest {
  private String name;
  private BigDecimal price1;
  private BigDecimal price2;
  private String location;
  private String phone;
  private String email;
  private String videoLink;
  private String genre;

  public AddTalentRequest() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BigDecimal getPrice1() {
    return price1;
  }

  public void setPrice1(BigDecimal price1) {
    this.price1 = price1;
  }

  public BigDecimal getPrice2() {
    return price2;
  }

  public void setPrice2(BigDecimal price2) {
    this.price2 = price2;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getVideoLink() {
    return videoLink;
  }

  public void setVideoLink(String videoLink) {
    this.videoLink = videoLink;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }
}
