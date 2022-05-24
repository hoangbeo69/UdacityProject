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
public class FileDto {
  private Integer fileId;
  private String fileName;
  private String contentType;
  private Long fileSize;
  private Integer userId;
  private byte[] fileData;
}
