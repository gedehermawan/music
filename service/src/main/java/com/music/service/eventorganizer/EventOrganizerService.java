package com.music.service.eventorganizer;


import com.music.backend.domain.account.EventOrganizer;

public interface EventOrganizerService {
  EventOrganizer findByEmail(String email);
  EventOrganizer register(EventOrganizer eventOrganizer);
  EventOrganizer findById(long id);
  EventOrganizer login(String name, String password);
}
