package com.udacity.jwdnd.course1.cloudstorage.services.impl;

import com.udacity.jwdnd.course1.cloudstorage.mapper.FileMapper;
import com.udacity.jwdnd.course1.cloudstorage.model.File;
import com.udacity.jwdnd.course1.cloudstorage.model.dto.FileDto;
import com.udacity.jwdnd.course1.cloudstorage.repository.FileRepository;
import com.udacity.jwdnd.course1.cloudstorage.services.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author smurF3r Created on 5/20/2022
 */
@Service
public class FileServiceImpl implements FileService {

  @Autowired
  FileMapper fileMapper;

  @Autowired
  FileRepository fileRepository;

  @Override
  public Integer addFile(FileDto fileDto) {
    File file = fileMapper.map(fileDto);
    return fileRepository.addFile(file);


  }
}
