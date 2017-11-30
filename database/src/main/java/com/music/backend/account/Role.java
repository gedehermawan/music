package com.music.backend.account;


public enum Role {
  EVENT_ORGANIZER("Event Organizer"),
  TALENT("Talent");

  private String name;

  Role(String name) {
    this.name = name;
  }

  public String getName() { return name; }
}
