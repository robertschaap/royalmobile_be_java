package com.royalmobile.controllers;

import com.royalmobile.ApiResponse;
import com.royalmobile.api.ProductsApi;
import com.royalmobile.models.ProductsModel;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController implements ProductsApi {

  private ProductsModel productsModel = new ProductsModel();

  /**
   * @return ApiResponse of Product list or error
   */
  public String getProducts() {
    return ApiResponse.success(this.productsModel.getProducts());
  }
}
