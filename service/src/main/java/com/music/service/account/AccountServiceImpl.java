package com.music.service.account;

import com.music.backend.account.Account;
import com.music.backend.account.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService{
  @Autowired
  AccountRepository accountRepository;

  @Override
  public Account createAccount(AddAccountRequest request) {
    if(accountRepository.findByEmailIgnoreCase(request.getEmail()) != null){
      throw new EmailAlreadyExistsException(request.getEmail());
    }

    Account account = new Account();
    account.setEmail(request.getEmail());
    account.setPassword(BCrypt.hashpw(request.getPassword(), BCrypt.gensalt()));
    account.setRole(request.getRole());
    account.setObjectId(request.getObjectId());
    return accountRepository.save(account);
  }
}
