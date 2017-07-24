package com.syeftipay.backend.user;

public class AccountAlreadyExistException extends RuntimeException {
  public AccountAlreadyExistException(String message) {
    super(message);
  }
}
