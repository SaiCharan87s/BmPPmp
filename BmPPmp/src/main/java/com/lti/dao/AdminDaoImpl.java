package com.lti.dao;



import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.Admin;

@Repository
public class AdminDaoImpl implements AdminDao{
	
	@PersistenceContext
	EntityManager entityManager;
	
	@Transactional
	public boolean checkAdminForLogin(String email, String password) {
		boolean res=false;
		
		
		Admin ap=entityManager.find(Admin.class, email);
		if ( ap!=null && ap.getAdminPassword().equals(password)) {
			res=true;
			
		}
		return res;
		

	}

}
