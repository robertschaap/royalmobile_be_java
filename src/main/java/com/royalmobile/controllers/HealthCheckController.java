package com.royalmobile.controllers;

import com.royalmobile.ApiResponse;
import com.royalmobile.api.HealthCheckApi;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController implements HealthCheckApi {

  /**
   * @return ApiResponse if the application is running
   */
  public String getHealthCheck() {
    return ApiResponse.success("Application is up and running");
  }
}
