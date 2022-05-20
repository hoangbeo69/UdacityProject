package com.udacity.jwdnd.course1.cloudstorage.repository;

import com.udacity.jwdnd.course1.cloudstorage.model.User;
import java.util.Optional;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

/**
 * @author smurF3r Created on 5/18/2022
 */
@Mapper
public interface UserRepository {
  @Select("SELECT * FROM USERS WHERE username = #{username}")
  Optional<User> getByAccount(String username);

  @Insert("INSERT INTO USERS (username, salt, password, firstname, lastname) VALUES (#{username}, #{salt}, #{password}, #{firstName}, #{lastName})")
  @Options(useGeneratedKeys = true, keyProperty = "userId")
  Integer createUser(User user);
}
