package com.lti.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface AdminDao {
	boolean checkAdminForLogin(String email, String password);

}
