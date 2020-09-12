package com.royalmobile.db;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.royalmobile.models.Subscription;
import com.royalmobile.models.SubscriptionFactory;

public class SubscriptionsTable {

  private List<Subscription> subscriptions = new ArrayList<Subscription>();

  public SubscriptionsTable() {
    SubscriptionFactory factory = new SubscriptionFactory();

    this.subscriptions.add(factory.createSubscription(0, "20gb", "1year", "20"));
    this.subscriptions.add(factory.createSubscription(1, "40gb", "1year", "30"));
    this.subscriptions.add(factory.createSubscription(2, "60gb", "1year", "40"));
    this.subscriptions.add(factory.createSubscription(3, "80gb", "1year", "50"));
    this.subscriptions.add(factory.createSubscription(4, "20gb", "2year", "18"));
    this.subscriptions.add(factory.createSubscription(5, "40gb", "2year", "28"));
    this.subscriptions.add(factory.createSubscription(6, "60gb", "2year", "38"));
    this.subscriptions.add(factory.createSubscription(7, "80gb", "2year", "48"));
  }

  public List<Subscription> getSubscriptions() {
    return this.subscriptions;
  }

  public Optional<Subscription> getSubScriptionById(String subscriptionId) {
    for (Subscription subscription : this.subscriptions) {
      if (subscription.getSubscriptionId().equals(subscriptionId)) {
        return Optional.of(subscription);
      }
    }

    return Optional.empty();
  }
}
