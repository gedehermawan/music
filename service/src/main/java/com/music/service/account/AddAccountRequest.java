package com.music.service.account;


import com.music.backend.account.Role;

public class AddAccountRequest {
  private String email;
  private String password;
  private Role role;
  private long objectId;

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
}
