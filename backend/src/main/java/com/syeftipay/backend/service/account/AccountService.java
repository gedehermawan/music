package com.syeftipay.backend.service.account;


import com.syeftipay.backend.domain.account.Account;

public interface AccountService {
  Account findByEmail(String email);
  Account register(Account account);
}
