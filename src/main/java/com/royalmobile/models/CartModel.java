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

    String[] split = variantId.split("-");

    if (split.length != 4) {
      throw new Exception("Could not add cart item");
    }

    // TODO: check how to better instantiate this, if c.setX below is skips the method returns an invalid cartitem to the frontend
    CartItem c = new CartItem();
    String modelId = split[0] + "-" + split[1];

    c.setProduct(Connection.products.getProductByModelId(modelId).get());
    c.setSubscription(Connection.subscriptions.getSubScriptionById(subscriptionId).get());
    c.setTotals(new CartTotals("0", "0"));

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

  public boolean postOrder(String cartId) {
    // TODO; implement properly once FE is ready for it
    return true;
  }
}
