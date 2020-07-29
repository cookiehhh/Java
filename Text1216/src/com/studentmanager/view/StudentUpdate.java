package com.studentmanager.view;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.studentmanager.service.Manager;

public class StudentUpdate extends JFrame implements ActionListener{
	static String newid;
	JButton sel;
    JButton cal;
    JTextField jtf;
    JLabel la1;
    JLabel la2;

	public StudentUpdate() {
		this.setTitle("学生信息管理系统");
   	 
        sel = new JButton("确定");
        sel.addActionListener(this);
        cal = new JButton("取消");
        cal.addActionListener(this);
        jtf = new JTextField(25);
        jtf.setFont(new Font("宋体",Font.BOLD,25));
        la1 = new JLabel("输入学号：");
        la1.setFont(new Font("宋体",Font.BOLD,25));
        la1.setHorizontalAlignment(JTextField.CENTER);
        la2 = new JLabel("学生信息修改");
        la2.setForeground(Color.gray);
        la2.setFont(new Font("宋体",Font.BOLD,40));
        la2.setHorizontalAlignment(JTextField.CENTER);
        
        this.add(sel);
        this.add(cal);
        this.add(jtf);
        this.add(la1);
        this.add(la2);

        sel.setBounds(50,270,100,50);
        cal.setBounds(200,270,100,50);
        jtf.setBounds(180,120,180,50);
        la1.setBounds(0,120,180,50);
        la2.setBounds(0,0,360,40);
        
        this.setLayout(null);
        this.setBounds(800,300,400,500);
        this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("确定")  &&!jtf.getText().isEmpty()) {
			newid = jtf.getText().trim();
			Manager.selectid(newid);
			new StudentUpdateInsertface();
		}else if (e.getActionCommand().equals("取消")) {
			System.exit(0);
		}else{
			JOptionPane.showMessageDialog(null , "请输入要修改的编号","提示消息",JOptionPane.WARNING_MESSAGE);
		}
	}
}
