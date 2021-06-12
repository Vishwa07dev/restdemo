package com.upgrad.studentservice.dto;

import java.util.List;
import java.util.Objects;


public class StudentDTO {

  private int id ;
  private String name ;
  private int age ;
  private String gendre;
  private String country ;
  private List<String> hobbies ;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getGendre() {
    return gendre;
  }

  public void setGendre(String gendre) {
    this.gendre = gendre;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public List<String> getHobbies() {
    return hobbies;
  }

  public void setHobbies(List<String> hobbies) {
    this.hobbies = hobbies;
  }

  @Override
  public String toString() {
    return "StudentDTO{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age + ", gendre='" + gendre + '\''
        + ", country='" + country + '\'' + ", hobbies=" + hobbies + '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StudentDTO that = (StudentDTO) o;
    return id == that.id && age == that.age && Objects.equals(name, that.name) && Objects.equals(gendre, that.gendre)
        && Objects.equals(country, that.country) && Objects.equals(hobbies, that.hobbies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, age, gendre, country, hobbies);
  }
}
