package com.music.backend.eventorganizer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface EventOrganizerRepository extends JpaRepository<EventOrganizer, Long> {
  
}
