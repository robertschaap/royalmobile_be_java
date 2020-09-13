package com.royalmobile.db;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.royalmobile.models.Subscription;
import com.royalmobile.models.SubscriptionFactory;

public class SubscriptionsTable {

  private Integer nextSubscriptionId = 0;

  private List<Subscription> subscriptions = new ArrayList<Subscription>();

  public SubscriptionsTable() {
    this.seedSubscriptionsTable();
  }

  public void seedSubscriptionsTable() {
    SubscriptionFactory factory = new SubscriptionFactory();

    this.subscriptions.add(factory.createSubscription(nextSubscriptionId++, "20gb", "1year", "20"));
    this.subscriptions.add(factory.createSubscription(nextSubscriptionId++, "40gb", "1year", "30"));
    this.subscriptions.add(factory.createSubscription(nextSubscriptionId++, "60gb", "1year", "40"));
    this.subscriptions.add(factory.createSubscription(nextSubscriptionId++, "80gb", "1year", "50"));
    this.subscriptions.add(factory.createSubscription(nextSubscriptionId++, "20gb", "2year", "18"));
    this.subscriptions.add(factory.createSubscription(nextSubscriptionId++, "40gb", "2year", "28"));
    this.subscriptions.add(factory.createSubscription(nextSubscriptionId++, "60gb", "2year", "38"));
    this.subscriptions.add(factory.createSubscription(nextSubscriptionId++, "80gb", "2year", "48"));
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
