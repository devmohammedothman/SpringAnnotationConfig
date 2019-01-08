package com.selftraining.springdemo.models;

import org.springframework.stereotype.Component;

@Component
public class Address {

	private int flatNo;

	private int streetNo;

	private String streetName;

	public Address() {
		this.flatNo = 8;
		this.streetNo = 40;
		this.streetName = "Zedan st";
	}

	public Address(int flatNo, int streetNo, String streetName) {
		this.flatNo = flatNo;
		this.streetNo = streetNo;
		this.streetName = streetName;
	}

	public int getFlatNo() {
		return flatNo;
	}

	public void setFlatNo(int flatNo) {
		this.flatNo = flatNo;
	}

	public int getStreetNo() {
		return streetNo;
	}

	public void setStreetNo(int streetNo) {
		this.streetNo = streetNo;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

}
