package com.music.backend.repository;

import com.music.backend.domain.account.EventOrganizer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface EventOrganizerRepository extends JpaRepository<EventOrganizer, Long> {
  EventOrganizer findByEmailAndPassword(@Param("email")String email, @Param("password")String password);
  EventOrganizer findByEmail(@Param("email")String email);
}
