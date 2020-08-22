package com.royalmobile;

enum ApiResponseStatus {
  SUCCESS("success"),
  ERROR("error");

  final private String status;

  ApiResponseStatus(String status) {
    this.status = status;
  }

  public String toString() {
    return status;
  }
}

public class ApiResponse {

  private final String data;
  private final String message;
  private final ApiResponseStatus status;

  public ApiResponse(ApiResponseStatus status, String message, String data) {
    this.data = data;
    this.message = message;
    this.status = status;
  }

  public String getData() {
    return this.data;
  }

  public String getMessage() {
    return this.message;
  }

  public ApiResponseStatus getStatus() {
    return this.status;
  }

  public static ApiResponse success(String data) {
    return new ApiResponse(ApiResponseStatus.SUCCESS, null, data);
  }

  public static ApiResponse error(String errorMessage) {
    return new ApiResponse(ApiResponseStatus.ERROR, errorMessage, null);
  }
}
