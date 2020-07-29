package com.librarymanager.pojo;

public class Type {
	private String id;
	private String type;
	private double rent;
	public Type() {};
	public Type(String num, String name, double price) {
		this.id = num;
		this.type = name;
		this.rent = price;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getRent() {
		return rent;
	}
	public void setRent(double rent) {
		this.rent = rent;
	}
	
	
}
