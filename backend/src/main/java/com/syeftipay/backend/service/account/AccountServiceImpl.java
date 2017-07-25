package com.syeftipay.backend.service.account;

import com.syeftipay.backend.domain.account.Account;
import com.syeftipay.backend.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AccountServiceImpl implements AccountService {
  @Autowired
  AccountRepository accountRepository;

  @Override
  public Account findByEmail(String email) {
    Account account = accountRepository.findByEmail(email);
    if(account == null){
      throw new AccountNotFoundException("account with email "+email+" is not found");
    }
    return account;
  }

  @Override
  public Account register(Account account) {
    Account newAccount = accountRepository.findByEmail(account.getEmail());
    if(newAccount == null){
      throw new AccountAlreadyExistException("User with email "+ account.getEmail()+" is already exists");
    }

    //TODO : bcyrpt password
    //account.setPassword(BCrypt.hashpw(password, BCrypt.gensalt()));

    return accountRepository.save(account);
  }
}
