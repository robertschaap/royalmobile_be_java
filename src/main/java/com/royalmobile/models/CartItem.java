package com.royalmobile.models;

import java.util.UUID;

public class CartItem {
  private String id;
  private Product product;
  private Subscription subscription;
  private CartTotals totals;

  public CartItem() {
    this.id = UUID.randomUUID().toString();
  }

  public CartTotals getTotals() {
    return totals;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public Subscription getSubscription() {
    return subscription;
  }

  public void setSubscription(Subscription subscription) {
    this.subscription = subscription;
  }

  public void setTotals(CartTotals totals) {
    this.totals = totals;
  }

}
