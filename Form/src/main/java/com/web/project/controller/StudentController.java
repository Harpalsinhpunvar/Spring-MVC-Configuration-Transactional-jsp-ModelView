package com.web.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.web.project.model.Student;
import com.web.project.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/read")
	public String index(@ModelAttribute Student student, Model model) {
		model.addAttribute("students", this.studentService.getAll());
		return "read";
	}
	
	@RequestMapping("/index")
	public String createStudent(@ModelAttribute Student student, Model model) {
		model.addAttribute("students", new Student());
		return "index";
	}
	
	@PostMapping("/processform")
	public String handleForm(@ModelAttribute Student student, Model model) {
		this.studentService.addStudent(student);
		return "redirect:/read";
	}
	
	@RequestMapping(value="/update/{id}")
	public String updateStudentById(@PathVariable int id, Model model) {
		model.addAttribute("id", id);
		model.addAttribute("command", this.studentService.getById(id));
		return "update";
	}
	
	@PostMapping("/update/{id}")
	public String updateStudent(@PathVariable int id, @ModelAttribute("student") Student student) {
		this.studentService.updateStudent(id, student);
		return "redirect:/read";
	}
	
	@RequestMapping(value="/delete/{id}")
	public String deleteStudentById(@PathVariable int id) {
		this.studentService.deleteById(id);
		return "redirect:/read";
	}

}
