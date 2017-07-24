package com.peentar.syeftipay.backend.user;


public interface UserService {
  User findByEmail(String email);
  User register(User user);
}
