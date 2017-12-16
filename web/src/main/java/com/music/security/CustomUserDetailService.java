package com.music.security;

import com.music.service.account.AccountService;
import com.music.service.account.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service("customUserDetailsService")
public class CustomUserDetailService implements UserDetailsService {
  @Autowired
  private final AccountService accountService;

  public CustomUserDetailService(AccountService accountService) {
    this.accountService = accountService;
  }
  private CustomUserDetailService() {this(null);}

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    User user = accountService.findByEmail(username);
    if (user == null) {
      throw new UsernameNotFoundException("No user present with email: " + username);
    }
    else {
      return new CustomUserDetails(user);
    }
  }
}
