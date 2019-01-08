package com.selftraining.springdemo.models;

public class Permission {

	private int permissionId;

	private String permissionName;

	private int userId;

	public Permission(int permissionId, String permissionName, int userId) {
		super();
		this.permissionId = permissionId;
		this.permissionName = permissionName;
		this.userId = userId;
	}

	public int getPermissionId() {
		return permissionId;
	}

	public void setPermissionId(int permissionId) {
		this.permissionId = permissionId;
	}

	public String getPermissionName() {
		return permissionName;
	}

	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}
