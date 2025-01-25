package com.student.student_crud.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.student.student_crud.model.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String>{
	
}
