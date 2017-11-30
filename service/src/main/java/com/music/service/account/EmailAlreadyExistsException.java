package com.music.service.account;


public class EmailAlreadyExistsException extends RuntimeException {
  public EmailAlreadyExistsException(String email) {
    super("Akun dengan email "+email+" telah terdaftar");
  }
}
