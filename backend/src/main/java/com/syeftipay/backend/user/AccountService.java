package com.syeftipay.backend.user;


public interface AccountService {
  Account findByEmail(String email);
  Account register(Account account);
}
