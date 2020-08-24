package com.royalmobile.controllers;

import com.royalmobile.models.Subscription;
import com.royalmobile.models.SubscriptionsModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubscriptionsController {

  private SubscriptionsModel subscriptionsModel = new SubscriptionsModel();

  @GetMapping("/api/subscriptions")
  public Subscription getSubscriptions() {
    return this.subscriptionsModel.getSubscriptions();
  }
}
