package com.student.student_crud.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Document(value = "students")
@Data
@Builder
public class Student {
	private String id;
	private String name;
	private int semester;
	private String branch;
}
