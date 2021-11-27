package com.crud.CrudApplication.Service;

import com.crud.CrudApplication.Model.Student;
import com.crud.CrudApplication.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class StudentServiceImplementation implements StudenService {

    @Autowired
    StudentRepository studentRepository ;



    @Override
    public List<Student> getAllStudent() {
        return (List<Student>) studentRepository.findAll();
    }

    @Override
    public Student getStudentById(int id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void deleteStudent(int id) {
           studentRepository.deleteById(id);
    }
}
