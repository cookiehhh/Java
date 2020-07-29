package com.testio;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
//		int x=3;
//		int y=4;
//		float a=10;
//		float a1='a';
//		float a2=1.2f;
//		double d=10;
//		boolean b;
//		b = x<y || ++x == --y;
//		System.out.println(b);
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(8.1f%5);
//		System.out.println(a1);
		
//		char c = 66;
//		char b = '\141';
//		char c1 = (char)-1;
//		int i = c1;
//		
//		System.out.println(c);
//		System.out.println(i);
//		System.out.println(c1);
//		System.out.println(b);

		Random random1 = new Random(10); 
		  Random random2 = new Random(10); 
		  for(int i=0;i<5;i++){
		   System.out.print(random1.nextInt(5));
		  }
		  System.out.println();
		  for(int i=0;i<5;i++){
		   System.out.print(random2.nextInt(5));
		  }

	}


}
