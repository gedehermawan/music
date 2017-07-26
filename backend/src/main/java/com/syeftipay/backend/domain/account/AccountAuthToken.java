package com.syeftipay.backend.domain.account;

import javax.persistence.*;
import java.util.Calendar;
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

  @Column(name = "expired_at")
  private Date expiredAt;

  public AccountAuthToken() {
  }

  public AccountAuthToken(long accountId, String token) {
    this.accountId = accountId;
    this.token = token;
    this.createAt = new Date();
    this.expiredAt = addMinutes(createAt,30);
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

  public Date getExpiredAt() {
    return expiredAt;
  }

  public void setExpiredAt(Date expiredAt) {
    this.expiredAt = expiredAt;
  }

  private Date addMinutes(Date currentDate, int minute){
    Calendar cal = Calendar.getInstance();
    cal.setTime(currentDate);
    cal.add(Calendar.MINUTE, 10);
    return cal.getTime();
  }
}
