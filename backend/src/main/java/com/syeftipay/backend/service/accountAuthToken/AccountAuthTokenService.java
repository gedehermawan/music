package com.syeftipay.backend.service.accountAuthToken;


public interface AccountAuthTokenService {
  AccountAuthInfo login(String email, String password);

  void logout(long accountId, String token);

  boolean isValidToken(long accountId, String token);

  void usedToken(long accountId, String token);
}
