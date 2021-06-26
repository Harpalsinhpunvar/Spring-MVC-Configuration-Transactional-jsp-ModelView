package com.web.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.project.model.Student;
import com.web.project.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	public Student addStudent(Student student) {
		return this.studentRepository.save(student);
	}
	
	public List<Student> getAll(){
		return this.studentRepository.findAll();
	}
}
