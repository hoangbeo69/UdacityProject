package com.udacity.jwdnd.course1.cloudstorage.repository;

import com.udacity.jwdnd.course1.cloudstorage.model.File;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author smurF3r Created on 5/20/2022
 */
@Mapper
public interface FileRepository {
  @Insert("INSERT INTO FILES (filename,contenttype,filesize,userid,filedata) VALUES (#{fileName},#{contentType},#{fileSize},#{userId},#{fileData})")
  Integer addFile(File file);
}
