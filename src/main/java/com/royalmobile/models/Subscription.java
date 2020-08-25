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

  public Subscription(String data, String durationId) {
    this.data = data;
    this.durationId = durationId;
    this.subscriptionId = this.createSubscriptionId(data, durationId);
  }

  private String createSubscriptionId(String data, String durationId) {
    return this.BASE_ID + "-" + "20gb" + "-" + "1year";
  }
}
