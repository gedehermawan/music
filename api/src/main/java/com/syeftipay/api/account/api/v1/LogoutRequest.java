package com.syeftipay.api.account.api.v1;


public class LogoutRequest {
  private long accountId;
  private String token;

  public LogoutRequest() {
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
