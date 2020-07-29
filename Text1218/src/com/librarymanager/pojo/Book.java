package com.librarymanager.pojo;

public class Book {
	private String num;
	private String name;
	private String type;
	private double price;
	private String press;
	private String author;
	private int stock;
	public Book() {};
	public Book(String num, String name, String type, double price, String press, String author, int stock) {
		super();
		this.num = num;
		this.name = name;
		this.type = type;
		this.price = price;
		this.press = press;
		this.author = author;
		this.stock = stock;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPress() {
		return press;
	}
	public void setPress(String press) {
		this.press = press;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
}
