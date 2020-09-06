package com.royalmobile.controllers;

import java.util.Map;

import com.royalmobile.ApiResponse;
import com.royalmobile.models.CartModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
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

  /**
   * @param cartId UUIDv4 formatted as string
   * @return ApiResponse of Cart or error
   */
  @GetMapping(value = "/api/cart/{cartId}", produces = { "application/json" })
  public String getCart(@PathVariable String cartId) {

    try {
      return ApiResponse.success(this.cartModel.getCartById(cartId));
    } catch (Exception e) {
      return ApiResponse.error("Not Found");
    }
  }

  /**
   * @param cartId either UUIDv4 formatted as string or {@code}new{@code}
   * @param body {@code}variantId{@code} and {@code}subscriptionId{@code}
   * @return ApiResponse of Cart with the added item or error
   */
  @PatchMapping(value = "/api/cart/{cartId}/item", produces = { "application/json" })
  public String addCartItem(@PathVariable String cartId, @RequestParam Map<String, String> body) {
    String variantId = body.get("variantId");
    String subscriptionId = body.get("subscriptionId");

    try {
      return ApiResponse.success(cartModel.addCartItem(cartId, variantId, subscriptionId));
    } catch (Exception e) {
      return ApiResponse.error("Not Found");
    }
  }
}
