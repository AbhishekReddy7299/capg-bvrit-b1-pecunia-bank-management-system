

package com.capg.springboot.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capg.springboot.model.Student;

@Repository
public class StudentRepo {

	@PersistenceContext
	EntityManager em;
	
	public Student addStudent(Student student) {
		em.persist(student);
		return student;
	}
	
	public  Student getStudent(int studentId) {
		return em.find(Student.class, studentId);
	}
	
	public List<Student> getAllStudents(){
		TypedQuery<Student> queryGetAll=em.createQuery("from User",Student.class);
		return queryGetAll.getResultList();
	}
	
	public boolean deleteStudent(Student student) {
		em.remove(student);
		return !em.contains(student);
	}
	public Student updateUser(Student user) {
		return em.merge(user);
	}
}

