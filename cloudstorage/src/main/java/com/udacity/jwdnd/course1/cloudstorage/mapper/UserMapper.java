package com.udacity.jwdnd.course1.cloudstorage.mapper;

import com.udacity.jwdnd.course1.cloudstorage.model.User;
import com.udacity.jwdnd.course1.cloudstorage.model.dto.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * @author smurF3r Created on 5/18/2022
 */
@Mapper(componentModel = "spring")
public interface UserMapper {

  @Mapping(target = "password",ignore = true)
  UserDto userModelToUserDto(User user);

  User userDtoToUserModel(UserDto userDto);

}
