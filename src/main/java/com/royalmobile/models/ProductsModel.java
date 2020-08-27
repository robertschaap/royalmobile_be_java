package com.royalmobile.models;

import java.util.ArrayList;
import java.util.List;

public class ProductsModel {

  private Integer nextProductId = 0;

  private List<Product> products = new ArrayList<Product>();

  public ProductsModel() {
    this.initProductsModel();
  }

  public List<Product> getProducts() {
    return this.products;
  }

  public void initProductsModel() {

    // TODO: one loop for now for developer sanity while ProductVariant is being built
    for (int i = 0; i < 1; i++) {

      String model = "iPhone X" + Integer.toString(i + 1);
      String modelId = "apple-iphonex" + Integer.toString(i + 1);
      Product product = new Product(this.nextProductId, "Apple", model, modelId);

      this.products.add(product);
      this.nextProductId++;
    }
  }
}

// 16 - 32 - 64 - 128
// lime, purple, green, pink
