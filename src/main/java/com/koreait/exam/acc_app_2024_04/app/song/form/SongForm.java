package com.koreait.exam.acc_app_2024_04.app.song.form;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class SongForm {
   @NotEmpty
   private String subject;
   @NotEmpty
   private String content;
}