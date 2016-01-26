package fr.unicaen.am.model;

import domain.person.Person;

public class UserRole {
	private Integer userRoleId;
	private User user;
	private String role;
	
	public UserRole() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public UserRole(User user, String role) {
		super();
		this.user = user;
		this.role = role;
	}



	public Integer getUserRoleId() {
		return userRoleId;
	}
	public void setUserRoleId(Integer userRoleId) {
		this.userRoleId = userRoleId;
	}
	public Person getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
}
