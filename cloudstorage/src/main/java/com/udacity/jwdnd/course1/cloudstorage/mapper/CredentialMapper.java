package com.udacity.jwdnd.course1.cloudstorage.mapper;

import com.udacity.jwdnd.course1.cloudstorage.model.Credential;
import com.udacity.jwdnd.course1.cloudstorage.model.dto.CredentialDto;
import org.mapstruct.Mapper;

/**
 * @author smurF3r Created on 5/20/2022
 */
@Mapper(componentModel = "spring")
public interface CredentialMapper {
  CredentialDto map(Credential credential);

  Credential map(CredentialDto credential);
}
