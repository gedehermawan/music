package com.music.security;

import com.music.service.account.User;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Component
public class ProcessAuthSuccess extends SimpleUrlAuthenticationSuccessHandler {
  @Override
  public void onAuthenticationSuccess(final HttpServletRequest request, final HttpServletResponse response, Authentication authentication) throws IOException,
      ServletException {
    HttpSession session = request.getSession();
    User user = null;

    //get user based on login
    if(authentication instanceof UsernamePasswordAuthenticationToken){
      CustomUserDetails customUserDetail = (CustomUserDetails) authentication.getPrincipal();
      user = customUserDetail.getAccount();
    }

    if(user != null) {
      session.setAttribute("user",user);
      response.sendRedirect("/home");
    }

    super.onAuthenticationSuccess(request, response, authentication);
  }
}

