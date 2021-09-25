package com.lti.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class Admin {
	
	@Id
	@Column(name="email")
	private String adminEmailId;
	
	@Column(name="password")
	private String adminPassword;
	
	

	public Admin() {	}



	public Admin(String adminEmailId, String adminPassword) {
		this.adminEmailId = adminEmailId;
		this.adminPassword = adminPassword;
	}



	public String getAdminEmailId() {
		return adminEmailId;
	}



	public void setAdminEmailId(String adminEmailId) {
		this.adminEmailId = adminEmailId;
	}



	public String getAdminPassword() {
		return adminPassword;
	}



	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	


}