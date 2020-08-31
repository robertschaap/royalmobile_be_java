package com.royalmobile.models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Cart {

  public String id;
  public List<String> items = new ArrayList<String>();
  public CartTotals totals = new CartTotals("", "");

  public Cart() {
    this.id = UUID.randomUUID().toString();
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public List<String> getItems() {
    return items;
  }

  public void setItems(List<String> items) {
    this.items = items;
  }

  public CartTotals getTotals() {
    return totals;
  }

  public void setTotals(CartTotals totals) {
    this.totals = totals;
  }
}
