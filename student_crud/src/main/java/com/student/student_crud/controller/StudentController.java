package com.student.student_crud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/emp")
public class StudentController {
	@Autowired
	private StudentService studentService;
}
