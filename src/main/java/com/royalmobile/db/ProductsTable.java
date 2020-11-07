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
    this.seedProductsTable();
  }

  public void seedProductsTable() {
    ProductFactory factory = new ProductFactory();
    String[] capacities = { "64gb", "128gb", "256gb", "512gb" };

    for (int i = 0; i < 6; i++) {
      String model = "iPhone 12 v" + Integer.toString(i + 1);
      String modelId = "apple-iphone12v" + Integer.toString(i + 1);
      Product product = factory.createProduct(this.nextProductId++, "Apple", model, modelId);

      for (String capacity : capacities) {
        product.setVariant(new ProductVariant(nextVariantId++, product.getModelId(), capacity, "green", "#d8efd5"));
        product.setVariant(new ProductVariant(nextVariantId++, product.getModelId(), capacity, "white", "#f5f5f7"));
        product.setVariant(new ProductVariant(nextVariantId++, product.getModelId(), capacity, "red", "#d82e2e"));
        product.setVariant(new ProductVariant(nextVariantId++, product.getModelId(), capacity, "black", "#25212b"));
        product.setVariant(new ProductVariant(nextVariantId++, product.getModelId(), capacity, "blue", "#023b63"));
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

  public Optional<Product> getProductByVariantId(String variantId) {
    String[] split = variantId.split("-");

    if (split.length != 4) {
      return Optional.empty();
    }

    String modelId = split[0] + "-" + split[1];
    Product originalProduct = null;

    for (Product product : this.products) {
      if (product.getModelId().equals(modelId)) {
        originalProduct = product;
        break;
      }
    }

    if (originalProduct == null) {
      return Optional.empty();
    }

   ProductVariant selectedVariant = null;

   for (ProductVariant variant : originalProduct.getVariants()) {
     if (variant.getVariantId().equals(variantId)) {
       selectedVariant = variant;
       break;
      }
    }

    if (selectedVariant == null) {
      return Optional.empty();
    }

    Product selectedProduct = new Product(
      originalProduct.getId(),
      originalProduct.getManufacturer(),
      originalProduct.getModel(),
      originalProduct.getModelId()
    );

    selectedProduct.setVariant(selectedVariant);

    return Optional.of(selectedProduct);
  }

}
