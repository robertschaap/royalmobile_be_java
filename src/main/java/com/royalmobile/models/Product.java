package com.royalmobile.models;

public class Product {
  private Integer id = 0;
  private String manufacturer;
  private String model;
  private String modelId;
  private ProductVariant[] variants;

  public Product(Integer id, String manufacturer, String model, String modelId) {
    this.id = id;
    this.manufacturer = manufacturer;
    this.model = model;
    this.modelId = modelId;
  }

  public Integer getId() {
    return this.id;
  }

  public String getManufacturer() {
    return this.manufacturer;
  }

  public String getModel() {
    return this.model;
  }

  public String getModelId() {
    return this.modelId;
  }

  // TODO: implement
  public void createVariant() {
    return;
  }

  public ProductVariant[] getVariants() {
    return this.variants;
  }
}
