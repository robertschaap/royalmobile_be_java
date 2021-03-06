package com.royalmobile.controllers;

import java.util.Map;

import com.royalmobile.api.ApiResponse;
import com.royalmobile.api.CartApi;
import com.royalmobile.models.CartModel;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
  public String addCartItem(String cartId, String variantId, String subscriptionId) {
    try {
      return ApiResponse.success(cartModel.addCartItem(cartId, variantId, subscriptionId));
    } catch (Exception e) {
      return ApiResponse.error("Could not add cart item");
    }
  }

  public String addCartItemJson(@PathVariable String cartId, @RequestBody Map<String, String> body) {
    return this.addCartItem(cartId, body.get("variantId"), body.get("subscriptionId"));
  }

  public String addCartItemXForm(@PathVariable String cartId, @RequestParam Map<String, String> body) {
    return this.addCartItem(cartId, body.get("variantId"), body.get("subscriptionId"));
  }

  /**
   * @param cartId UUIDv4 formatted as string
   * @param itemId UUIDv4 formatted as string
   * @return ApiResponse of Cart without the deleted item or error
   */
  public String deleteCartItem(@PathVariable String cartId, @PathVariable String itemId) {
    try {
      return ApiResponse.success(cartModel.deleteCartItem(cartId, itemId));
    } catch (Exception e) {
      return ApiResponse.error("Could not delete cart item");
    }
  }

  /**
   * @param body Map with UUIDv4 {@code}cartId{@code} formatted as string
   * @return ApiResponse of String or error
   */
  public String postOrder(@RequestParam Map<String, String> body) {
    String cartId = body.get("cartId");

    Boolean result = cartModel.postOrder(cartId);

    if (result == true) {
      return ApiResponse.success(cartId);
    }

    return ApiResponse.error("Could not post order");
  }
}
