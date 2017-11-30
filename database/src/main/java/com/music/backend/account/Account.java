package com.music.backend.account;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "account")
public class Account {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "account_id_seq")
  @SequenceGenerator(name = "account_id_seq", sequenceName = "account_id_seq", allocationSize=1)
  @Column(name="account_id")
  long accountId;

  @Column(name = "email")
  String email;

  @JsonIgnore
  @Column(name = "password")
  String password;

  @Enumerated(EnumType.STRING)
  @Column(name = "role")
  private Role role;

  @Column(name = "object_id")
  private long objectId;

  @Column(name = "deleted")
  char deleted;

  @Column(name = "create_at")
  Date createAt;

  @Column(name = "update_at")
  Date updateAt;

  public Account() {
    this.deleted = '0';
    this.createAt = new Date();
    this.updateAt = createAt;
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

  public Role getRole() {
    return role;
  }

  public void setRole(Role role) {
    this.role = role;
  }

  public long getObjectId() {
    return objectId;
  }

  public void setObjectId(long objectId) {
    this.objectId = objectId;
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

  public char getDeleted() {
    return deleted;
  }

  public void setDeleted(char deleted) {
    this.deleted = deleted;
  }
}
