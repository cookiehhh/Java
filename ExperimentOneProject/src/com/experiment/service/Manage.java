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
		
		Books book1 = new Books("Tomcat��Java Web�����������" , "������" , "���ӹ�ҵ������" , "7-5053-9392-8" , 45 , "2004.04");
		Books book2 = new Books("Java Web�������" , "����" , "���ӹ�ҵ������" , "7-121-02396-2" , 99 , "2006.04");
		Books book3 = new Books("XMLʵ�ý̳�" , "��Ծ��" , "������ѧ������" , "7-301-10462-6" , 26 , "2006.01");
		Books book4 = new Books("HTML���ָ��" , "����" , "���ӹ�ҵ������" , "7-5053-5186-9" , 28 , "1999.06");
		
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
		System.out.println("������ͼ�鿯�ţ�");
		String inputKey;
		try {
			inputKey = input.next();
			if (booksMap.containsKey(inputKey)) {
				System.out.println(booksMap.get(inputKey));
			}else {
				System.out.println("�����ڿ�����" + inputKey + "��ͼ��");
			}
	    } catch (InputMismatchException e) {
	        // TODO: handle exception
	        System.out.println("������󣡣����������룡");
	        
	    }
	}
}
