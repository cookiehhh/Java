package com.librarymanager.pojo;

public class Record {
	private String username;
	private String num;
	private String name;
	private int date;
	private double rent;
	private String state;
	public Record() {};
	public Record(String username, String num, String name, int date, double rent, String state) {
		this.username = username;
		this.num = num;
		this.name = name;
		this.date = date;
		this.rent = rent;
		this.state = state;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public double getRent() {
		return rent;
	}
	public void setRent(double rent) {
		this.rent = rent;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
}
