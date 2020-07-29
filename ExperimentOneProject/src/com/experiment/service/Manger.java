package com.experiment.service;

import java.util.ArrayList;
import java.util.List;

import com.experiment.pojp.Book;

public class Manger {

	private static List<Book> bookList = new ArrayList<Book>();
	
	public static void main(String[] args) {	
		//第一题
		bookList.add(new Book(1 , "Tomcat与Java Web开发技术详解" , 45 , 2));
		bookList.add(new Book(2 , "Java Web开发详解" , 99 , 1));
		bookList.add(new Book(3 , "XML实用教程" , 26 , 3));
		outPut();
		System.out.println("总价格：" + sumPrice() + "元");
		
		//第二题
		bookList.set(1, new Book(2 , "Java Web开发详解" , 99 , 5));
		System.out.println("总价格：" + sumPrice() + "元");
		
		//第三题
		bookList.add(new Book(4 , "HTML编程指南" , 28 , 10));
		outPut();
		System.out.println("总价格：" + sumPrice() + "元");
		
		//第四题
		bookList.remove(1);
		System.out.println("总价格：" + sumPrice() + "元");

	}
	public static double sumPrice() {
		double sumPrice = 0;
		for(Book b : bookList) {
			sumPrice +=b.sumPrice(b);
		}
		return sumPrice;
	}
	public static void outPut() {
		for(Book b : bookList) {
			System.out.println(b);
		}
	}

}
