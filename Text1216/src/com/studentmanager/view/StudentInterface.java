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
		this.setTitle("ѧ����Ϣ����ϵͳ");
		
		jb1=new JButton("ѧ�Ų�ѯ");
		jb2=new JButton("������ѯ");
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		
		jlb1=new JLabel("ѧ���ɼ���ѯ");
		jlb1.setFont(new Font("����",Font.BOLD,30));
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
		if(e.getActionCommand().equals("ѧ�Ų�ѯ")){
			StudentSelectId stu = new StudentSelectId();
		}
		if(e.getActionCommand().equals("������ѯ")){
			StudentSelectName stu = new StudentSelectName();
		}
	}

	
}
