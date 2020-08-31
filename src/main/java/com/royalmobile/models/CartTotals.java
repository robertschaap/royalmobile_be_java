package com.royalmobile.models;

public class CartTotals {

  public String monthly_price;
  public String onetime_price;

  public CartTotals(String monthlyPrice, String onetimePrice) {
    this.monthly_price = monthlyPrice;
    this.onetime_price = onetimePrice;
  }

  public String getMonthly_price() {
    return monthly_price;
  }

  public void setMonthly_price(String monthly_price) {
    this.monthly_price = monthly_price;
  }

  public String getOnetime_price() {
    return onetime_price;
  }

  public void setOnetime_price(String onetime_price) {
    this.onetime_price = onetime_price;
  }
}
