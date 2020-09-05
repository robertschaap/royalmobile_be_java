package com.royalmobile.models;

import com.royalmobile.db.Connection;

import java.util.List;

public class ProductsModel {

  public List<Product> getProducts() {
    return Connection.products.getProducts();
  }

  public Product getProductByModelId(String modelId) throws Exception {
    return Connection.products.getProductByModelId(modelId).get();
  }
}
