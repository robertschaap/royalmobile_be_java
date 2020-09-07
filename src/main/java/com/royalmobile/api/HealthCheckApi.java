package com.royalmobile.api;

import org.springframework.web.bind.annotation.GetMapping;

public interface HealthCheckApi {
  @GetMapping(value = "/healthcheck", produces = { "application/json" })
  public String getHealthCheck();
}
