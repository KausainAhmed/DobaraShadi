package com.Entity;

public class User {
	private int id;
	private String Uname;
	private String Password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUname() {
		return Uname;
	}

	public void setUname(String uname) {
		Uname = uname;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", Uname=" + Uname + ", Password=" + Password + "]";
	}

	public User(int id, String uname, String password) {
		super();
		this.id = id;
		Uname = uname;
		Password = password;
	}

	public User() {
		super();

	}
}
