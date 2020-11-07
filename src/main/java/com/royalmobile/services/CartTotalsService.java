package com.royalmobile.services;

import java.util.List;

import com.royalmobile.models.CartItem;
import com.royalmobile.models.CartTotals;
import com.royalmobile.models.ProductVariant;
import com.royalmobile.models.Subscription;

public class CartTotalsService {
  private static int parseInteger(String price) {
    try {
      System.out.println(price);
      return Integer.parseInt(price);
    } catch (Exception e) {
      return 0;
    }
  }

  public static CartTotals calculateCartItemTotals(ProductVariant variant, Subscription subscription) {
    return new CartTotals(
      subscription.getRegular_price(),
      variant.getRegular_price()
    );
  }

  public static CartTotals calculateCartTotals(List<CartItem> cartItems) {
    int monthlyPrice = 0;
    int oneTimePrice = 0;

    for (CartItem cartItem : cartItems) {
      monthlyPrice += parseInteger(cartItem.getTotals().getMonthly_price());
      oneTimePrice += parseInteger(cartItem.getTotals().getOnetime_price());
    }

    return new CartTotals(
      Integer.toString(monthlyPrice),
      Integer.toString(oneTimePrice)
    );

  }
}
