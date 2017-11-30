package com.music.service.eventorganizer;


import com.music.backend.account.Role;
import com.music.backend.eventorganizer.EventOrganizer;
import com.music.backend.eventorganizer.EventOrganizerRepository;
import com.music.service.account.AccountService;
import com.music.service.account.AddAccountRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventOrganizerServiceImpl implements EventOrganizerService {
  @Autowired
  EventOrganizerRepository eventOrganizerRepository;

  @Autowired
  AccountService accountService;

  @Override
  public EventOrganizer add(AddEventOrganizerRequest request) {
    EventOrganizer eventOrganizer = new EventOrganizer();
    eventOrganizer.setName(request.getName());
    eventOrganizer.setPhone(request.getPhone());
    eventOrganizerRepository.save(eventOrganizer);

    accountService.createAccount(createRequest(request,eventOrganizer.getEventOrganizerId()));
    return eventOrganizer;
  }

  public AddAccountRequest createRequest(AddEventOrganizerRequest request, long id){
    AddAccountRequest addAccountRequest = new AddAccountRequest();
    addAccountRequest.setEmail(request.getEmail());
    addAccountRequest.setPassword(request.getPassword());
    addAccountRequest.setRole(Role.EVENT_ORGANIZER);
    addAccountRequest.setObjectId(id);
    return addAccountRequest;
  }
}
