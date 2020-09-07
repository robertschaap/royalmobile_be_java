package com.royalmobile.api;

import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * getCart: IF cart in model get cart ELSE create new cart OR create new if
 * 'new' patchCartItem: add item to cart and return updated cart (CHECK if HTTP
 * method expects this) deleteCartItem delete item from cart and return updated
 * cart (CHECK if HTTP method expects this) postOrder: post order
 */
public interface CartApi {
  @GetMapping(value = "/api/cart/{cartId}", produces = { "application/json" })
  public String getCart(@PathVariable String cartId);

  @PatchMapping(value = "/api/cart/{cartId}/item", produces = { "application/json" })
  public String addCartItem(@PathVariable String cartId, @RequestParam Map<String, String> body);

  @DeleteMapping(value = "/api/cart/{cartId}/item/{itemId}", produces = { "application/json" })
  public String deleteCartItem(@PathVariable String cartId, @PathVariable String itemId);
}
