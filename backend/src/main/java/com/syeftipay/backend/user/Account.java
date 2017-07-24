package com.syeftipay.backend.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "account")
public class Account {
  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  @Column(name="account_id")
  long accountId;

  @Column(name = "email")
  String email;

  @JsonIgnore
  @Column(name = "password")
  String password;

  @Enumerated(EnumType.STRING)
  @Column(name = "role")
  Role role;

  @Column(name = "create_at")
  Date createAt;

  @Column(name = "update_at")
  Date updateAt;

  @Column(name = "deleted")
  char deleted;

  @ManyToOne
  @JoinColumn(name = "create_by")
  Account createBy;

  @ManyToOne
  @JoinColumn(name = "update_by")
  Account updateBy;

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

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Date getCreateAt() {
    return createAt;
  }

  public void setCreateAt(Date createAt) {
    this.createAt = createAt;
  }

  public Date getUpdateAt() {
    return updateAt;
  }

  public void setUpdateAt(Date updateAt) {
    this.updateAt = updateAt;
  }

  public Role getRole() {
    return role;
  }

  public void setRole(Role role) {
    this.role = role;
  }

  public char getDeleted() {
    return deleted;
  }

  public void setDeleted(char deleted) {
    this.deleted = deleted;
  }

  public Account getCreateBy() {
    return createBy;
  }

  public void setCreateBy(Account createBy) {
    this.createBy = createBy;
  }

  public Account getUpdateBy() {
    return updateBy;
  }

  public void setUpdateBy(Account updateBy) {
    this.updateBy = updateBy;
  }
}
