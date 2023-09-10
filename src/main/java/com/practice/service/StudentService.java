package com.practice.service;

import java.util.List;

import com.practice.entities.Student;

public interface StudentService {
	 List<Student> getAll();
	 Student findbyId(int id);
	 Student save(Student student);
	 Student update(Student student);
	 void delete(int id);
}
