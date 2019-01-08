package com.selftraining.springdemo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.selftraining.springdemo.models.Permission;

@Component
public class PermissionService {

	public List<Permission> getUserPermissions() {
		
		List<Permission> permissionList = new ArrayList<Permission>();
		
		permissionList.add(new Permission(10, "View All", 20));
		permissionList.add(new Permission(11, "Update", 20));
		permissionList.add(new Permission(12, "Create", 20));
		permissionList.add(new Permission(13, "Delete", 20));
		return permissionList;
	}

}