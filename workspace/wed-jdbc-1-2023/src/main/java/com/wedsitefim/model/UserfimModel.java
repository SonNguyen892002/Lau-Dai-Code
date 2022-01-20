package com.wedsitefim.model;

import java.util.ArrayList;
import java.util.List;

public class UserfimModel{
	
	private Long id;
	private String userName;
	private String fullName;
	private String password;
	private String email;
	private Long roleid;
	private List<UserfimModel> listResult = new ArrayList<>();
	
	public Long getId() {
		return id;
	}
	public List<UserfimModel> getListResult() {
		return listResult;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setListResult(List<UserfimModel> listResult) {
		this.listResult = listResult;
	}
	public String getUserName() {
		return userName;
	}
	public String getFullName() {
		return fullName;
	}
	public String getPassword() {
		return password;
	}
	public String getEmail() {
		return email;
	}
	public Long getRoleid() {
		return roleid;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setRoleid(Long roleid) {
		this.roleid = roleid;
	}
	
	
	
}
