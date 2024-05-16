package com.employee.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class LoginData {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	String uname;
	String phoneNo;
	String email;
	String password;

	public LoginData(int id,String uname, String phoneNo, String email, String password) {
		super();
		this.id=id;
		this.uname = uname;
		this.phoneNo = phoneNo;
		this.email = email;
		this.password = password;
	}

	public LoginData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "LoginData [id=" + id + ", uname=" + uname + ", phoneNo=" + phoneNo + ", email=" + email + ", password="
				+ password + "]";
	}
	
	
	

}
