package com.lti.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lti.model.User;
import com.lti.service.UserService;



@CrossOrigin(origins="*")
@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService  userService;
	
	@PostMapping("/register")
	public ResponseEntity insertUser(@RequestBody User user)
	{
		System.out.println(user);
		userService.insertUserProfile(user);	
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@GetMapping("/login")
	public boolean checkLogin(@RequestParam String email , @RequestParam String password)
	{
		return userService.checkUserForLogin(email, password);
	}
	
	
	
	

}
