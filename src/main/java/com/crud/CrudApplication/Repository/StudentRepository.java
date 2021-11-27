package com.crud.CrudApplication.Repository;

import com.crud.CrudApplication.Model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student,Integer> {

}
