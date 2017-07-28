package com.syeftipay.api.menu.api.v1;


public class Restaurant {
  private long restaurantId;
  private String restaurantName;
  private double tax;
  private double serviceTax;

  public Restaurant() {
  }

  public long getRestaurantId() {
    return restaurantId;
  }

  public void setRestaurantId(long restaurantId) {
    this.restaurantId = restaurantId;
  }

  public String getRestaurantName() {
    return restaurantName;
  }

  public void setRestaurantName(String restaurantName) {
    this.restaurantName = restaurantName;
  }

  public double getTax() {
    return tax;
  }

  public void setTax(double tax) {
    this.tax = tax;
  }

  public double getServiceTax() {
    return serviceTax;
  }

  public void setServiceTax(double serviceTax) {
    this.serviceTax = serviceTax;
  }
}
