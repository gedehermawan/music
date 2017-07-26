package com.syeftipay.api.account.api.v1;

public class Account {
  private long accountId;
  private String email;

  public Account() {
  }

  public long getAccountId() {
    return accountId;
  }

  public void setAccountId(long accountId) {
    this.accountId = accountId;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
