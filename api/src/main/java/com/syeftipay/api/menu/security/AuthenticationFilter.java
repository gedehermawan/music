package com.syeftipay.api.menu.security;

import org.springframework.http.HttpHeaders;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class AuthenticationFilter extends OncePerRequestFilter {
  private final AuthorizationParser parser = new AuthorizationParser();

  @Override
  protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
    String value = request.getHeader(HttpHeaders.AUTHORIZATION);
    Authentication auth = null;

    if (value != null)
      auth = parseAuthorization(value);

    SecurityContextHolder.getContext().setAuthentication(auth);
    filterChain.doFilter(request, response);
  }

  private Authentication parseAuthorization(String value) {
    AuthorizationParser.Result result = parser.parse(value);
    if (result == null)
      return null;

    return new AuthenticatedUser(result.getAccountId(), result.getToken());
  }
}
