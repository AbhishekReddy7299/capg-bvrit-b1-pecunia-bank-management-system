package com.capg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("trainee")
public class Trainee {
	 @Value("${trainee.id}")
	 private int id;
	 @Value("${trainee.name}")
	private String Name;
	 @Value("${trainee.technology}")
	private String technology;
	@Autowired
	private Traineer trainer;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getTechnology() {
		return technology;
	}


	public void setTechnology(String technology) {
		this.technology = technology;
	}


	 	public void display() {
		System.out.println(" "+id+"\n"+Name+"\n"+technology+"\n"+trainer.getTname()+"\n"+trainer.getExpertise());
	}

	 



	

}
