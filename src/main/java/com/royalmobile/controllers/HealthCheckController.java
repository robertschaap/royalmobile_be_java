package com.royalmobile.controllers;

import com.royalmobile.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

  /**
   * @return ApiResponse if the application is running
   */
  @GetMapping(value = "/healthcheck", produces = { "application/json" })
  public String getHealthCheck() {
    return ApiResponse.success("Application is up and running");
  }
}
