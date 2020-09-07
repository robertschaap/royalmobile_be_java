package com.royalmobile.controllers;

import com.royalmobile.ApiResponse;
import com.royalmobile.api.MainApi;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController implements MainApi {

  // TODO: redirect this or other routes to some sort of fallback
  public String getIndex() {
    return ApiResponse.success("Hello World");
  }
}
