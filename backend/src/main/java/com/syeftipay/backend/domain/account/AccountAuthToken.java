package com.syeftipay.backend.domain.account;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "account_auth_token",
        uniqueConstraints=
        @UniqueConstraint(columnNames={"account_id", "token"}))
public class AccountAuthToken {
  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  @Column(name="account_auth_id")
  private long id;

  @Column(name = "account_id")
  private long accountId;

  @Column(name = "token")
  private String token;

  @Column(name = "create_at")
  private Date createAt;

  @Column(name = "last_used")
  private Date lastUsed;

  public AccountAuthToken() {
  }

  public AccountAuthToken(long accountId, String token) {
    this.accountId = accountId;
    this.token = token;
    this.createAt = new Date();
    this.lastUsed = createAt;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
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

  public Date getCreateAt() {
    return createAt;
  }

  public void setCreateAt(Date createAt) {
    this.createAt = createAt;
  }

  public Date getLastUsed() {
    return lastUsed;
  }

  public void setLastUsed(Date lastUsed) {
    this.lastUsed = lastUsed;
  }
}
