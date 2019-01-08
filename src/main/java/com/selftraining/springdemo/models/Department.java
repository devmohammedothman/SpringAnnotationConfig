package com.selftraining.springdemo.models;

import org.springframework.stereotype.Component;

@Component
public class Department {

	private int id;

	private String name;

	public Department() {
		this.name = "Java Development Team";
		System.out.println("Inside Department Constructor to be injected by field Autowiring into User Object");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
