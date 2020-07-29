package com.librarymanager.view;
import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.librarymanager.service.Manager;

public class Login extends Panel implements ActionListener{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton lin,ex;
	JTextField jtf;
	JPasswordField jpf;
	JLabel jlb1,jlb2,jlb3;
	
	public Login(Window parent) {
		
		lin=new JButton("登录");
		ex=new JButton("退出");

		lin.addActionListener(this);
		ex.addActionListener(this);
		
		jlb1=new JLabel("用户名：");
   	    jlb1.setFont(new Font("宋体",Font.BOLD,25));
	    jlb1.setHorizontalAlignment(JTextField.CENTER);
		jlb2=new JLabel("密  码：");
		jlb2.setFont(new Font("宋体",Font.BOLD,25));
	    jlb2.setHorizontalAlignment(JTextField.CENTER);
	    jlb3=new JLabel("图书管理系统");
	    jlb3.setForeground(Color.gray);
		jlb3.setFont(new Font("宋体",Font.BOLD,40));
	    jlb3.setHorizontalAlignment(JTextField.CENTER);
		
		jtf=new JTextField(10);
		jpf=new JPasswordField(10);

		this.add(jlb1);
		this.add(jtf);
		this.add(jlb2);
		this.add(jpf);
		this.add(jlb3);
		this.add(lin);
		this.add(ex);

		jlb1.setBounds(5, 120, 300, 80);
		jlb2.setBounds(5, 180, 300, 80);
		jlb3.setBounds(90, 20, 300, 80);
		lin.setBounds(100, 300, 80, 50);
		ex.setBounds(300, 300, 80, 50);
		jtf.setBounds(220, 145, 150, 35);
		jpf.setBounds(220, 205, 150, 35);
		
		this.setLayout(null);
		this.setVisible(true);
	}
	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand()=="退出"){
			System.exit(0);
		}else if(e.getActionCommand()=="登录"){
			if(!jtf.getText().isEmpty() && !jpf.getText().isEmpty()){
				Manager.query(jtf.getText());
				if(Manager.user.getPassword() == null){
					jtf.setText("");
					jpf.setText("");
				}else{
					this.login();
				}
			}
		}else if(jtf.getText().isEmpty()){
			JOptionPane.showMessageDialog(this,"请输入用户名","提示消息",JOptionPane.WARNING_MESSAGE);
		}else if(jpf.getText().isEmpty()){
			JOptionPane.showMessageDialog(this,"请输入密码","提示消息",JOptionPane.WARNING_MESSAGE);
		}
	}		
	
	@SuppressWarnings("deprecation")
	public void login()
	{
		if(Manager.user.getPassword().equals(jpf.getText())){
			 JOptionPane.showMessageDialog(this,"登录成功！","提示消息",JOptionPane.WARNING_MESSAGE);
			 new MainInterface();
		}
		else if(jtf.getText().isEmpty()&&jpf.getText().isEmpty()){
			JOptionPane.showMessageDialog(this,"请输入用户名和密码！","提示消息",JOptionPane.WARNING_MESSAGE);
		}
		else if(jtf.getText().isEmpty()){
			JOptionPane.showMessageDialog(this,"请输入用户名！","提示消息",JOptionPane.WARNING_MESSAGE);
		}
		else if(jpf.getText().isEmpty()){
			JOptionPane.showMessageDialog(this,"请输入密码！","提示消息",JOptionPane.WARNING_MESSAGE);
		}
		else{
			JOptionPane.showMessageDialog(this,"用户名或者密码错误！\n请重新输入","提示消息",JOptionPane.ERROR_MESSAGE);
		}
	}
		
}
