package com.music.service.talent;

import com.music.backend.account.Role;
import com.music.backend.talent.Talent;
import com.music.backend.talent.TalentRepository;
import com.music.service.account.AccountService;
import com.music.service.account.AddAccountRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TalentServiceImpl implements TalentService{
  @Autowired
  TalentRepository talentRepository;

  @Autowired
  AccountService accountService;

  @Override
  public Talent add(AddTalentRequest request) {
    Talent talent = new Talent();
    talent.setName(request.getName());
    talent.setPrice1(request.getPrice1());
    talent.setPrice2(request.getPrice2());
    talent.setLocation(request.getLocation());
    talent.setPhone(request.getPhone());
    talent.setVideoLink(request.getVideoLink());
    talent.setGenre(request.getGenre());
    talentRepository.save(talent);

    accountService.createAccount(createRequest(request,talent.getTalentId()));
    return talent;
  }

  @Override
  public List<Talent> findAll() {
    return talentRepository.findAllByDeleted('0');
  }

  @Override
  public Talent findById(long id) {
    return talentRepository.findOne(id);
  }

  public AddAccountRequest createRequest(AddTalentRequest request, long id){
    AddAccountRequest addAccountRequest = new AddAccountRequest();
    addAccountRequest.setEmail(request.getEmail());
    addAccountRequest.setPassword("123456");
    addAccountRequest.setRole(Role.TALENT);
    addAccountRequest.setObjectId(id);
    return addAccountRequest;
  }
}
