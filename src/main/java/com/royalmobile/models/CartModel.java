package com.royalmobile.models;

import java.util.ArrayList;
import java.util.List;

public class CartModel {
  private List<Cart> carts = new ArrayList<Cart>();

  public CartModel() {
    Cart testCart = new Cart();
    testCart.setId("new-cart");

    this.carts.add(testCart);
  }

  public Cart getCartById (String cartId) throws Exception {
    for (Cart cart : this.carts) {
      if (cart.getId().equals(cartId)) {
        return cart;
      }
    }

    throw new Exception();
  }

  public Cart createCart() {
    Cart cart = new Cart();
    this.carts.add(cart);

    return cart;
  }
}
