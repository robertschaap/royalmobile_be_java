package com.royalmobile.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface ProductApi {
  @GetMapping(value = "/api/product/{modelId}", produces = { "application/json" })
  public String getProduct(@PathVariable String modelId);
}
