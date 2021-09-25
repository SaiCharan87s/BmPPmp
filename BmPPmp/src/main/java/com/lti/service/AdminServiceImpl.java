package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.AdminDao;

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	AdminDao adminDao;
	
	@Override
	public boolean checkAdminForLogin(String email, String password) {
		return  adminDao.checkAdminForLogin(email, password);
	}

}
