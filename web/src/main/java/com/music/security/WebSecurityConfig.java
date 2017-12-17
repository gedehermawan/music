package com.music.security;


import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http
        .csrf().disable()
        .authorizeRequests()
        .antMatchers("/res/**").permitAll()
        .antMatchers("/login/**").permitAll()
        .antMatchers("/eo/register").permitAll()
        .antMatchers("/talent/**").permitAll()
        .antMatchers("/home").permitAll()
        .antMatchers("/").permitAll()
        .anyRequest().authenticated()
        .and()
        .exceptionHandling().accessDeniedPage("/access-denied")
        .and()
        .formLogin()
        .loginPage("/login")
        .usernameParameter("email")
        .passwordParameter("password")
        .defaultSuccessUrl("/home")
        .permitAll()
        .successHandler(authenticationSuccessHandler())
        .and()
        .logout()
        .logoutUrl("/logout")
        .logoutSuccessUrl("/home");
  }

  @Bean(name = "passwordEncoder")
  public PasswordEncoder passwordencoder() {
    return new BCryptPasswordEncoder();
  }

  @Bean
  public AuthenticationSuccessHandler authenticationSuccessHandler() {
    return new ProcessAuthSuccess();
  }
}
