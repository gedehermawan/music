package com.music.service.talent;


import com.music.backend.talent.Talent;

import java.util.List;

public interface TalentService {
  Talent add(AddTalentRequest request);
  List<Talent> findAll();
  Talent findById(long id);
}
