package com.syeftipay.backend.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService{
  @Autowired
  UserRepository userRepository;

  @Override
  public User findByEmail(String email) {
    User user = userRepository.findByEmail(email);
    if(user == null){
      throw new UserNotFoundException("user with email "+email+" is not found");
    }
    return user;
  }

  @Override
  public User register(User user) {
    User newUser = userRepository.findByEmail(user.getEmail());
    if(newUser == null){
      throw new UserAlreadyExistException("User with email "+user.getEmail()+" is already exists");
    }

    //TODO : bcyrpt password
    //user.setPassword(BCrypt.hashpw(password, BCrypt.gensalt()));

    return userRepository.save(user);
  }
}
