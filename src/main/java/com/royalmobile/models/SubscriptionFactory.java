package com.royalmobile.models;

public class SubscriptionFactory {
  public Subscription createSubscription(Integer id, String data, String durationId, String price) {
    return new Subscription(id, data, durationId, price);
  }
}
