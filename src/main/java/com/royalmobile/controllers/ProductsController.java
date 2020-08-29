package com.royalmobile.controllers;

import com.royalmobile.ApiResponse;
import com.royalmobile.models.ProductsModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {

  private ProductsModel productsModel = new ProductsModel();

  @GetMapping(value = "/api/products", produces = { "application/json" })
  public String getProducts() {
    return ApiResponse.success(this.productsModel.getProducts());
  }
}
