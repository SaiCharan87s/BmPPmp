package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.UserDao;
import com.lti.model.User;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDao userDao;

	@Override
	public void insertUserProfile(User user) {
		userDao.insertUserProfile(user);
	}

	@Override
	public boolean checkUserForLogin(String email, String password) {
		return userDao.checkUserForLogin(email,password);
	}

}
