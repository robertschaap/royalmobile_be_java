package com.royalmobile.db;

import com.royalmobile.models.Subscription;

public class SubscriptionsTable {
  private Subscription[] subscriptions = {
    new Subscription(0, "20gb", "1year", "20"),
    new Subscription(1, "40gb", "1year", "30"),
    new Subscription(2, "60gb", "1year", "40"),
    new Subscription(3, "80gb", "1year", "50"),
    new Subscription(4, "20gb", "2year", "18"),
    new Subscription(5, "40gb", "2year", "28"),
    new Subscription(6, "60gb", "2year", "38"),
    new Subscription(7, "80gb", "2year", "48"),
  };

  public Subscription[] getSubscriptions() {
    return this.subscriptions;
  }
}
