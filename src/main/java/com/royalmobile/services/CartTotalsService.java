package com.royalmobile.services;

import com.royalmobile.models.CartTotals;
import com.royalmobile.models.ProductVariant;
import com.royalmobile.models.Subscription;

public class CartTotalsService {
  public static CartTotals calculateCartItemTotals(ProductVariant variant, Subscription subscription) {
    return new CartTotals(
      subscription.getRegular_price(),
      variant.getRegular_price()
    );
  }
}
