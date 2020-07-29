package com.experiment.service;

import java.util.ArrayList;
import java.util.List;

import com.experiment.pojp.Book;

public class Manger {

	private static List<Book> bookList = new ArrayList<Book>();
	
	public static void main(String[] args) {	
		//��һ��
		bookList.add(new Book(1 , "Tomcat��Java Web�����������" , 45 , 2));
		bookList.add(new Book(2 , "Java Web�������" , 99 , 1));
		bookList.add(new Book(3 , "XMLʵ�ý̳�" , 26 , 3));
		outPut();
		System.out.println("�ܼ۸�" + sumPrice() + "Ԫ");
		
		//�ڶ���
		bookList.set(1, new Book(2 , "Java Web�������" , 99 , 5));
		System.out.println("�ܼ۸�" + sumPrice() + "Ԫ");
		
		//������
		bookList.add(new Book(4 , "HTML���ָ��" , 28 , 10));
		outPut();
		System.out.println("�ܼ۸�" + sumPrice() + "Ԫ");
		
		//������
		bookList.remove(1);
		System.out.println("�ܼ۸�" + sumPrice() + "Ԫ");

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
