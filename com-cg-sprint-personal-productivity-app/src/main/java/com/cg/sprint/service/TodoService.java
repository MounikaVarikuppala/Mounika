package com.cg.sprint.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.sprint.model.Todo;
import com.cg.sprint.repository.TodoRepository;


@Service
public class TodoService {

	@Autowired
	TodoRepository todoRepository;
	
	public Todo saveTodo(Todo todo) {
		return todoRepository.save(todo);
		
	}

	public Todo updateTodo(Todo todo) {
		return todoRepository.save(todo);
	}

	public void deleteTodo(int taskId) {
		 todoRepository.deleteById(taskId);
	}

//	public List<Todo> getTaskListByDateForRemainder(String date) {
//		List <Todo> todos = todoRepository.getTaskListByDateForRemainder(date);
//		return todos;
//	}

   
    
}



