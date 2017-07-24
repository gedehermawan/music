package com.syeftipay.backend.address.province;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "province")
public class Province {
  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  @Column(name="province_id")
  long provinceId;

  @Column(name = "province_name")
  String provinceName;

  @Column(name = "create_at")
  Date createAt;

  @Column(name = "update_at")
  Date updateAt;

  public Province() {
  }

  public long getProvinceId() {
    return provinceId;
  }

  public void setProvinceId(long provinceId) {
    this.provinceId = provinceId;
  }

  public String getProvinceName() {
    return provinceName;
  }

  public void setProvinceName(String provinceName) {
    this.provinceName = provinceName;
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
