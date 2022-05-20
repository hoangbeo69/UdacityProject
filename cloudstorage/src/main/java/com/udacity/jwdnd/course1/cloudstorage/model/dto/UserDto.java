package com.udacity.jwdnd.course1.cloudstorage.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author smurF3r Created on 5/18/2022
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
public class UserDto {
  private Integer userId;
  private String username;
  private String salt;
  private String password;
  private String firstName;
  private String lastName;
}
