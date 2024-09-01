package com.nithish.User_Service;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User 
{
	@Id
	@Column(name="userid")
	private int userid;
	
	@Column(name="username")
	private String username;
	
	@Column(name="address")
	private String address;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="phone")
	private String phone;
	
	
	//Generate getter setter
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	public User(int userid, String username, String address, String email, String password, String phone) {
		super();
		this.userid = userid;
		this.username = username;
		this.address = address;
		this.email = email;
		this.password = password;
		this.phone = phone;
	}
	//Generate Constructor -parameterized constructors
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// Generate toString()
	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", address=" + address + ", email=" + email
				+ ", password=" + password + ", phone=" + phone + "]";
	}
	
	
}
