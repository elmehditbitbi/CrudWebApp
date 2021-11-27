package com.crud.CrudApplication.Service;

import com.crud.CrudApplication.Model.Student;

import java.util.List;

public interface StudenService {

    public List<Student> getAllStudent() ;
    public Student getStudentById(int id);
    public void addStudent(Student student);
    public void deleteStudent(int id);


}
