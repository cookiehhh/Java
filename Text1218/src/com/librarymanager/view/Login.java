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
		
		lin=new JButton("��¼");
		ex=new JButton("�˳�");

		lin.addActionListener(this);
		ex.addActionListener(this);
		
		jlb1=new JLabel("�û�����");
   	    jlb1.setFont(new Font("����",Font.BOLD,25));
	    jlb1.setHorizontalAlignment(JTextField.CENTER);
		jlb2=new JLabel("��  �룺");
		jlb2.setFont(new Font("����",Font.BOLD,25));
	    jlb2.setHorizontalAlignment(JTextField.CENTER);
	    jlb3=new JLabel("ͼ�����ϵͳ");
	    jlb3.setForeground(Color.gray);
		jlb3.setFont(new Font("����",Font.BOLD,40));
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
		if(e.getActionCommand()=="�˳�"){
			System.exit(0);
		}else if(e.getActionCommand()=="��¼"){
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
			JOptionPane.showMessageDialog(this,"�������û���","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE);
		}else if(jpf.getText().isEmpty()){
			JOptionPane.showMessageDialog(this,"����������","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE);
		}
	}		
	
	@SuppressWarnings("deprecation")
	public void login()
	{
		if(Manager.user.getPassword().equals(jpf.getText())){
			 JOptionPane.showMessageDialog(this,"��¼�ɹ���","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE);
			 new MainInterface();
		}
		else if(jtf.getText().isEmpty()&&jpf.getText().isEmpty()){
			JOptionPane.showMessageDialog(this,"�������û��������룡","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE);
		}
		else if(jtf.getText().isEmpty()){
			JOptionPane.showMessageDialog(this,"�������û�����","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE);
		}
		else if(jpf.getText().isEmpty()){
			JOptionPane.showMessageDialog(this,"���������룡","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE);
		}
		else{
			JOptionPane.showMessageDialog(this,"�û��������������\n����������","��ʾ��Ϣ",JOptionPane.ERROR_MESSAGE);
		}
	}
		
}
