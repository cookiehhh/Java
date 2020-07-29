package com.experiment.pojp;

public class Books {
	
	private String name;
	private String author;
	private String press;
	private String num;
	private double price;
	private String date;
	
	public Books() {}
	
	public Books(String name, String author, String press, String num, double price, String date) {
		this.name = name;
		this.author = author;
		this.press = press;
		this.num = num;
		this.price = price;
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPress() {
		return press;
	}
	public void setPress(String press) {
		this.press = press;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Books [name=" + name + ", author=" + author + ", press=" + press + ", num=" + num + ", price=" + price
				+ ", date=" + date + "]";
	}
	
	
	
	
}
