package com.royalmobile.models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Cart {

  private String id;
  private List<CartItem> items = new ArrayList<CartItem>();
  private CartTotals totals = new CartTotals("", "");

  public Cart() {
    this.id = UUID.randomUUID().toString();
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public List<CartItem> getItems() {
    return items;
  }

  public void setItems(List<CartItem> items) {
    this.items = items;
  }

  public CartTotals getTotals() {
    return totals;
  }

  public void setTotals(CartTotals totals) {
    this.totals = totals;
  }

  public Cart addItem(CartItem item) {
    this.items.add(item);

    return this;
  }
}
