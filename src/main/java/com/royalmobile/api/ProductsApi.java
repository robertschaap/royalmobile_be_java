package com.royalmobile.api;

import org.springframework.web.bind.annotation.GetMapping;

public interface ProductsApi {
  @GetMapping(value = "/api/products", produces = { "application/json" })
  String getProducts();
}
