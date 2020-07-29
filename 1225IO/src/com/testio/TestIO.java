package com.testio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestIO {

	static File data = new File("data.txt");
	static File data1 = new File("data1.txt");
	
	public static void main(String[] args) {
		try {
			//copyByInputStatement();
			copyByWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	private static void copyByWriter() throws IOException{
		FileReader fr = new FileReader(data);
		FileReader fr1 = new FileReader(data1);
		FileWriter fw = new FileWriter(data1);
		
		char []c = new char[1024];
		
		int len = fr.read(c);
		System.out.println(len);

		String str = new String(c, 0, len);
		System.out.println(str);
		fr.close();
		
		fw.write(str);
		fw.close();
		
		
		int len1 = fr1.read(c);
		System.out.println(len1);

		String str1 = new String(c, 0, len1);
		System.out.println(str1);
		fr1.close();
		
		
	}

	private static void copyByInputStatement() throws IOException {
		FileInputStream fis = new FileInputStream(data);
		FileInputStream fis1 = new FileInputStream(data);
		FileOutputStream fos = new FileOutputStream(data1);
		
		byte[] b = new byte[1024];

		int len = fis.read(b);
		System.out.println(len);

		String str = new String(b, 0, len);
		System.out.println(str);
		
		fis.close();
		
		fos.write(b, 0, len);
		
		fos.close();
		
		int len1 = fis.read(b);
		System.out.println(len1);

		String str1 = new String(b, 0, len);
		System.out.println(str1);
		
	}

}
