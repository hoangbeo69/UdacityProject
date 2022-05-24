package com.udacity.jwdnd.course1.cloudstorage.services;

import com.udacity.jwdnd.course1.cloudstorage.model.File;
import com.udacity.jwdnd.course1.cloudstorage.model.dto.FileDto;
import java.util.List;

/**
 * @author smurF3r Created on 5/20/2022
 */
public interface FileService {

  Integer addFile(FileDto fileDto);

  FileDto getFileById(Integer fileId);

  Boolean deleteFile(Integer fileId);

  List<FileDto> getAllByUserId(Integer userId);
}
