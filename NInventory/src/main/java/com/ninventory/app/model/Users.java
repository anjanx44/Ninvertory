package com.ninventory.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users {
	@Id
	private long id;
	private String email;
	private String password;
	public Users() {
	super();
	// TODO Auto-generated constructor stub
	}
	public Users(long id, String name, String password) {
		super();
		this.id = id;
		this.email = name;
		this.password = password;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return email;
	}
	public void setName(String name) {
		this.email = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
