package com.royalmobile.models;

/**
  {
    "id": 1,
    "subscriptionId": "royalmobile-20gb-1year",
    "durationId": "1year",
    "data": "20gb",
    "benefits_long": [
      "unlimited calls",
      "unlimited texts",
      "unlimited roaming"
    ],
    "benefits_short": "unlimited\n calls, texts, roaming",
    "regular_price": "20"
  },
 */
public class Subscription {

  private final String BASE_ID = "royalmobile";

  private Integer id = 0;
  private String subscriptionId;
  private String durationId;
  private String data;

  public Subscription(String data, String durationId) {
    this.data = data;
    this.durationId = durationId;
    this.subscriptionId = this.createSubscriptionId(data, durationId);
  }

  public String createSubscriptionId(String data, String durationId) {
    return this.BASE_ID + "-" + "20gb" + "-" + "1year";
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
}
