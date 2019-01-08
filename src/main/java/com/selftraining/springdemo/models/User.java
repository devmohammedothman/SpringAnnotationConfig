package com.selftraining.springdemo.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.selftraining.springdemo.services.PermissionService;

@Component
@Scope("prototype")
public class User {

	private int id;

	private String fullName;

	private Address address;

	private PermissionService permissionService;

	@Autowired
	private Department department;

	public User() {

		System.out.println("Inside User Default Constructor");
	}

	@Autowired
	public User(Address address) {
		System.out.println("Inside User Injected Constructor");
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public PermissionService getPermissionService() {
		return permissionService;
	}

	@Autowired
	public void setPermissionService(PermissionService permissionService) {
		this.permissionService = permissionService;
	}

	public String getUserDepartment() {
		return this.department.getName();
	}

}
