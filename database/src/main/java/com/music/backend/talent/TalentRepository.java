package com.music.backend.talent;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TalentRepository extends JpaRepository<Talent, Long> {
  List<Talent> findAllByDeleted(char deleted);
}