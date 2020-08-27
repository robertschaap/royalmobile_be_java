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
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getModelId() {
    return modelId;
  }

  public void setModelId(String modelId) {
    this.modelId = modelId;
  }

  public ProductVariant[] getVariants() {
    return variants;
  }

  public void setVariants(ProductVariant[] variants) {
    this.variants = variants;
  }
}
