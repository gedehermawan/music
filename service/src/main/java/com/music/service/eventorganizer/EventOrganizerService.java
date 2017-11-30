package com.music.service.eventorganizer;


import com.music.backend.eventorganizer.EventOrganizer;

public interface EventOrganizerService {
  EventOrganizer add(AddEventOrganizerRequest request);
}
