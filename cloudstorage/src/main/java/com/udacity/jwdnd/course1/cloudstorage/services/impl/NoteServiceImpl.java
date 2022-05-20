package com.udacity.jwdnd.course1.cloudstorage.services.impl;

import com.udacity.jwdnd.course1.cloudstorage.mapper.NoteMapper;
import com.udacity.jwdnd.course1.cloudstorage.model.Note;
import com.udacity.jwdnd.course1.cloudstorage.model.dto.NoteDto;
import com.udacity.jwdnd.course1.cloudstorage.repository.NoteRepository;
import com.udacity.jwdnd.course1.cloudstorage.services.NoteService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author smurF3r Created on 5/19/2022
 */
@Service
public class NoteServiceImpl implements NoteService {

  @Autowired
  NoteRepository noteRepository;

  @Autowired
  NoteMapper noteMapper;
  @Override
  public Integer addNote(NoteDto noteDto) {
    Note note = noteMapper.noteDtoToNoteModel(noteDto);
    return noteRepository.addNote(note);
  }

  @Override
  public Optional<NoteDto> updateNote(NoteDto noteDto) {
    Note result = null;
    Note note = noteMapper.noteDtoToNoteModel(noteDto);
    if(noteRepository.updateNote(note) >0){
      result = noteRepository.getById(noteDto.getNoteId());
    }
    return Optional.of(noteMapper.noteModelToNoteDto(result));
  }

  @Override
  public boolean deleteNote(Integer noteId) {
    boolean result = false;
    if(noteRepository.removeNote(noteId) >0){
      result = true;
    }
    return result;
  }

  @Override
  public List<NoteDto> getAllByUserId(Integer userId) {
    return noteMapper.map(noteRepository.getAllByUserId(userId));
  }
}
