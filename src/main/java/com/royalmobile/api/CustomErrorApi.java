package com.royalmobile.api;

import org.springframework.web.bind.annotation.RequestMapping;

public interface CustomErrorApi {
  @RequestMapping(value = "/error", produces = { "application/json" })
  public String getError();
}
