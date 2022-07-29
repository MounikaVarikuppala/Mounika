package com.cg.sprint.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.cg.sprint.model.AppUser;
import com.cg.sprint.model.Todo;
import com.cg.sprint.service.AppUserService;
import com.cg.sprint.service.TodoService;

@RestController
@RequestMapping("/user")

public class AppUserController {
	

	@Autowired
	AppUserService appUserService;

	@Autowired
	TodoService todoService;

	@PostMapping("/saveuser")
	public ResponseEntity<AppUser> saveRegistration(@RequestBody AppUser appUser) { 
		HttpStatus status = HttpStatus.CREATED;
		AppUser user = appUserService.saveRegistration(appUser);
		return new ResponseEntity<AppUser>(user, status);
	}
	

	@PostMapping("/login")
	public ResponseEntity<AppUser> login(@RequestBody AppUser appUser) {
		HttpHeaders headers = new HttpHeaders();
		AppUser appUser2 = appUserService.loginUser(appUser);
		if(appUser2!=null) {
			headers.add("message", "User " + appUser.getUserName() + " logged in successfully.");
		}else {
			headers.add("message", "UserName or Password is in correct .");
			String exceptionMessage = "UserName or Password is in correct .";
			throw new com.cg.sprint.exception.AppUserNotFoundException(exceptionMessage);
		}
		return new ResponseEntity<AppUser>(appUser2, headers, HttpStatus.OK);
	}
	
	

	@GetMapping("/getUserAllDataById/{userId}")
	public  ResponseEntity<AppUser>  getUserAllDataById(@PathVariable int userId) {
		AppUser appUser = appUserService.getUserAllDataById(userId);
		return new ResponseEntity<AppUser>(appUser,  HttpStatus.OK);
	}
	
	
	
}
