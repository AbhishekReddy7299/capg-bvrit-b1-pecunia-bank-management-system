package com.capg.demo.model;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class User {
	@Size(min=3,max=30)
	private String username;
	@Email
	private String email;
	@Size(max=80,min=15)
	private int age;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate dob;
	public User() {
		
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", email=" + email + ", age=" + age + ", dob=" + dob + "]";
	}
	public User(String username, String email, int age, LocalDate dob) {
		super();
		this.username = username;
		this.email = email;
		this.age = age;
		this.dob = dob;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
}
