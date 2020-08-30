package com.royalmobile.controllers;

import com.royalmobile.ApiResponse;
import com.royalmobile.models.CartModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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
}
