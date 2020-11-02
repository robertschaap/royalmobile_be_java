package com.royalmobile.api;

import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public interface CartApi {
  @GetMapping(value = "/api/cart/{cartId}", produces = { "application/json" })
  public String getCart(@PathVariable String cartId);

  @PatchMapping(value = "/api/cart/{cartId}/item", consumes = "application/json", produces = { "application/json" })
  public String addCartItemJson(@PathVariable String cartId, @RequestBody Map<String, String> body);

  @PatchMapping(value = "/api/cart/{cartId}/item", consumes = "application/x-www-form-urlencoded", produces = { "application/json" })
  public String addCartItemXForm(@PathVariable String cartId, @RequestParam Map<String, String> body);

  @DeleteMapping(value = "/api/cart/{cartId}/item/{itemId}", produces = { "application/json" })
  public String deleteCartItem(@PathVariable String cartId, @PathVariable String itemId);

  @PostMapping(value = "api/cart/order", produces = { "application/json "})
  public String postOrder(@RequestParam Map<String, String> body);
}
