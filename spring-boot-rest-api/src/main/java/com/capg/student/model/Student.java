package com.capg.student.model;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_info")
public class Student {

	@Id
	private int studentId;
	private String studentName;
	private LocalDate studentDob;
//	public User(int userId, String userName, String email, long phone) {
//		super();
//		this.userId = userId;
//		this.userName = userName;
//		this.email = email;
//		
//	}
	
//	public User() {
//		// TODO Auto-generated constructor stub
//	}
	public Student(int studentId, String studentName, LocalDate studentDob) {
	super();
	this.studentId = studentId;
	this.studentName = studentName;
	this.studentDob = studentDob;
}
	public int getUserId() {
		return studentId;
	}
	public void setUserId(int userId) {
		this.studentId = userId;
	}
	public String getUserName() {
		return studentName;
	}
	public void setUserName(String userName) {
		this.studentName = userName;
	}
	public LocalDate getStudentDob() {
		return studentDob;
	}
	public void setStudentDob(LocalDate studentDob) {
		this.studentDob = studentDob;
	}
	@Override
	public String toString() {
		return "User [studentId=" + studentId + ", studentName=" + studentName + ", studentDob=" + studentDob + "]";
	}
	
	
	
	
}