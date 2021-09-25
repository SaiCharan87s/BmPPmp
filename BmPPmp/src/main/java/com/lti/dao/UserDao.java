package com.lti.dao;

import org.springframework.stereotype.Repository;

import com.lti.model.User;


@Repository
public interface UserDao{
	
	void insertUserProfile(User user);
	boolean checkUserForLogin(String email,String password);
	
	

}
