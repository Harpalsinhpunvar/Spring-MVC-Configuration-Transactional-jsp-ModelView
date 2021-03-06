package com.web.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.project.model.Student;
import com.web.project.service.StudentService;

@Controller
public class ContactController {
	
	@Autowired
	private StudentService studentService;
	
	@ModelAttribute
	public void commonModel(Model model) {
		model.addAttribute("welcome", "Welcome to Web");
	}
	
	@RequestMapping("/contact")
	public String showForm(@ModelAttribute Student student,Model model) {
		model.addAttribute("students", this.studentService.getAll());
		return "contact";
	}
	
	
	@RequestMapping(path="/processform", method=RequestMethod.POST)
	public String handlerForm(@ModelAttribute Student student, Model model) {
		this.studentService.addStudent(student);
		
//		if(student.getFname().isBlank()) {
//			return "redirect:/contact";
//		}
		
		
		return "redirect:/contact";
//		return "success";
	}

}
/*
@RequestMapping(path="/processform", method=RequestMethod.POST)
public String handlerForm(
		@RequestParam("fname")String fName,
		@RequestParam("lname")String lName,
		@RequestParam("city")String city, Model model) {
	
	Student student=new Student();
	student.setFname(fName);
	student.setLname(lName);
	student.setCity(city);
	
	model.addAttribute("student", student);
//	model.addAttribute("lastname", lName);
//	model.addAttribute("city", city);
	return "success";
}*/

