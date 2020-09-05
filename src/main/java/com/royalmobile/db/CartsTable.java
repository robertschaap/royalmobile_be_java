package com.royalmobile.db;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.royalmobile.models.Cart;

public class CartsTable {

  private List<Cart> carts = new ArrayList<Cart>();

  public CartsTable() {
    // Create default cart for easier development and testing
    Cart testCart = new Cart();
    testCart.setId("new-cart");

    this.carts.add(testCart);
  }

  public Optional<Cart> getCartById(String cartId) {
    for (Cart cart : this.carts) {
      if (cart.getId().equals(cartId)) {
        return Optional.of(cart);
      }
    }

    return Optional.empty();
  }

  public Cart createCart() {
    Cart cart = new Cart();
    this.carts.add(cart);

    return cart;
  }
}
