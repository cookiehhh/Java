package com.librarymanager.service;
import java.sql.*;

import javax.swing.JOptionPane;

import com.librarymanager.dao.SQLConnection;
import com.librarymanager.pojo.Book;
import com.librarymanager.pojo.Type;
import com.librarymanager.pojo.Users;

public class Manager {
	private static Connection conn = SQLConnection.getConnection();
	private static PreparedStatement ps;
	private static ResultSet rs;
	public static Users user = new Users();
	public static void query(String username) {
		try {
			ps = (PreparedStatement)conn.prepareStatement("select * from users where username='" + username + "'");
			rs = ps.executeQuery();
			if (rs.next()) {
				user.setUsername(rs.getString(1).trim());
				user.setPassword(rs.getString(2).trim());
				System.out.println("成功获取到用户名和密码from数据库");
				System.out.println(user.getUsername() + "\t" + user.getPassword() + "\t");
			}else
			{
				JOptionPane.showMessageDialog(null, "没有此用户，请重新输入！", "提示消息", JOptionPane.WARNING_MESSAGE);
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	public static void reporquery(String username) {
		try {
			ps = (PreparedStatement)conn.prepareStatement("select * from repor where username='" + username + "'");
			rs = ps.executeQuery();
			if (rs.next()) {
				user.setUsername(rs.getString(1).trim());
				user.setPassword(rs.getString(2).trim());
				System.out.println("成功获取到用户名和密码from数据库");
				System.out.println(user.getUsername() + "\t" + user.getPassword() + "\t");
			}else
			{
				JOptionPane.showMessageDialog(null, "没有此用户，请重新输入！", "提示消息", JOptionPane.WARNING_MESSAGE);
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	public static void register(Users User){		
	    try {   
	    	ps = (PreparedStatement)conn.prepareStatement("insert into users (username,password) values(?,?)");
	        ps.setString(1, User.getUsername());
	        ps.setString(2, User.getPassword());
	        int i = ps.executeUpdate();
	        System.out.println("影响的数据行: " + i);
	    } catch (SQLException e) {
	        e.printStackTrace();		        
	    }
	}
	public static void insertbook(Book book){		
	    try {   
	    	ps = (PreparedStatement)conn.prepareStatement("insert into book (num,name,type,price,press,author,stock) "
	    			+ "values(?,?,?,?,?,?,?)");
	        ps.setString(1, book.getNum());
	        ps.setString(2, book.getName());
	        ps.setString(3, book.getType());
	        ps.setDouble(4, book.getPrice());
	        ps.setString(5, book.getPress());
	        ps.setString(6, book.getAuthor());
	        ps.setInt(7, book.getStock());
	        int i = ps.executeUpdate();
	        System.out.println("影响的数据行: " + i);
	    } catch (SQLException e) {
	        e.printStackTrace();		        
	    }
	}
	public static void inserttype(Type type){		
	    try {   
	    	ps = (PreparedStatement)conn.prepareStatement("insert into type (id,type,rent) values(?,?,?)");
	        ps.setString(1, type.getId());
	        ps.setString(2, type.getType());
	        ps.setDouble(3, type.getRent());
	        int i = ps.executeUpdate();
	        System.out.println("影响的数据行: " + i);
	    } catch (SQLException e) {
	        e.printStackTrace();		        
	    }
	}
	public static void deletebook(String num) {
	    try {
	    	ps = (PreparedStatement)conn.prepareStatement("delete from book where num='" + num + "'");
	        int i = ps.executeUpdate();
	        System.out.println("影响的数据行: " + i);
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
	public static void deletetype(String type) {
	    try {
	    	ps = (PreparedStatement)conn.prepareStatement("delete from type where type='" + type + "'");
	        int i = ps.executeUpdate();
	        System.out.println("影响的数据行: " + i);
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
	public static void repor(Users user){
		
	    try {   
	    	ps = (PreparedStatement)conn.prepareStatement("insert into repor (username,password) values(?,?)");
	        ps.setString(1, user.getUsername());
	        ps.setString(2, user.getPassword());
	        int i = ps.executeUpdate();
	        System.out.println("影响的数据行: " + i);
	    } catch (SQLException e) {
	        e.printStackTrace();		        
	    }
	    try {
	    	ps = (PreparedStatement)conn.prepareStatement("delete from users where username='" + user.getUsername().trim() + "'");
	        int i = ps.executeUpdate();
	        System.out.println("影响的数据行: " + i);
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
	public static void cancelrepor(Users user){
		
	    try {   
	    	ps = (PreparedStatement)conn.prepareStatement("insert into users (username,password) values(?,?)");
	        ps.setString(1, user.getUsername());
	        ps.setString(2, user.getPassword());
	        int i = ps.executeUpdate();
	        System.out.println("影响的数据行: " + i);
	    } catch (SQLException e) {
	        e.printStackTrace();		        
	    }
	    try {
	    	ps = (PreparedStatement)conn.prepareStatement("delete from repor where username='" + user.getUsername().trim() + "'");
	        int i = ps.executeUpdate();
	        System.out.println("影响的数据行: " + i);
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
}
