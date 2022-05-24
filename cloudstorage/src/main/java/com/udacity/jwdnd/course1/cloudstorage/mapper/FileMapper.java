package com.udacity.jwdnd.course1.cloudstorage.mapper;

import com.udacity.jwdnd.course1.cloudstorage.model.File;
import com.udacity.jwdnd.course1.cloudstorage.model.dto.FileDto;
import java.util.List;
import java.util.function.DoubleToIntFunction;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * @author smurF3r Created on 5/20/2022
 */
@Mapper(componentModel = "spring")
public interface FileMapper {
  FileDto map(File file);

  File map(FileDto fileDto);

  List<FileDto> map(List<File> files);
}
