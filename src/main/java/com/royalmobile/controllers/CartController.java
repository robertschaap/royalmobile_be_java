package com.royalmobile.controllers;

import com.royalmobile.ApiResponse;
import com.royalmobile.models.CartModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * getCart: IF cart in model get cart ELSE create new cart OR create new if 'new'
 * patchCartItem: add item to cart and return updated cart (CHECK if HTTP method expects this)
 * deleteCartItem delete item from cart and return updated cart (CHECK if HTTP method expects this)
 * postOrder: post order
 */
@RestController
public class CartController {

  private CartModel cartModel = new CartModel();

  @GetMapping(value = "/api/cart/{cartId}", produces = { "application/json" })
  public String getCart(@PathVariable String cartId) {

    try {
      return ApiResponse.success(this.cartModel.getCartById(cartId));
    } catch (Exception e) {
      return ApiResponse.error("Not Found");
    }
  }

  @PatchMapping(value = "/api/cart/{cartId}/item")
  public String addCartItem(@PathVariable String cartId) {
    try {
      return ApiResponse.success(cartModel.addCartItem(cartId));
    } catch (Exception e) {
      return ApiResponse.error("Not Found");
    }
  }
}
