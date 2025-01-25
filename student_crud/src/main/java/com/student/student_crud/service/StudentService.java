package com.student.student_crud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.student_crud.model.Student;
import com.student.student_crud.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;

	public String createStudent(StudentController student) {
		try {
			Student stud = Student.builder().name(student.getName()).semester(student.getSemester())
					.branch(student.getBranch()).build();
			studentRepository.save(student);
		} catch (Exception e) {

		}
		return "Student document added";
	}

	public List<Student> getStudents() {
		List<Student> studentList = new ArrayList<>();
		try {
			studentList = studentRepository.findAll();
		} catch (Exception e) {

		}
		return studentList;
	}

	public String deleteStudent(String id) {
		try {
			studentRepository.deleteById(id);
		} catch (Exception e) {

		}
		return "Student record deleted";
	}

	public String updateStudent(Student student) {
		try {
			Student stud = Student.builder().id(student.getId()).name(student.getName()).semester(student.getSemester())
					.branch(student.getBranch()).build();
			studentRepository.save(stud);
		} catch (Exception e) {

		}
		return "Student record updated";
	}
}
