package com.royalmobile.models;

import com.royalmobile.db.Connection;

public class SubscriptionsModel {

  private Subscription[] subscriptions = Connection.subscriptions();

  public Subscription[] getSubscriptions() {
    return this.subscriptions;
  }

  public Subscription getSubscriptionById(String subscriptionId) throws Exception {
    for (Subscription subscription : this.subscriptions) {
      if (subscription.getSubscriptionId().equals(subscriptionId)) {
        return subscription;
      }
    }

    throw new Exception("Not Found");
  }
}
