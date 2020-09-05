package com.royalmobile.models;

import com.royalmobile.db.Connection;

public class SubscriptionsModel {

  public Subscription[] getSubscriptions() {
    return Connection.subscriptions.getSubscriptions();
  }

  public Subscription getSubscriptionById(String subscriptionId) throws Exception {
    return Connection.subscriptions.getSubScriptionById(subscriptionId).get();
  }
}
