package com.upgrad.studentservice.controller;

import com.upgrad.studentservice.dto.StudentDTO;
import com.upgrad.studentservice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/ss/v1/students")

/**
 *   127.0.0.1:8080/ss/v1/students/
 */
public class StudentController {

  @Autowired
  private StudentService studentService ;

  /**
   * Creation of student resource
   *
   * POST 127.0.0.1:8080/ss/v1/students
   *
   * {
   *   "id" : 123,
   *   ...
   *   ...
   *   ..
   *
   * }
   */
  @PostMapping
  public ResponseEntity createStudent(@RequestBody StudentDTO studentDTO){
    studentService.acceptStudent(studentDTO);
    return new ResponseEntity(studentDTO, HttpStatus.CREATED);
  }

  /**
   * GET 127.0.0.1:8080/ss/v1/students -- List of all the students
   */

  @GetMapping
  public ResponseEntity getAllStudents(){
    return new ResponseEntity(studentService.getStudents(), HttpStatus.OK);
  }

  /**
   * Go and Fetch a Student based on the id
   *
   * GET 127.0.0.1:8080/ss/v1/students/{id}
   */
  @GetMapping("{id}")
  public ResponseEntity getStudentBasedOnId(@PathVariable("id") int id ){
    return new ResponseEntity(studentService.getStudentById(id), HttpStatus.OK);
  }

  /**
   *
   * PUT 127.0.0.1:8080/ss/v1/students/{id}
   * {
   *   ...
   *   ...
   *
   * }
   * @param studentDTO
   * @param id
   * @return
   */
  @PutMapping("{id}")
  public ResponseEntity updateStudent(@RequestBody StudentDTO studentDTO ,
      @PathVariable("id") int id){
    studentService.updateStudent(studentDTO, id);
    return new ResponseEntity(studentDTO, HttpStatus.ACCEPTED);
  }

  @DeleteMapping("{id}")
  public ResponseEntity deleteStudent(@PathVariable("id") int id){
    studentService.removeStudent(id);
    return new ResponseEntity(null, HttpStatus.OK);
  }



}
