package com.royalmobile.api;

import org.springframework.web.bind.annotation.GetMapping;

public interface MainApi {
  @GetMapping(value = "/", produces = { "application/json" })
  String getIndex();
}
