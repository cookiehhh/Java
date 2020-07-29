package com.studentmanager.view;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import com.studentmanager.service.Manager;

public class Login extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton lin,reg,ex;
	JRadioButton tea,stu;
    JTextField jtf;
	JLabel jlb1,jlb2,jlb3,jlb4;
	JPasswordField jpf;
	ButtonGroup bg;
	
	
	public static void main(String[] args) {
		new Login();		
	}
	public Login(){
		lin=new JButton("登录");
		reg=new JButton("注册");
		ex=new JButton("退出");

		lin.addActionListener(this);
		reg.addActionListener(this);
		ex.addActionListener(this);
	
		tea=new JRadioButton("教师",true);
		stu=new JRadioButton("学生");
		bg=new ButtonGroup();
		bg.add(tea);
		bg.add(stu);
		
		jlb1=new JLabel("用户名：");
   	    jlb1.setFont(new Font("宋体",Font.BOLD,25));
	    jlb1.setHorizontalAlignment(JTextField.CENTER);
		jlb2=new JLabel("密  码：");
		jlb2.setFont(new Font("宋体",Font.BOLD,25));
	    jlb2.setHorizontalAlignment(JTextField.CENTER);
		jlb3=new JLabel("权  限：");
		jlb3.setFont(new Font("宋体",Font.BOLD,25));
	    jlb3.setHorizontalAlignment(JTextField.CENTER);
	    jlb4=new JLabel("学生成绩管理系统");
		jlb4.setFont(new Font("宋体",Font.BOLD,35));
	    jlb4.setHorizontalAlignment(JTextField.CENTER);
		
		jtf=new JTextField(10);
		jpf=new JPasswordField(10);

		this.add(jlb1);
		this.add(jtf);
		this.add(jlb2);
		this.add(jpf);
		this.add(jlb3);
		this.add(jlb4);
		this.add(tea);
		this.add(stu);
		this.add(lin);
		this.add(reg);
		this.add(ex);

		jlb1.setBounds(5, 120, 300, 80);
		jlb2.setBounds(5, 180, 300, 80);
		jlb3.setBounds(5, 250, 300, 80);
		jlb4.setBounds(90, 20, 300, 80);
		lin.setBounds(90, 350, 70, 30);
		reg.setBounds(190, 350, 70, 30);
		ex.setBounds(290, 350, 70, 30);
		tea.setBounds(220, 255, 70, 80);
		stu.setBounds(290, 255, 70, 80);
		jtf.setBounds(220, 145, 150, 35);
		jpf.setBounds(220, 205, 150, 35);
		
		
		this.setLayout(null);
		this.setTitle("学生成绩管理系统");
	    this.setBounds(750,150,500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	@SuppressWarnings("deprecation")
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand()=="退出"){
			System.exit(0);
		}
		else if(e.getActionCommand()=="登录"){
			if(!jtf.getText().isEmpty() && !jpf.getText().isEmpty()){
				if(tea.isSelected()){
					Manager.querytea(jtf.getText());
					if(Manager.pass ==null){
                         this.clear();
					}
					else{
						this.tealogin();
					}
				}
				else if(stu.isSelected()){
					Manager.querystu(jtf.getText());
					if(Manager.pass ==null){
                         this.clear();
					}
					else{
						this.stulogin();
					}
				}
			}
			else if(jtf.getText().isEmpty()){
				JOptionPane.showMessageDialog(null,"请输入用户名","提示消息",JOptionPane.WARNING_MESSAGE);
			    this.clear();
			}
			else if(jpf.getText().isEmpty()){
				JOptionPane.showMessageDialog(null,"请输入密码","提示消息",JOptionPane.WARNING_MESSAGE);
			    this.clear();
			}
		}else if(e.getActionCommand()=="注册"){
			if(tea.isSelected()){
				new TeacherRegister();
				
			}else if(stu.isSelected()) {
				new StudentRegister();
				
			}
		}			
	}

	@SuppressWarnings("deprecation")
	public void stulogin()
	{
		if(Manager.pass.equals(jpf.getText())){
			JOptionPane.showMessageDialog(null,"登录成功！","提示消息",JOptionPane.WARNING_MESSAGE);
			this.clear();
			 dispose();
			 StudentInterface stuif = new StudentInterface();
		}
		else if(jtf.getText().isEmpty()&&jpf.getText().isEmpty()){
			JOptionPane.showMessageDialog(null,"请输入用户名和密码！","提示消息",JOptionPane.WARNING_MESSAGE);
		}
		else if(jtf.getText().isEmpty()){
			JOptionPane.showMessageDialog(null,"请输入用户名！","提示消息",JOptionPane.WARNING_MESSAGE);
		}
		else if(jpf.getText().isEmpty()){
			JOptionPane.showMessageDialog(null,"请输入密码！","提示消息",JOptionPane.WARNING_MESSAGE);
		}
		else{
			JOptionPane.showMessageDialog(null,"用户名或者密码错误！\n请重新输入","提示消息",JOptionPane.ERROR_MESSAGE);
			this.clear();
		}
	}
	public void tealogin()
	{
		if(Manager.pass.equals(jpf.getText())){
			 JOptionPane.showMessageDialog(null,"登录成功！","提示消息",JOptionPane.WARNING_MESSAGE);
			 this.clear();	
			 dispose();
			 new TeacherInterface();
		}
		else if(jtf.getText().isEmpty()&&jpf.getText().isEmpty()){
			JOptionPane.showMessageDialog(null,"请输入用户名和密码！","提示消息",JOptionPane.WARNING_MESSAGE);
		}
		else if(jtf.getText().isEmpty()){
			JOptionPane.showMessageDialog(null,"请输入用户名！","提示消息",JOptionPane.WARNING_MESSAGE);
		}
		else if(jpf.getText().isEmpty()){
			JOptionPane.showMessageDialog(null,"请输入密码！","提示消息",JOptionPane.WARNING_MESSAGE);
		}
		else{
			JOptionPane.showMessageDialog(null,"用户名或者密码错误！\n请重新输入","提示消息",JOptionPane.ERROR_MESSAGE);
			this.clear();
		}
	}
	public	void clear(){
		jtf.setText("");
		jpf.setText("");
	}

}
