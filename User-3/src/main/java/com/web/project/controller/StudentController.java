package com.web.project.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/main")
public class StudentController {
	
	@RequestMapping(path="/home", method=RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("name", "harpalsinh");
		return "index";
	}
	
	@RequestMapping(path="/new", method=RequestMethod.GET)
	public ModelAndView newone() {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name", "Comcox");
		modelAndView.addObject("name", "Comcox");
		modelAndView.setViewName("new");
		
		
		//marks
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(12);
		list.add(12);
		list.add(12);
		
		modelAndView.addObject("marks", list);
		
		return modelAndView;
		
	}

}
