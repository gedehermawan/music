package com.music.service.eventorganizer;


public class InvalidPasswordException extends RuntimeException {
  public InvalidPasswordException() {
    super("Invalid password");
  }
}
