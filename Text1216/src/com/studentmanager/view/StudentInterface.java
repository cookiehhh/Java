package com.studentmanager.view;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class StudentInterface extends JFrame implements ActionListener {

	JButton jb1,jb2;
	JLabel jlb1;
	
	public StudentInterface() {
		this.setLayout(null);
		this.setTitle("学生信息管理系统");
		
		jb1=new JButton("学号查询");
		jb2=new JButton("姓名查询");
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		
		jlb1=new JLabel("学生成绩查询");
		jlb1.setFont(new Font("宋体",Font.BOLD,30));
        jlb1.setHorizontalAlignment(JTextField.CENTER);
		
		this.add(jlb1);
		this.add(jb1);
		this.add(jb2);
		
		jlb1.setBounds(0,0,360,40);
		jb1.setBounds(120,80,150,50);
		jb2.setBounds(120,180,150,50);
		
		this.setBounds(900,300,400,350);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("学号查询")){
			StudentSelectId stu = new StudentSelectId();
		}
		if(e.getActionCommand().equals("姓名查询")){
			StudentSelectName stu = new StudentSelectName();
		}
	}

	
}
