package com.music.backend.talent;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "talent")
public class Talent {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "talent_id_seq")
  @SequenceGenerator(name = "talent_id_seq", sequenceName = "talent_id_seq", allocationSize=1)
  @Column(name="talent_id")
  long talentId;

  @Column(name = "name")
  String name;

  @Column(name = "price1")
  BigDecimal price1;

  @Column(name = "price2")
  BigDecimal price2;

  @Column(name = "location")
  String location;

  @Column(name = "phone")
  String phone;

  @Column(name = "video_link")
  String videoLink;

  @Column(name = "genre")
  String genre;

  @Column(name = "create_at")
  Date createAt;

  @Column(name = "update_at")
  Date updateAt;

  @Column(name = "deleted")
  char deleted;

  public Talent() {
    this.deleted = '0';
    this.createAt = new Date();
    this.updateAt = createAt;
  }

  public long getTalentId() {
    return talentId;
  }

  public void setTalentId(long talentId) {
    this.talentId = talentId;
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
}
