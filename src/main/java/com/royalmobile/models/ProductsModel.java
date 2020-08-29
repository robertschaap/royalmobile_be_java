package com.royalmobile.models;

import java.util.ArrayList;
import java.util.List;

public class ProductsModel {

  private Integer nextProductId = 0;
  private Integer nextVariantId = 0;

  private List<Product> products = new ArrayList<Product>();

  public ProductsModel() {
    this.initProductsModel();
  }

  public List<Product> getProducts() {
    return this.products;
  }

  public Product getProductByModelId(String modelId) throws Exception {
    for (Product product : this.products) {
      if (product.getModelId().equals(modelId)) {
        return product;
      }
    }

    throw new Exception("Not Found");
  }

  public void initProductsModel() {
    String[] capacities = { "16gb", "32gb", "64gb", "128gb" };

    for (int i = 0; i < 6; i++) {
      String model = "iPhone X" + Integer.toString(i + 1);
      String modelId = "apple-iphonex" + Integer.toString(i + 1);
      Product product = new Product(this.nextProductId++, "Apple", model, modelId);

      for (String capacity : capacities) {
        product.setVariant(new ProductVariant(nextVariantId++, product.getModelId(), capacity, "lime", "#7ec09a"));
        product.setVariant(new ProductVariant(nextVariantId++, product.getModelId(), capacity, "purple", "#8097c2"));
        product.setVariant(new ProductVariant(nextVariantId++, product.getModelId(), capacity, "green", "#bae596"));
        product.setVariant(new ProductVariant(nextVariantId++, product.getModelId(), capacity, "pink", "#d59a8d"));
      }

      this.products.add(product);
    }
  }
}
