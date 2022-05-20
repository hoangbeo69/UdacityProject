package com.udacity.jwdnd.course1.cloudstorage.repository;

import com.udacity.jwdnd.course1.cloudstorage.model.Note;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * @author smurF3r Created on 5/19/2022
 */
@Mapper
public interface NoteRepository {

  @Insert("INSERT INTO NOTES (noteid,notetitle,notedescription,userid) VALUES (#{noteId}, #{noteTitle}, #{noteDescription}, #{userId})")
  Integer addNote(Note note);

  @Update("UPDATE NOTES SET notetitle = #{noteTitle}, notedescription = #{noteDescription} WHERE noteId = #{noteId}")
  Integer updateNote(Note note);

  @Delete("DELETE NOTES WHERE noteid = #{noteId}")
  Integer removeNote(Integer noteId);

  @Select("SELECT * FROM NOTES WHERE noteid = #{noteId}")
  Note getById(Integer noteId);

  @Select("SELECT * FROM NOTES WHERE userid = #{userId}")
  List<Note> getAllByUserId(Integer userId);

}
