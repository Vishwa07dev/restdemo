package com.upgrad.studentservice.service;

import com.upgrad.studentservice.dao.StudentDao;
import com.upgrad.studentservice.dto.StudentDTO;
import com.upgrad.studentservice.entities.StudentEntity;
import com.upgrad.studentservice.utils.PojoConverter;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentService {

  @Autowired
  private StudentDao studentDao ;

  public void acceptStudent(StudentDTO studentDTO){
    studentDao.addStudent(PojoConverter.covertStudentDTOtoEntity(studentDTO));
  }


  public List<StudentDTO> getStudents(){

    List<StudentDTO> students  = new ArrayList<>();

    for(StudentEntity se : studentDao.fetchStudents()){
      students.add(PojoConverter.covertStudentEntityToDTO(se));
    }
    return students;
  }

  public StudentDTO getStudentById(int id){
    return PojoConverter.covertStudentEntityToDTO(studentDao.fetchStudent(id));
  }

  public void updateStudent(StudentDTO studentDTO , int id){
    studentDao.updateStudent(PojoConverter.covertStudentDTOtoEntity(studentDTO), id);
  }

  public void removeStudent(int id){
    studentDao.deleteStudent(id);
  }



}
