package com.udacity.jwdnd.course1.cloudstorage.services;

import com.udacity.jwdnd.course1.cloudstorage.model.dto.UserDto;

/**
 * @author smurF3r Created on 5/18/2022
 */
public interface UserService {
  boolean isUsernameAvailable(String username);

  Integer createUser(UserDto user);
}
