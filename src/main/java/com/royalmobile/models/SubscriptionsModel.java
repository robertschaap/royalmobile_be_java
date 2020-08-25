package com.royalmobile.models;

import java.util.ArrayList;
import java.util.List;

public class SubscriptionsModel {

  private List<Subscription> subscriptions = new ArrayList<Subscription>();

  public SubscriptionsModel() {
    Subscription subscription = new Subscription("20gb", "1year", "20");
    this.subscriptions.add(subscription);
  }

  public List<Subscription> getSubscriptions() {
    return this.subscriptions;
  }
}
