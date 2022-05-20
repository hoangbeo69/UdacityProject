package com.udacity.jwdnd.course1.cloudstorage.services;

import com.udacity.jwdnd.course1.cloudstorage.model.dto.NoteDto;
import java.util.List;
import java.util.Optional;

/**
 * @author smurF3r Created on 5/19/2022
 */
public interface NoteService {
  Integer addNote(NoteDto noteDto);

  Optional<NoteDto> updateNote(NoteDto noteDto);

  boolean deleteNote(Integer noteId);

  List<NoteDto> getAllByUserId(Integer userId);

}
