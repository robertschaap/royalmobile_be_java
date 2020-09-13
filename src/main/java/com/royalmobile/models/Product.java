package com.royalmobile.models;

import java.util.ArrayList;
import java.util.List;

public class Product {
  private final Integer id;
  private final String manufacturer;
  private final String model;
  private final String modelId;
  private List<ProductVariant> variants = new ArrayList<ProductVariant>();

  public Product(Integer id, String manufacturer, String model, String modelId) {
    this.id = id;
    this.manufacturer = manufacturer;
    this.model = model;
    this.modelId = modelId;
  }

  public Integer getId() {
    return id;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public String getModel() {
    return model;
  }

  public String getModelId() {
    return modelId;
  }

  public List<ProductVariant> getVariants() {
    return variants;
  }

  public void setVariant(ProductVariant variant) {
    this.variants.add(variant);
  }
}
