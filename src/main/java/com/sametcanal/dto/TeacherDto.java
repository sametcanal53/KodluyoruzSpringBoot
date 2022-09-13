package com.sametcanal.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import javax.validation.constraints.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Log4j2
public class TeacherDto {
    private Long teacherId;

    @NotEmpty(message = "Ad Soyad Alanı Boş Bırakılamaz")
    @Size(min=1,max=255)
    private String teacherFullName;

    @NotEmpty(message = "Email Alanı Boş Bırakılamaz")
    @Email(message = "Email Formatı Yanlış")
    private String teacherEmail;

    @NotEmpty(message = "Şifre Alanı Boş Bırakılamaz")
    @Min(value = 8,message = "Minimum 8 Haneli Şifre Girebilirsiniz")
    private String teacherPassword;
}
