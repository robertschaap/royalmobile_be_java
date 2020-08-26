package com.royalmobile.models;

public class Subscription {

  // Prevents GSON from exposing this, however consider
  // splitting into a factory and a separate pojo
  private transient final String BASE_ID = "royalmobile";

  private Integer id;
  private String subscriptionId;
  private String durationId;
  private String data;
  private String[] benefits_long = { "unlimited calls", "unlimited texts", "unlimited roaming" };
  private String benefits_short = "unlimited\n calls, texts, roaming";
  private String regular_price;

  // TODO: this works for now but bleeds our fake db logic into the
  // actual class which should be a POJO, split them somehow
  public Subscription(Integer id, String data, String durationId, String price) {
    this.id = id;
    this.data = data;
    this.durationId = durationId;
    this.subscriptionId = this.createSubscriptionId(data, durationId);
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

  private String createSubscriptionId(String data, String durationId) {
    return this.BASE_ID + "-" + data + "-" + durationId;
  }
}
