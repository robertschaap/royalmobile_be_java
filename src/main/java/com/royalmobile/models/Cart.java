package com.royalmobile.models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

class Totals {

  public String monthly_price = "";
  public String onetime_price = "";
}

public class Cart {

  public String id;
  public List<String> items = new ArrayList<String>();
  public Totals totals = new Totals();

  public Cart() {
    this.id = UUID.randomUUID().toString();
  }
}
