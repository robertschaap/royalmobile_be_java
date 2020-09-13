package com.royalmobile.models;

public class ProductVariant {
  private final Integer id;
  private final String variantId;
  private final String color;
  private final String colorHex;
  private final String capacity;

  private boolean is_in_stock = true;
  private boolean is_preorder = true;
  private String regular_price = "265";
  private String discounted_price = "239";
  private boolean has_discounts = true;

  public ProductVariant(Integer id, String modelId, String capacity, String color, String colorHex) {
    this.id = id;
    this.variantId = modelId + "-" + capacity + "-" + color;
    this.color = color;
    this.colorHex = colorHex;
    this.capacity = capacity;
  }

  public Integer getId() {
    return id;
  }

  public String getVariantId() {
    return variantId;
  }

  public String getColor() {
    return color;
  }

  public String getColorHex() {
    return colorHex;
  }

  public String getCapacity() {
    return capacity;
  }

  public boolean isIs_in_stock() {
    return is_in_stock;
  }

  public void setIs_in_stock(boolean is_in_stock) {
    this.is_in_stock = is_in_stock;
  }

  public boolean isIs_preorder() {
    return is_preorder;
  }

  public void setIs_preorder(boolean is_preorder) {
    this.is_preorder = is_preorder;
  }

  public String getRegular_price() {
    return regular_price;
  }

  public void setRegular_price(String regular_price) {
    this.regular_price = regular_price;
  }

  public String getDiscounted_price() {
    return discounted_price;
  }

  public void setDiscounted_price(String discounted_price) {
    this.discounted_price = discounted_price;
  }

  public boolean isHas_discounts() {
    return has_discounts;
  }

  public void setHas_discounts(boolean has_discounts) {
    this.has_discounts = has_discounts;
  }
}
