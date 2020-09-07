package com.royalmobile.api;

import org.springframework.web.bind.annotation.GetMapping;

public interface SubscriptionsApi {
  @GetMapping(value = "/api/subscriptions", produces = { "application/json" })
  String getSubscriptions();
}
