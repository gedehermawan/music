package com.music.service.eventorganizer;


public class EventOrganizerNotFoundException extends RuntimeException{
  public EventOrganizerNotFoundException(String email) {
    super("Account with email "+email+" is not registered");
  }
}
