package com.student.student_crud.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Builder;
import lombok.Data;

@Document(value = "students")
@Data
@Builder
public class Student {
	@Id
	private String id;
	@Field(name = "student_name")
	private String name;
	private int semester;
	private String branch;
}
