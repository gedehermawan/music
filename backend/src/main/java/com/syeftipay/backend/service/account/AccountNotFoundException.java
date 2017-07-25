package com.syeftipay.backend.service.account;


public class AccountNotFoundException extends RuntimeException{
  public AccountNotFoundException(String message) {
    super(message);
  }
}
