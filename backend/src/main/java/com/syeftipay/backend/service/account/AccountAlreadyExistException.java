package com.syeftipay.backend.service.account;

public class AccountAlreadyExistException extends RuntimeException {
  public AccountAlreadyExistException(String message) {
    super(message);
  }
}
