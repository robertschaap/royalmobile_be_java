package com.royalmobile;

import com.google.gson.Gson;

enum ApiResponseStatus {
  SUCCESS("success"),
  ERROR("error");

  final private String status;

  ApiResponseStatus(String status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return this.status;
  }
}

public class ApiResponse {

  private final Object data;
  private final String message;
  private final String status;

  public ApiResponse(ApiResponseStatus status, String message, Object data) {
    this.data = data;
    this.message = message;
    this.status = status.toString();
  }

  public Object getData() {
    return this.data;
  }

  public String getMessage() {
    return this.message;
  }

  public String getStatus() {
    return this.status;
  }

  private String toJson() {
    return new Gson().toJson(this);
  }

  public static String success(Object data) {
    return new ApiResponse(ApiResponseStatus.SUCCESS, null, data).toJson();
  }

  public static String error(String errorMessage) {
    return new ApiResponse(ApiResponseStatus.ERROR, errorMessage, null).toJson();
  }
}
