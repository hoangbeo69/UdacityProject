package com.udacity.jwdnd.course1.cloudstorage.services.impl;

import com.udacity.jwdnd.course1.cloudstorage.model.Credential;
import com.udacity.jwdnd.course1.cloudstorage.services.CredentialService;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

/**
 * @author smurF3r Created on 5/20/2022
 */
@Service
public class CredentialServiceImpl implements CredentialService {

  @Override
  public Integer addCredential(Credential credential) {
    return null;
  }

  @Override
  public Optional<Credential> updateCredential(Credential credential) {
    return Optional.empty();
  }

  @Override
  public boolean deleteCredential(Integer credentialId) {
    return false;
  }

  @Override
  public List<Credential> getAllByUserId(Integer userId) {
    return null;
  }
}
