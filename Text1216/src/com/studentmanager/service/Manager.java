package com.studentmanager.service;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.studentmanager.dao.DateConnection;
import com.studentmanager.pojo.Student;
import com.studentmanager.pojo.Studentuser;
import com.studentmanager.pojo.Teacheruser;

public class Manager {
	
	private static Connection conn = DateConnection.getConnection();
	private static PreparedStatement ps;
	private static ResultSet rs;
	
	public static String user;
	public static String pass;
	public static String id;
	public static String name;
	public static double chinese;
	public static double math;
	public static double english;

	public static void querystu(String username) {
		
		try {
			ps = (PreparedStatement)conn.prepareStatement("select * from studentuser where username=? ");
			ps.setString(1, username);
			rs = ps.executeQuery();
			if (rs.next()) {
				user = rs.getString(1).trim();
				pass = rs.getString(2).trim();
				System.out.println("成功获取到用户名和密码from数据库");
				System.out.println(user + "\t" + pass + "\t");
			}else
			{
				JOptionPane.showMessageDialog(null, "没有此用户，请重新输入！", "提示消息", JOptionPane.WARNING_MESSAGE);
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	public static void querytea(String username) {

		try {
			ps = (PreparedStatement)conn.prepareStatement("select * from teacheruser where username=? ");
			ps.setString(1, username);
			rs = ps.executeQuery();
			if (rs.next()) {
				user = rs.getString(1).trim();
				pass = rs.getString(2).trim();
				System.out.println("成功获取到用户名和密码from数据库");
				System.out.println(user + "\t" + pass + "\t");
			}else
			{
				JOptionPane.showMessageDialog(null, "没有此用户，请重新输入！", "提示消息", JOptionPane.WARNING_MESSAGE);
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	public static void selectid(String newid) {

		try {
			ps = (PreparedStatement)conn.prepareStatement("select * from student where id=? ");
			ps.setString(1, newid);
			rs = ps.executeQuery();
			if (rs.next()) {
				id = rs.getString(1).trim();
				name = rs.getString(2).trim();
				chinese = rs.getDouble(3);
				math = rs.getDouble(4);
				english = rs.getDouble(5);
				System.out.println("成功获取到用户名和密码from数据库");
				System.out.println(id + "\t" + name + "\t" + chinese + "\t" + math + "\t" + english + "\t");
			}else
			{
				JOptionPane.showMessageDialog(null, "没有此用户，请重新输入！", "提示消息", JOptionPane.WARNING_MESSAGE);
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	public static void selectname(String newname) {

		try {
			ps = (PreparedStatement)conn.prepareStatement("select * from student where name=? ");
			ps.setString(1, newname);
			rs = ps.executeQuery();
			if (rs.next()) {
				id = rs.getString(1).trim();
				name = rs.getString(2).trim();
				chinese = rs.getDouble(3);
				math = rs.getDouble(4);
				english = rs.getDouble(5);
				System.out.println("成功获取到用户名和密码from数据库");
				System.out.println(id + "\t" + name + "\t" + chinese + "\t" + math + "\t" + english + "\t");
			}else
			{
				JOptionPane.showMessageDialog(null, "没有此用户，请重新输入！", "提示消息", JOptionPane.WARNING_MESSAGE);
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	public static void insertStur(Studentuser newStu){		
	    try {   
	    	ps = (PreparedStatement)conn.prepareStatement("insert into studentuser (username,password) values(?,?)");
	        ps.setString(1, newStu.getUsername());
	        ps.setString(2, newStu.getPassword());
	        int i = ps.executeUpdate();
	        System.out.println("影响的数据行: " + i);
	    } catch (SQLException e) {
	        e.printStackTrace();		        
	    }
	}
	public static void insertTear(Teacheruser newTea){		
	    try {   
	    	ps = (PreparedStatement)conn.prepareStatement("insert into teacheruser (username,password) values(?,?)");
	        ps.setString(1, newTea.getUsername());
	        ps.setString(2, newTea.getPassword());
	        int i = ps.executeUpdate();
	        System.out.println("影响的数据行: " + i);
	    } catch (SQLException e) {
	        e.printStackTrace();		        
	    }
	}
	public static void insert(Student newStu){		
	    try {   
	    	ps = (PreparedStatement)conn.prepareStatement("insert into student (id,name,chinese,math,english) values(?,?,?,?,?)");
	        ps.setString(1, newStu.getId());
	        ps.setString(2, newStu.getName());
	        ps.setDouble(3, newStu.getChinese());
	        ps.setDouble(4, newStu.getMath());
	        ps.setDouble(5, newStu.getEnglish());
	        int i = ps.executeUpdate();
	        System.out.println("影响的数据行: " + i);
	    } catch (SQLException e) {
	        e.printStackTrace();		        
	    }
	}
	public static void update(Student newStu, String newid){	
	    try {   
	    	ps = (PreparedStatement)conn.prepareStatement("update student set id='" + newStu.getId() + "',name='" + newStu.getName() + "',chinese='" + newStu.getChinese() + "',math='" + newStu.getMath() + "',english='" + newStu.getEnglish() + "' where id='" + newid + "'");
//	        ps.setString(1, newStu.getId());
//	        ps.setString(2, newStu.getName());
//	        ps.setDouble(3, newStu.getChinese());
//	        ps.setDouble(4, newStu.getMath());
//	        ps.setDouble(5, newStu.getEnglish());
	    	int i = ps.executeUpdate();
		    System.out.println("影响的数据行: " + i);
	    } catch (SQLException e) {
	        e.printStackTrace();		        
	    }
	}

	public static void delete(String id) {
	    try {
	    	ps = (PreparedStatement)conn.prepareStatement("delete from student where id='" + id + "'");
	        int i = ps.executeUpdate();
	        System.out.println("影响的数据行: " + i);
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
}

