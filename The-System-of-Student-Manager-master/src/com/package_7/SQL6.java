/*
 * ���ܣ����������ݿ�SQLserver�������ӣ��Լ���Ӧ�Ĳ�ѯ������
 */
package com.package_7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

//дһ���࣬���������ݿ⽨�����ӣ����Ҳ�ѯ����
class GetSQL {
	// �趨�û���������
	static String userword;
	static String pwd;
	
	static String english;
	static String num;
	static String name;
	static String chinese;
	static String zhengzhi;
	static String math;
	
	static String age;
	static String salary;
	static String sex;
	static String zhicheng;
	static String teanum;
	static String teaname;

	static Connection ct = null;
	static PreparedStatement ps = null;
	static ResultSet rs = null;

	// �����������ݿ�ķ���������������ļ̳�
	public static void ConnectSQL() {
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			ct = DriverManager.getConnection("jdbc:odbc:ywq");
			System.out.println("The SQL is connected");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// ���������ݿ���в�ѯ�ķ���
	public static void querystu(String s,String username) {
		// ���������
		try {
			ps = ct.prepareStatement("select * from info where Ȩ��=? and �û���=? ");
			// ��?��ֵ(�ɷ�ֹSQLע��©������)����Ҫֱ��ʹ��ƴ�ӵķ�ʽ
			ps.setString(1, s);
			ps.setString(2, username);
			// ResultSet�����,��ҿ��԰�ResultSet���ɷ���һ�ű��еĽ����
			rs = ps.executeQuery();
			// ѭ��ȡ��
			if (rs.next()) {
				// ����ʦ���û���������ȡ��
				userword = rs.getString(2);
				pwd = rs.getString(3);
				System.out.println("�ɹ���ȡ��������û���from���ݿ�");
				System.out.println(userword + "\t" + pwd + "\t");
				
				//���õ�¼����
			
			}else
			{
				JOptionPane.showMessageDialog(null, "û�д��û������������룡", "��ʾ��Ϣ", JOptionPane.WARNING_MESSAGE);
			    
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	//�ڽ�ʦ���н��в�ѯ
	public static void querytea(String s,String name ) {
		// ���������
		try {
			ps = ct.prepareStatement("select * from info_tea where Ȩ��=? and �û���=? ");
			// ��?��ֵ(�ɷ�ֹSQLע��©������)����Ҫֱ��ʹ��ƴ�ӵķ�ʽ
			ps.setString(1, s);
			ps.setString(2, name);
			// ResultSet�����,��ҿ��԰�ResultSet���ɷ���һ�ű��еĽ����
			rs = ps.executeQuery();
			// ѭ��ȡ��
			if (rs.next()) {
				// ����ʦ���û���������ȡ��
				userword = rs.getString(2);
				pwd = rs.getString(3);
				System.out.println("�ɹ���ȡ��������û���from���ݿ�");
				System.out.println(userword + "\t" + pwd + "\t");
			}else
			{
				JOptionPane.showMessageDialog(null, "û�д��û������������룡", "��ʾ��Ϣ", JOptionPane.WARNING_MESSAGE);
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	//�����ݿ��и���ѧ�Ż��߽̹�������ѯ���ݣ�����������
	public static void getdatastu(String s) {
		// ���������
		try {
			ps = ct.prepareStatement("select * from info where ѧ�� =? ");
			// ��?��ֵ(�ɷ�ֹSQLע��©������)����Ҫֱ��ʹ��ƴ�ӵķ�ʽ
			ps.setString(1, s);
			// ResultSet�����,��ҿ��԰�ResultSet���ɷ���һ�ű��еĽ����
			rs = ps.executeQuery();
			if(rs.next())	
			{
				// ����ʦ���û���������ȡ��
				num = rs.getString(4);
				name = rs.getString(5);
				math = rs.getString(6);
				chinese = rs.getString(7);
				english = rs.getString(8);
				zhengzhi = rs.getString(9);
			}else
			{
				JOptionPane.showMessageDialog(null, "�]�д�ѧ��������������", "��ʾ��Ϣ", JOptionPane.WARNING_MESSAGE);
			}
	
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	public static void getdatatea(String s) {
		// ���������
		try {
			ps = ct.prepareStatement("select * from info_tea where ��ʦ��ź� =? ");
			// ��?��ֵ(�ɷ�ֹSQLע��©������)����Ҫֱ��ʹ��ƴ�ӵķ�ʽ
			ps.setString(1, s);
			// ResultSet�����,��ҿ��԰�ResultSet���ɷ���һ�ű��еĽ����
			rs = ps.executeQuery();
			if(rs.next())	
			{
				// ����ʦ���û���������ȡ��
				teanum = rs.getString(4);
				teaname = rs.getString(5);
				sex = rs.getString(6);
				salary = rs.getString(7);
				zhicheng = rs.getString(8);
				age = rs.getString(9);
			}else
			{
				JOptionPane.showMessageDialog(null, "�]�д˽�ʦ������������", "��ʾ��Ϣ", JOptionPane.WARNING_MESSAGE);
			}
	
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
}