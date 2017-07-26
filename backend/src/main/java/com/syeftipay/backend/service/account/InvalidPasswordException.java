package com.syeftipay.backend.service.account;


public class InvalidPasswordException extends RuntimeException {
  public InvalidPasswordException() {
    super("Invalid password");
  }
}
