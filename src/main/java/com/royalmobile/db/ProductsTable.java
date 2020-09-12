package com.royalmobile.db;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.royalmobile.models.Product;
import com.royalmobile.models.ProductFactory;
import com.royalmobile.models.ProductVariant;

public class ProductsTable {

  private Integer nextProductId = 0;
  private Integer nextVariantId = 0;

  private List<Product> products = new ArrayList<Product>();

  public ProductsTable() {
    ProductFactory factory = new ProductFactory();
    String[] capacities = { "16gb", "32gb", "64gb", "128gb" };

    for (int i = 0; i < 6; i++) {
      String model = "iPhone X" + Integer.toString(i + 1);
      String modelId = "apple-iphonex" + Integer.toString(i + 1);
      Product product = factory.createProduct(this.nextProductId++, "Apple", model, modelId);

      for (String capacity : capacities) {
        product.setVariant(new ProductVariant(nextVariantId++, product.getModelId(), capacity, "lime", "#7ec09a"));
        product.setVariant(new ProductVariant(nextVariantId++, product.getModelId(), capacity, "purple", "#8097c2"));
        product.setVariant(new ProductVariant(nextVariantId++, product.getModelId(), capacity, "green", "#bae596"));
        product.setVariant(new ProductVariant(nextVariantId++, product.getModelId(), capacity, "pink", "#d59a8d"));
      }

      this.products.add(product);
    }
  }

  public List<Product> getProducts() {
    return this.products;
  }

  public Optional<Product> getProductByModelId(String modelId) {
    for (Product product : this.products) {
      if (product.getModelId().equals(modelId)) {
        return Optional.of(product);
      }
    }

    return Optional.empty();
  }

}
