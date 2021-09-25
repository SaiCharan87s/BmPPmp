package com.lti.dao;

import org.springframework.stereotype.Repository;


@Repository
public interface UserDao{
	
	void inserUserProfile(UserDao user);
	boolean checkUserForLogin(String email,String password);
	
	

}
