package com.cg.sprint.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.sprint.model.AppUser;
import com.cg.sprint.model.Remainder;
import com.cg.sprint.model.Todo;
import com.cg.sprint.service.RemainderService;
@RestController
@RequestMapping("/rem")
public class RemainderController {

	@Autowired
	private RemainderService remainderservice;
	
	@PostMapping("/saveremainder")
	public ResponseEntity<Remainder> saveRegistration(@RequestBody Remainder remainder) { // LOG.info(user.toString());

		HttpStatus status = HttpStatus.CREATED;
		Remainder rem = remainderservice.addRemainder(remainder);
		return new ResponseEntity<Remainder>(rem, status);
	}
	
	@DeleteMapping("/deleteTaskById/{remainderId}")
    public String deleteTaskById(@PathVariable int remainderId) {
	    remainderservice.deleteRemainder(remainderId);
		return "Task Delete sucessfully";
	}
	
}