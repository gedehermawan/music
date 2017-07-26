package com.syeftipay.api.account.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration("syeftipay.api.account.v1.security.SecurityConfig")
public class SecurityConfig extends WebSecurityConfigurerAdapter {

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.antMatcher("/account/v1/**")
        .csrf().disable()
        .authorizeRequests()
        .antMatchers("/account/v1/**").permitAll()
        .anyRequest().authenticated();
  }
}