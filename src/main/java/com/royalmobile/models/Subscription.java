package com.royalmobile.models;

public class Subscription {

  private final Integer id;
  private final String subscriptionId;
  private final String durationId;
  private final String data;
  private final String[] benefits_long = { "unlimited calls", "unlimited texts", "unlimited roaming" };
  private final String benefits_short = "unlimited\n calls, texts, roaming";
  private final String regular_price;

  public Subscription(Integer id, String subscriptionId, String data, String durationId, String price) {
    this.id = id;
    this.data = data;
    this.durationId = durationId;
    this.subscriptionId = subscriptionId;
    this.regular_price = price;
  }

  public Integer getId() {
    return this.id;
  }

  public String getSubscriptionId() {
    return this.subscriptionId;
  }

  public String getDurationId() {
    return this.durationId;
  }

  public String getData() {
    return this.data;
  }

  public String[] getBenefits_long() {
    return this.benefits_long;
  }

  public String getBenefits_short() {
    return this.benefits_short;
  }

  public String getRegular_price() {
    return this.regular_price;
  }
}
