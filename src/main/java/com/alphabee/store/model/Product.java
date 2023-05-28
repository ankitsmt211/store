package com.alphabee.store.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Product {
  @Id
  @GeneratedValue
  private String productId;
  private String productName;
  private int frequency;
  private int price;


  public String getProductId() {
    return productId;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public int getFrequency() {
    return frequency;
  }

  public void setFrequency(int frequency) {
    this.frequency = frequency;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "Product{" +
      "productId='" + productId + '\'' +
      ", productName='" + productName + '\'' +
      ", frequency=" + frequency +
      ", price=" + price +
      '}';
  }
}
