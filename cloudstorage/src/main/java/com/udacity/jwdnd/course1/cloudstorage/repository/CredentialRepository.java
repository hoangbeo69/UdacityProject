package com.udacity.jwdnd.course1.cloudstorage.repository;

import com.udacity.jwdnd.course1.cloudstorage.model.Credential;

/**
 * @author smurF3r Created on 5/20/2022
 */
public interface CredentialRepository {
  Integer addCredential(Credential credential);
}
