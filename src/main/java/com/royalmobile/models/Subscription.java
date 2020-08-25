package com.royalmobile.models;

public class Subscription {

  // Prevents GSON from exposing this, however consider
  // splitting into a factory and a separate pojo
  private transient final String BASE_ID = "royalmobile";

  private int id = 0;
  private String subscriptionId;
  private String durationId;
  private String data;
  private String[] benefits_long = { "unlimited calls", "unlimited texts", "unlimited roaming" };
  private String benefits_short = "unlimited\n calls, texts, roaming";
  private String regular_price;

  public Subscription(String data, String durationId, String price) {
    this.data = data;
    this.durationId = durationId;
    this.subscriptionId = this.createSubscriptionId(data, durationId);
    this.regular_price = price;
  }

  private String createSubscriptionId(String data, String durationId) {
    return this.BASE_ID + "-" + data + "-" + durationId;
  }
}
