package com.music.service.eventorganizer;

import com.music.backend.domain.account.EventOrganizer;
import com.music.backend.repository.EventOrganizerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;


@Service
public class EventOrganizerServiceImpl implements EventOrganizerService {
  @Autowired
  EventOrganizerRepository eventOrganizerRepository;

  @Override
  public EventOrganizer findByEmail(String email) {
    EventOrganizer eventOrganizer = eventOrganizerRepository.findByEmail(email);
    if(eventOrganizer == null){
      throw new EventOrganizerNotFoundException(email);
    }
    return eventOrganizer;
  }

  @Override
  public EventOrganizer register(EventOrganizer eventOrganizer) {
    EventOrganizer newEventOrganizer = eventOrganizerRepository.findByEmail(eventOrganizer.getEmail());
    if(newEventOrganizer != null){
      throw new EventOrganizerAlreadyExistException("User with email "+ eventOrganizer.getEmail()+" is already exists");
    }
    eventOrganizer.setPassword(BCrypt.hashpw(eventOrganizer.getPassword(), BCrypt.gensalt()));
    return eventOrganizerRepository.save(eventOrganizer);
  }

  @Override
  public EventOrganizer findById(long id) {
    return eventOrganizerRepository.findOne(id);
  }

  @Override
  public EventOrganizer login(String name, String password) {
    return null;
  }
}
