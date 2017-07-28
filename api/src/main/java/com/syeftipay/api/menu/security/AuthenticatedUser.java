package com.syeftipay.api.menu.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Collection;
import java.util.Collections;


public class AuthenticatedUser implements Authentication {

  private String userId;
  private String token;

  public AuthenticatedUser(String userId, String token) {
    this.userId = userId;
    this.token = token;
  }

  public String getUserId() {
    return userId;
  }

  public String getToken() {
    return token;
  }

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    SimpleGrantedAuthority authority = new SimpleGrantedAuthority("ROLE_USER");
    return Collections.singletonList(authority);
  }

  @Override
  public Object getCredentials() {
    return this.token;
  }

  @Override
  public Object getDetails() {
    return null;
  }

  @Override
  public Object getPrincipal() {
    return this.userId;
  }

  @Override
  public boolean isAuthenticated() {
    return true;
  }

  @Override
  public void setAuthenticated(boolean isAuthenticated) throws IllegalArgumentException {

  }

  @Override
  public String getName() {
    return "Authenticated user";
  }
}
