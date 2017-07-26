package com.syeftipay.backend.service.accountAuthToken;


public class AccountAuthInfo {
  private long accountId;
  private String token;

  public AccountAuthInfo() {
  }

  public AccountAuthInfo(long accountId, String token) {
    this.accountId = accountId;
    this.token = token;
  }

  public long getAccountId() {
    return accountId;
  }

  public void setAccountId(long accountId) {
    this.accountId = accountId;
  }

  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }
}
