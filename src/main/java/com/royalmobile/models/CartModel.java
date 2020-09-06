package com.royalmobile.models;

import com.royalmobile.db.Connection;

public class CartModel {

  public Cart getCartById (String cartId) throws Exception {
    return Connection.carts.getCartById(cartId).get();
  }

  public Cart createCart() {
    return Connection.carts.createCart();
  }

  public Cart addCartItem(String cartId, String variantId, String subscriptionId) throws Exception {
    Cart cart;

    if (cartId.equals("new")) {
      cart = this.createCart();
    } else {
      cart = this.getCartById(cartId);
    }

    CartItem c = new CartItem();
    c.setProduct(Connection.products.getProductByModelId("apple-iphonex1").get());
    c.setSubscription(Connection.subscriptions.getSubScriptionById("royalmobile-20gb-1year").get());

    return cart.addItem(c);
  }

  public Cart deleteCartItem(String cartId, String itemId) throws Exception {
    Cart cart = this.getCartById(cartId);

    for (CartItem item : cart.getItems()) {
      if (item.getId().equals(itemId)) {
        cart.deleteItem(item);
        return cart;
      }
    }

    throw new Exception("Not found");
  }
}
