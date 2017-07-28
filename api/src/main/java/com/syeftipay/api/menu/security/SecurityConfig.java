package com.syeftipay.api.menu.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;


@Configuration("syeftipay.api.menu.v1.security.SecurityConfig")
@Order(101)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
  @Autowired
  private AuthenticationFilter filter;

  @Autowired
  private TokenAuthenticationProvider provider;

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.antMatcher("/menu/v1/**")
        .csrf().disable()
        .addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class)
        .authorizeRequests()
        .antMatchers("/menu/v1/ping").permitAll()
        .anyRequest().authenticated();
  }

  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    auth.authenticationProvider(provider);
  }

  @Bean
  public FilterRegistrationBean registerPharmacyAuthenticationFilter(AuthenticationFilter filter) {
    FilterRegistrationBean registration = new FilterRegistrationBean(filter);
    registration.setEnabled(false);
    return registration;
  }
}