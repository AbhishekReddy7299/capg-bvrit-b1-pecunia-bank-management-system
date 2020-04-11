package com.capg.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capg.springboot.model.Student;
import com.capg.springboot.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	@Autowired
	StudentService service;

	//@RequestMapping(value = "/message", method = RequestMethod.GET)
	@GetMapping("/message")
	public String getMessage() {
		return "Student profile";
	}
	
	@GetMapping("/users")
	public ResponseEntity<List<Student>> getAllUser(){
		List<Student> allUsers=service.getListOfUsers();
		if(allUsers.isEmpty()){
			return new ResponseEntity<List<Student>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Student>>(allUsers,HttpStatus.OK);
	}
	
	@GetMapping("/users/id/{id}")
	public ResponseEntity<Student> getUserById(@PathVariable("id") int studentId) {
		
		Student user= service.getStudent(studentId);
		if(user==null) {
			return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Student>(user,HttpStatus.OK);
	}
	
	@PostMapping("/users")
	public ResponseEntity<Student> addUser(@RequestBody Student user){
		service.addStudent(user);
		if(service.getStudent(user.getUserId())==null) {
			return new ResponseEntity<Student>(HttpStatus.NOT_MODIFIED);
		}
		return new ResponseEntity<Student>(user,HttpStatus.CREATED);
	}
	
	@PutMapping("/users")
	public ResponseEntity<Student> updateUser(@RequestBody Student user){
		
		if(service.getStudent(user.getUserId())==null) {
			return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
		}
		Student newUserData=service.updateUser(user);
		
		return new ResponseEntity<Student>(user,HttpStatus.OK);
		
	}
	
	@DeleteMapping("/users/id/{id}")
	public ResponseEntity<Student> deleteUser(@PathVariable("id") int userId) {
		if(service.deleteStudent(userId)) {
			return new ResponseEntity<Student>(HttpStatus.OK);
		}
		return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
	}
	
	
}