package com.cg.sprint.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.sprint.model.AppUser;
import com.cg.sprint.model.Todo;
import com.cg.sprint.service.TodoService;

@RestController
@RequestMapping("/todo")
public class TodoController {

	
	@Autowired
	private TodoService todoService;
	
	@PostMapping("/savetodo")
	public ResponseEntity<Todo> saveRegistration(@RequestBody Todo todo ) { // LOG.info(user.toString());

		HttpStatus status = HttpStatus.CREATED;
		Todo user = todoService.saveTodo(todo);
		return new ResponseEntity<Todo>(user, status);
	}

	@PutMapping("/update-todo")
	public String updateAppUser(@RequestBody Todo todo) {
		
		todoService.updateTodo(todo);
		
		return "Task update sucessfully";
	}
	
	
	@DeleteMapping("/deleteTaskById/{taskId}")
    public String deleteTaskById(@PathVariable int taskId) {
	    todoService.deleteTodo(taskId);
		return "Task Delete sucessfully";
	}
	
}