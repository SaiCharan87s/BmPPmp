package com.lti.service;

import org.springframework.stereotype.Service;

import com.lti.model.User;



@Service
public interface UserService {
	
	void insertUserProfile(User user);
	boolean checkUserForLogin(String email,String password);
	
	

}
