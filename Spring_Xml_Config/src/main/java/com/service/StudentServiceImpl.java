package com.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Student;
import com.repository.StudentRepository;


@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public List<Student> getAll() {
		return this.studentRepository.findAll();
	}

	@Override
	public Student getById(int id) {
		return this.studentRepository.findById(id).orElse(null);
	}

	@Override
	public void addStudent(Student student) {
		this.studentRepository.save(student);
		
	}

	@Override
	public Student updateStudent(int id, Student student) {
		Student extStudent = this.studentRepository.findById(id).orElse(null);
		extStudent.setStudentName(student.getStudentName());
		extStudent.setStudentEmail(student.getStudentEmail());
		return this.studentRepository.save(extStudent);
	}

	@Override
	public void deleteById(int id) {
		this.studentRepository.deleteById(id);
		
	}

}
