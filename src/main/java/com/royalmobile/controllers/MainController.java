package com.royalmobile.controllers;

import com.royalmobile.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

  @GetMapping(value = "/", produces = { "application/json" })
  public String getIndex() {
    return ApiResponse.success("Hello World");
  }
}
