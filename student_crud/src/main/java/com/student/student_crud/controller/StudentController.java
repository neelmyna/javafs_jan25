package com.student.student_crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.student.student_crud.model.Student;
import com.student.student_crud.service.StudentService;
import com.student.student_crud.studentdao.StudentDao;

@RestController
@RequestMapping("/api/student")
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/create")
	@ResponseStatus(HttpStatus.CREATED)
	public String createStudent(@RequestBody StudentDao student) {
		return studentService.createStudent(student);		
	}
	
	@GetMapping("/get/students")
	@ResponseStatus(HttpStatus.OK)
	public List<Student> getStudent() {
		return studentService.getStudents();	
	}
	
	@GetMapping("/delete/student")
	@ResponseStatus(HttpStatus.OK)
	public String deleteStudent(@RequestParam String id) {
		return studentService.deleteStudent(id);	
	}
	
	@PutMapping("/update")
	@ResponseStatus(HttpStatus.CREATED)
	public String updateStudent(@RequestBody StudentDao student) {
		return studentService.updateStudent(student);
		
	}
}
