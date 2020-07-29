package com.experiment.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.experiment.pojp.Books;

public class Manage {
	
	private static Map<String,Books> booksMap = new HashMap<String,Books>();
	
	public static void main(String[] args) {
		
		Books book1 = new Books("Tomcat与Java Web开发技术详解" , "孙卫琴" , "电子工业出版社" , "7-5053-9392-8" , 45 , "2004.04");
		Books book2 = new Books("Java Web开发详解" , "孙鑫" , "电子工业出版社" , "7-121-02396-2" , 99 , "2006.04");
		Books book3 = new Books("XML实用教程" , "丁跃潮" , "北京大学出版社" , "7-301-10462-6" , 26 , "2006.01");
		Books book4 = new Books("HTML编程指南" , "武焰" , "电子工业出版社" , "7-5053-5186-9" , 28 , "1999.06");
		
		booksMap.put(book1.getNum(), book1);
		booksMap.put(book2.getNum(), book2);
		booksMap.put(book3.getNum(), book3);
		booksMap.put(book4.getNum(), book4);
				
		for(Books book : booksMap.values()) {
			System.out.println(book);
		}
		select();
		
	}
	public static void select() {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入图书刊号：");
		String inputKey;
		try {
			inputKey = input.next();
			if (booksMap.containsKey(inputKey)) {
				System.out.println(booksMap.get(inputKey));
			}else {
				System.out.println("不存在刊号是" + inputKey + "的图书");
			}
	    } catch (InputMismatchException e) {
	        // TODO: handle exception
	        System.out.println("输入错误！，请重新输入！");
	        
	    }
	}
}
