package com.royalmobile.controllers;

import com.royalmobile.api.ApiResponse;
import com.royalmobile.api.CustomErrorApi;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomErrorController implements ErrorController, CustomErrorApi {

  public String getError() {
    return ApiResponse.error("This API route does not exist.");
  }

  @Override
  public String getErrorPath() {
    return null;
  }
}
