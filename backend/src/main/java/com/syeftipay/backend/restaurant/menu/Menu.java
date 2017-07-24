package com.syeftipay.backend.restaurant.menu;

import com.syeftipay.backend.restaurant.Restaurant;
import com.syeftipay.backend.user.User;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "menu")
public class Menu {
  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  @Column(name="menu_id")
  long menuId;

  @Column(name = "menu_name")
  String name;

  @Column(name = "description")
  String description;

  @ManyToOne
  @JoinColumn(name = "restaurant_id")
  Restaurant restaurant;

  @Column(name = "price", precision = 16, scale = 2)
  BigDecimal price;

  @Column(name = "deleted")
  char deleted;

  @Column(name = "create_at")
  Date createAt;

  @Column(name = "update_at")
  Date updateAt;

  @ManyToOne
  @JoinColumn(name = "create_by")
  User createBy;

  @ManyToOne
  @JoinColumn(name = "update_by")
  User updateBy;

  public Menu() {
  }

  public long getMenuId() {
    return menuId;
  }

  public void setMenuId(long menuId) {
    this.menuId = menuId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Restaurant getRestaurant() {
    return restaurant;
  }

  public void setRestaurant(Restaurant restaurant) {
    this.restaurant = restaurant;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
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

  public User getCreateBy() {
    return createBy;
  }

  public void setCreateBy(User createBy) {
    this.createBy = createBy;
  }

  public User getUpdateBy() {
    return updateBy;
  }

  public void setUpdateBy(User updateBy) {
    this.updateBy = updateBy;
  }

  public char getDeleted() {
    return deleted;
  }

  public void setDeleted(char deleted) {
    this.deleted = deleted;
  }
}
