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

  public Cart addCartItem(String cartId) throws Exception {
    Cart cart;

    if (cartId.equals("new")) {
      cart = this.createCart();
    } else {
      cart = this.getCartById(cartId);
    }

    // TODO: private items and make this a proper method that returns the cart
    cart.items.add(new CartItem());

    return cart;
  }
}
