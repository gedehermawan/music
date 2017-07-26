package com.syeftipay.api.handler;


public class JsonErrorResponse {
  private int code;
  private String message;

  public JsonErrorResponse() {
  }

  public JsonErrorResponse(int code, String message) {
    this.code = code;
    this.message = message;
  }

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
