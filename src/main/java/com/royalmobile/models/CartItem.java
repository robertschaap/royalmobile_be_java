package com.royalmobile.models;

public class CartItem {
  private Product product;
  private Subscription subscription;
  private CartTotals totals;

  public CartTotals getTotals() {
    return totals;
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
