package com.royalmobile.models;

import java.util.ArrayList;
import java.util.List;

public class CartModel {
  private List<Cart> carts = new ArrayList<Cart>();

  public CartModel() {
    carts.add(new Cart());
  }

  public Cart getCartById (String cartId) {
    // TODO: temp, try to find, otherwise throw, let controller delegate
    return carts.get(0);
  }
}
