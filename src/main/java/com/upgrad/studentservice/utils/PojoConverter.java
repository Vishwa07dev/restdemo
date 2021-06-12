package com.upgrad.studentservice.utils;

import com.upgrad.studentservice.dto.StudentDTO;
import com.upgrad.studentservice.entities.StudentEntity;


public class PojoConverter {

  public static StudentEntity covertStudentDTOtoEntity(StudentDTO studentDTO){

     StudentEntity studentEntity = new StudentEntity();

     studentEntity.setId(studentDTO.getId());
     studentEntity.setAge(studentDTO.getAge());
     studentEntity.setCountry(studentDTO.getCountry());
     studentEntity.setGendre(studentDTO.getGendre());
     studentEntity.setHobbies(studentDTO.getHobbies());
     studentEntity.setName(studentDTO.getName());

     return studentEntity ;

  }

  public static StudentDTO covertStudentEntityToDTO(StudentEntity studentEntity){

    StudentDTO studentDTO = new StudentDTO();

    studentDTO.setId(studentEntity.getId());
    studentDTO.setAge(studentEntity.getAge());
    studentDTO.setCountry(studentEntity.getCountry());
    studentDTO.setGendre(studentEntity.getGendre());
    studentDTO.setHobbies(studentEntity.getHobbies());
    studentDTO.setName(studentEntity.getName());

    return studentDTO ;

  }
}
