package com.ctrl;

import java.util.Date;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dao.TodoDao;
import com.entities.Todo;


@Controller
public class HomeCtrl {
	
	@Autowired
	TodoDao todoDao;
	
	@RequestMapping("/")
	public String home() {

		return "home";
	}
	
	@RequestMapping("/add")
	public String addTodo( Todo t, Model model) {
		
		model.addAttribute("todo",t);
		return "add";
	}
	
	@RequestMapping(value="/saveTodo", method=RequestMethod.POST)
	public String saveTodo(@Valid @ModelAttribute("todo") Todo t,BindingResult result, Model model) {
		System.out.println(t);
		
		if(result.hasErrors()) {
			return "redirect:/add";
		}
		
		t.setTodoDate(new Date());	
		this.todoDao.save(t);
		model.addAttribute("msg", "successfully added..");
		return "redirect:/view";
	}
	
	@RequestMapping("/view")
	public String viewTodo(Model model) {
        List<Todo> list = this.todoDao.getAll();
		
		model.addAttribute("todos",list);
		return "view";
	}
	
	@RequestMapping(value="/update/{id}")
	public String update(@PathVariable("id") int id, Model model) {
		model.addAttribute("todo", this.todoDao.getTodo(id));
		return "update";
		
	}
	
	@RequestMapping(value="/update/{id}", method=RequestMethod.POST)
	public String updateTodo(@PathVariable int id, @ModelAttribute("todo") Todo todo, Model model) {
		this.todoDao.save(todo);
		return "redirect:/view";
		
	}
	
	
	@RequestMapping("/delete/{id}")
	public String deleteTodo(@ModelAttribute("todo") @PathVariable int id,Model model) {
		model.addAttribute("page","delete");
		this.todoDao.deleteById(id);
		return "redirect:/view";
	}

}
