package com.project.web.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Userslist {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	private String firstname;
	private String lastname;
	private String phonenumber;
	private String username;
	private String password;
	private String usertype;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getfirstname() {
		return firstname;
	}
	public void setfirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getlastname() {
		return lastname;
	}
	public void setlastname(String lastname) {
		this.lastname = lastname;
	}
	public String getphonenumber() {
		return phonenumber;
	}
	public void setphonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getusername() {
		return username;
	}
	public void setusername(String username) {
		this.username = username;
	}
	public String getpassword() {
		return password;
	}
	public void setpassword(String Password) {
		this.password = Password;
	}
	public String getusertype() {
		return usertype;
	}
	public void setusertype(String usertype) {
		this.usertype = usertype;
	}
	public Userslist(int id,String firstname,String lastname,String phonenumber,String username,String password,String user_type, String usertype) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname =lastname;
		this.username = username;
		this.password = password;
		this.usertype = usertype;
		this.phonenumber=phonenumber;
	}
	
public Userslist() {
		
	}
	@Override
	public String toString() {
		return "userslist [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", phonenumber="
				+ phonenumber + ", username=" + username + ", password=" + password + ", usertype=" + usertype + "]";
	}
	
	
	
	
	
}
