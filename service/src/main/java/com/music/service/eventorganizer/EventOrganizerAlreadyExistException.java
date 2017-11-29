package com.music.service.eventorganizer;

public class EventOrganizerAlreadyExistException extends RuntimeException {
  public EventOrganizerAlreadyExistException(String message) {
    super(message);
  }
}
