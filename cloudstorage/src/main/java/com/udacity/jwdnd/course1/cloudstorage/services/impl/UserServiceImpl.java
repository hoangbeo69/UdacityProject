package com.udacity.jwdnd.course1.cloudstorage.services.impl;

import com.udacity.jwdnd.course1.cloudstorage.mapper.UserMapper;
import com.udacity.jwdnd.course1.cloudstorage.model.User;
import com.udacity.jwdnd.course1.cloudstorage.model.dto.UserDto;
import com.udacity.jwdnd.course1.cloudstorage.repository.UserRepository;
import com.udacity.jwdnd.course1.cloudstorage.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @author smurF3r Created on 5/18/2022
 */
@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private UserMapper userMapper;

  @Autowired
  private BCryptPasswordEncoder encoder;
  @Override
  public boolean isUsernameAvailable(String username) {
    User user = userRepository.getByAccount(username).orElse(null);
    return user != null;
  }

  @Override
  public Integer createUser(UserDto userDto) {
    User user = userMapper.userDtoToUserModel(userDto);
    user.setPassword(encoder.encode(userDto.getPassword()));
    System.out.println(user.getPassword());
    System.out.println(user.getUsername());
    return userRepository.createUser(user);
  }
}
