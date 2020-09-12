package com.royalmobile.models;

public class SubscriptionFactory {
  private final String BASE_ID = "royalmobile";

  public Subscription createSubscription(Integer id, String data, String durationId, String price) {
    String subscriptionId = this.createSubscriptionId(data, durationId);

    return new Subscription(id, subscriptionId, data, durationId, price);
  }

  private String createSubscriptionId(String data, String durationId) {
    return this.BASE_ID + "-" + data + "-" + durationId;
  }
}
