package com.udacity.jwdnd.course1.cloudstorage.services;

import com.udacity.jwdnd.course1.cloudstorage.model.dto.FileDto;

/**
 * @author smurF3r Created on 5/20/2022
 */
public interface FileService {
  Integer addFile(FileDto fileDto);
}
