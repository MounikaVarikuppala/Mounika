//package com.cg.sprint.controller;
//
//import java.text.SimpleDateFormat;
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//
//import com.cg.sprint.model.Todo;
//import com.cg.sprint.service.TodoService;
//
//@Component
//public class ScheduledTask {
//
//	@Autowired
//	TodoService todoService;
//	
//	 
//	    // Method
//	    // To trigger the scheduler every one minute
//	    // between 19:00 PM to 19:59 PM
////	    @Scheduled(cron = "0 55 22 ? * * *")
//	    public void scheduleTask()
//	    {
//	    	
//	    	 LocalDate date =  LocalDate.now().plusDays(1);
//	    	 
//	    	 List<Todo>  todos = new ArrayList<>();
//	    	 
////	    	 todos = todoService.getTaskListByDateForRemainder(date.toString());
//	    	 
//	         System.out.println("Adding one day to current date: "+date);
//	    	
//	    	
//	    }
//	}
//	
//	
