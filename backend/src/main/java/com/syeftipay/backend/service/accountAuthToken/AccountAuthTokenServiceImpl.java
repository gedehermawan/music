package com.syeftipay.backend.service.accountAuthToken;

import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;
import com.syeftipay.backend.domain.account.Account;
import com.syeftipay.backend.domain.account.AccountAuthToken;
import com.syeftipay.backend.repository.AccountAuthTokenRepository;
import com.syeftipay.backend.repository.AccountRepository;
import com.syeftipay.backend.service.account.AccountNotFoundException;
import com.syeftipay.backend.service.account.InvalidPasswordException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.util.UUID;

@Service
public class AccountAuthTokenServiceImpl implements AccountAuthTokenService{
  @Autowired
  private AccountAuthTokenRepository repository;

  @Autowired
  private AccountRepository accountRepository;

  private final HashFunction sha1 = Hashing.sha1();

  @Override
  public AccountAuthInfo login(String email, String password) {
    PasswordEncoder encoder = new BCryptPasswordEncoder();
    Account verifiedAccount = accountRepository.findByEmail(email);

    if(verifiedAccount == null){
      throw new AccountNotFoundException(email);
    }

    if(!encoder.matches(password,verifiedAccount.getPassword())){
      throw new InvalidPasswordException();
    }

    //insert token to database
    String token = UUID.randomUUID().toString();
    repository.save(new AccountAuthToken(verifiedAccount.getAccountId(),hashToken(token)));

    return new AccountAuthInfo(verifiedAccount.getAccountId(),token);
  }

  private String hashToken(String token) {
    HashCode hash = sha1.hashString(token, StandardCharsets.US_ASCII);
    return hash.toString();
  }
}
