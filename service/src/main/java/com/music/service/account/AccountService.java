package com.music.service.account;


import com.music.backend.account.Account;

public interface AccountService {
  Account createAccount(AddAccountRequest request);
  User findByEmail(String email);
}
