package com.royalmobile.models;

public class ProductFactory {

  public Product createProduct(Integer id, String manufacturer, String model, String modelId) {
    return new Product(id, manufacturer, model, modelId);
  }
}
