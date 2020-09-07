package com.royalmobile.controllers;

import com.royalmobile.ApiResponse;
import com.royalmobile.api.ProductApi;
import com.royalmobile.models.ProductsModel;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController implements ProductApi {

  private ProductsModel productsModel = new ProductsModel();

  /**
   * @param modelId string of the model ID, i.e. {@code}manufacturer-device{@code}
   * @return ApiResponse of Product or error
   */
  public String getProduct(@PathVariable String modelId) {
    try {
      return ApiResponse.success(this.productsModel.getProductByModelId(modelId));
    } catch (Exception e) {
      return ApiResponse.error("Not found");
    }
  }
}
