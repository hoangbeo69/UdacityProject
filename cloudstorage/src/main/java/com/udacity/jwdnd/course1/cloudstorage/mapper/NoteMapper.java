package com.udacity.jwdnd.course1.cloudstorage.mapper;

import com.udacity.jwdnd.course1.cloudstorage.model.Note;
import com.udacity.jwdnd.course1.cloudstorage.model.dto.NoteDto;
import java.util.List;
import org.mapstruct.Mapper;

/**
 * @author smurF3r Created on 5/19/2022
 */
@Mapper(componentModel = "spring")
public interface NoteMapper {
  Note noteDtoToNoteModel(NoteDto noteDto);
  NoteDto noteModelToNoteDto(Note note);

  List<NoteDto> map (List<Note> notes);
}
