//package com.cg.sprint;
//
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//import java.util.List;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//	import org.springframework.boot.test.context.SpringBootTest;
//	import org.springframework.boot.test.mock.mockito.MockBean;
//	import com.cg.sprint.controller.TodoController;
//
//import com.cg.sprint.model.Todo;
//import com.cg.sprint.repository.TodoRepository;
//import com.cg.sprint.service.TodoService;
//
//	
//	@SpringBootTest
//	public class TodoServiceTestsWithMockito {
//
//		@Autowired
//		TodoRepository todorepository;
//		@Autowired
//		TodoController todocontroller;
//
//		@MockBean
//		TodoService todoservice;
//
//		@Test
//		public void testSaveRegistration() {
//			Todo todo = new Todo();
//			todo.setTaskId(25);
//			todo.setTaskName("BU Meeting");
//			todo.setStartTime("5am");
//			todo.setEndTime("6pm");
//			todo.setDate("25");
//		    todo.setLocation("Google Meet");
//		    todocontroller.saveRegistration(todo);
//		     assertNotNull(todocontroller.deleteTaskById(4));
//		     
//		}
//		@Test
//		public void testReadAll() {
//			List<Todo>list = todorepository.findAll();
//			assertThat(list).size().isGreaterThan(0);
//		}
//	
////		@Test
////		public void testDelete() {
////		tr.deleteById(11);
////		assertThat(tr.existsById(11)).isFalse();
////		}
//	}
//		