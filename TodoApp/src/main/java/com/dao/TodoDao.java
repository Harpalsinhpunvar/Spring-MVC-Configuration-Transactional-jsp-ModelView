package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.entities.Todo;

@Component
public class TodoDao {
	
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void save(Todo t) {
		 this.hibernateTemplate.saveOrUpdate(t);
	}
	
	@Transactional
	public void update(Todo todo, int id) {
		Todo t = this.hibernateTemplate.load(Todo.class, id);
		 t.setTodoTitle(todo.getTodoTitle());
		 t.setTodoContent(todo.getTodoContent());
		 this.hibernateTemplate.save(t);
	}
	
	@Transactional
	public List<Todo> getAll(){
		List<Todo> todos = this.hibernateTemplate.loadAll(Todo.class);
		return todos;
	}
	
	
	@Transactional
	public void deleteById(int id) {
		Todo todo = this.hibernateTemplate.load(Todo.class, id);
		this.hibernateTemplate.delete(todo);
	}

	public Todo getTodo(int id) {
		return  this.hibernateTemplate.load(Todo.class, id);
	}

}
