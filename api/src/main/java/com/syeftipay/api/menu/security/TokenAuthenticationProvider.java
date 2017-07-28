package com.syeftipay.api.menu.security;

import com.syeftipay.backend.domain.account.Account;
import com.syeftipay.backend.service.account.AccountService;
import com.syeftipay.backend.service.accountAuthToken.AccountAuthTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

@Component
public class TokenAuthenticationProvider implements AuthenticationProvider {
  @Autowired
  private AccountAuthTokenService tokenService;

  @Autowired
  private AccountService accountService;

  @Override
  public Authentication authenticate(Authentication authentication) throws AuthenticationException {
    AuthenticatedUser auth = (AuthenticatedUser) authentication;
    String userId = auth.getUserId();
    String token = auth.getToken();
    long id;

    try {
      id = Long.parseLong(userId);
    } catch (NumberFormatException e) {
      throw new BadCredentialsException("Invalid accountId");
    }

    if (tokenService.isValidToken(id,token))
      throw new BadCredentialsException("Invalid accountId or token");

    Account account = accountService.findById(id);
    if (account == null)
      throw new BadCredentialsException("Invalid accountId");

    tokenService.usedToken(id, token);
    return new AuthenticatedUser(userId, token);
  }

  @Override
  public boolean supports(Class<?> authentication) {
    return AuthenticatedUser.class.equals(authentication);
  }
}
