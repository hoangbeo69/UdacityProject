package com.udacity.jwdnd.course1.cloudstorage.repository;

import com.udacity.jwdnd.course1.cloudstorage.model.File;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author smurF3r Created on 5/20/2022
 */
@Mapper
public interface FileRepository {

  @Insert("INSERT INTO FILES (filename,contenttype,filesize,userid,filedata) VALUES (#{fileName},#{contentType},#{fileSize},#{userId},#{fileData})")
  Integer addFile(File file);

  @Delete("DELETE FROM FILES WHERE fileId = #{fileId}")
  Integer deleteFile(Integer fileId);

  @Select("SELECT * FROM FILES WHERE fileId = #{fileId}")
  File getFileById(Integer fileId);

  @Select("SELECT * FROM FILES WHERE userId = #{userId}")
  List<File> getFileByUserId(Integer userId);
}
