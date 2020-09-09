package com.royalmobile.controllers;

import java.util.Map;

import com.royalmobile.ApiResponse;
import com.royalmobile.api.CartApi;
import com.royalmobile.models.CartModel;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController implements CartApi {

  private CartModel cartModel = new CartModel();

  /**
   * @param cartId UUIDv4 formatted as string
   * @return ApiResponse of Cart or error
   */
  public String getCart(@PathVariable String cartId) {

    try {
      return ApiResponse.success(this.cartModel.getCartById(cartId));
    } catch (Exception e) {
      return ApiResponse.error("Could not get cart");
    }
  }

  /**
   * @param cartId either UUIDv4 formatted as string or {@code}new{@code}
   * @param body {@code}variantId{@code} and {@code}subscriptionId{@code}
   * @return ApiResponse of Cart with the added item or error
   */
  public String addCartItem(@PathVariable String cartId, @RequestParam Map<String, String> body) {
    String variantId = body.get("variantId");
    String subscriptionId = body.get("subscriptionId");

    try {
      return ApiResponse.success(cartModel.addCartItem(cartId, variantId, subscriptionId));
    } catch (Exception e) {
      return ApiResponse.error("Could not add cart item");
    }
  }

  public String deleteCartItem(@PathVariable String cartId, @PathVariable String itemId) {
    try {
      return ApiResponse.success(cartModel.deleteCartItem(cartId, itemId));
    } catch (Exception e) {
      return ApiResponse.error("Could not delete cart item");
    }
  }

  public String postOrder(@RequestParam Map<String, String> body) {
    String cartId = body.get("cartId");

    Boolean result = cartModel.postOrder(cartId);

    if (result == true) {
      return ApiResponse.success(cartId);
    }

    return ApiResponse.error("Could not post order");
  }
}
