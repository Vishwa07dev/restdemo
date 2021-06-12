package com.upgrad.studentservice.dao;

import com.upgrad.studentservice.entities.StudentEntity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Repository
public class StudentDao {

  private static final Map<Integer, StudentEntity> STUDENTS_STORE = new HashMap<>();



  public void addStudent(StudentEntity student){

    STUDENTS_STORE.put(student.getId(), student);

  }

  public void updateStudent(StudentEntity studentEntity , int id){
    STUDENTS_STORE.put(id, studentEntity);
  }

  public List<StudentEntity> fetchStudents(){
    //return STUDENTS_STORE.values().stream().collect(Collectors.toList());

    List<StudentEntity> studentEntities = new ArrayList<>();
    for(StudentEntity studentEntity : STUDENTS_STORE.values()){
      studentEntities.add(studentEntity);
    }
    return studentEntities;
  }

  public StudentEntity fetchStudent(int id){
    return STUDENTS_STORE.get(id);
  }

  public void deleteStudent(int id){
    STUDENTS_STORE.remove(id);
  }



}
