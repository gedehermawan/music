package com.syeftipay.backend.service.accountAuthToken;


public interface AccountAuthTokenService {
  AccountAuthInfo login(String email, String password);
}
