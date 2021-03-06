package com.udacity.jwdnd.course1.cloudstorage.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author smurF3r Created on 5/19/2022
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
public class NoteDto {

  private Integer noteId;
  private String noteTitle;
  private String noteDescription;
  private Integer userId;
}
