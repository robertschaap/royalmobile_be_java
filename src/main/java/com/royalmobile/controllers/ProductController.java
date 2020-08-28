package com.royalmobile.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

  @GetMapping(value = "/api/product", produces = { "application/json" })
  public String getProduct() {
    return "Get Product";
  }
}
