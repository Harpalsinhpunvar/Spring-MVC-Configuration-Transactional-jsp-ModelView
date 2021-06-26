package com.service;

import java.util.List;

import com.model.Student;


public interface StudentService {
	
	List<Student> getAll();
	
	Student getById(int id);
	
	void addStudent(Student student);
	
	Student updateStudent(int id, Student student);
	
	void deleteById(int id);

}
