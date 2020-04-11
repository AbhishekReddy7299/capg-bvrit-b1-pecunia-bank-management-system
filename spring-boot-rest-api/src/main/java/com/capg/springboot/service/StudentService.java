package com.capg.springboot.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.springboot.model.Student;
import com.capg.springboot.repository.StudentRepo;

@Service
public class StudentService {

	@Autowired
	StudentRepo repo;
	
	public List<Student> getListOfUsers(){
		return repo.getAllStudents();
	}
	
	public Student getStudent(int studentId) {
		return repo.getStudent(studentId);
	}
	
	@Transactional
	public Student addStudent(Student student) {
		return repo.addStudent(student);
	}
	
	@Transactional
	public boolean deleteStudent(int studentId) {
		Student student=getStudent(studentId);
		 return repo.deleteStudent(student);
	}

	@Transactional
	public Student updateUser(Student newStudentData) {
		return repo.updateUser(newStudentData);
		
	}
	
	
}