package com.capg.EmployeeDetails;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component("employee")
public class Employee {
	
	@Value("${employee.employeeId}")
	public int employeeId;
	@Value("${employee.employeeName}")
	public String employeeName;
	@Value("${employee.salary}")
	public double salary;
	public SBU businessUnit;
	@Value("${employee.age}")
	public int age;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
				+ ", businessUnit=" + getSbuDetails() + ", age=" + age + "]";
	}
	
	public Employee(int employeeId, String employeeName, double salary, SBU businessUnit, int age) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.businessUnit = businessUnit;
		this.age = age;
	}
	public Employee() {
		super();
	}
	
	public SBU getSbuDetails() {
		ApplicationContext c=new AnnotationConfigApplicationContext(EmployeeConfiguration.class);
        businessUnit=(SBU)c.getBean("sbu");
		return businessUnit;
	}

}
