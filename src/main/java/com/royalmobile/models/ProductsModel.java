package com.royalmobile.models;

public class ProductsModel {
  private Product[] products = {
    new Product(0, "Apple", "iPhone X1", "apple-iphonex1")
  };

  public Product[] getProducts() {
    return this.products;
  }
}
