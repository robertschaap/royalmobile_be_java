package com.royalmobile.controllers;

import com.royalmobile.api.ApiResponse;
import com.royalmobile.api.SubscriptionsApi;
import com.royalmobile.models.SubscriptionsModel;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubscriptionsController implements SubscriptionsApi {

  private SubscriptionsModel subscriptionsModel = new SubscriptionsModel();

  /**
   * @return ApiResponse of Subscription list or empty list
   */
  public String getSubscriptions() {
    return ApiResponse.success(
      this.subscriptionsModel.getSubscriptions()
    );
  }
}
