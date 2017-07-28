package com.syeftipay.backend.service.accountAuthToken;


public interface AccountAuthTokenService {
  AccountAuthInfo login(String email, String password);
  void logout(long accountId, String token);
}
