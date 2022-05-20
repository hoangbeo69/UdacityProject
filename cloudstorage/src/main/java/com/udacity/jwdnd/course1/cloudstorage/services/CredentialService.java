package com.udacity.jwdnd.course1.cloudstorage.services;

import com.udacity.jwdnd.course1.cloudstorage.model.Credential;
import java.util.List;
import java.util.Optional;

/**
 * @author smurF3r Created on 5/20/2022
 */
public interface CredentialService {
  Integer addCredential(Credential credential);

  Optional<Credential> updateCredential(Credential credential);

  boolean deleteCredential(Integer credentialId);

  List<Credential> getAllByUserId(Integer userId);
}
