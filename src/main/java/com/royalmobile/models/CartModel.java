package com.royalmobile.models;

import java.util.ArrayList;
import java.util.List;

public class CartModel {
  private List<Cart> carts = new ArrayList<Cart>();

  public CartModel() {}

  public Cart getCartById (String cartId) throws Exception {
    for (Cart cart : this.carts) {
      if (cart.getId().equals(cartId)) {
        return cart;
      }
    }

    throw new Exception();
  }
}
