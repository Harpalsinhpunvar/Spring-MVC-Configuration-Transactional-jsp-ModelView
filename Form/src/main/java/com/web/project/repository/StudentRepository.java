package com.web.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.project.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
