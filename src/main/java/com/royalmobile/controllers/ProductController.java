package com.royalmobile.controllers;

import com.royalmobile.ApiResponse;
import com.royalmobile.models.ProductsModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

  private ProductsModel productsModel = new ProductsModel();

  @GetMapping(value = "/api/product/{modelId}", produces = { "application/json" })
  public String getProduct(@PathVariable String modelId) {
    try {
      return ApiResponse.success(this.productsModel.getProductByModelId(modelId));
    } catch (Exception e) {
      return ApiResponse.error("Not found");
    }
  }
}
