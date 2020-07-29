package com.studentmanager.view;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.studentmanager.pojo.Studentuser;
import com.studentmanager.service.Manager;

public class StudentRegister extends JFrame implements ActionListener{
	JTextField usernamef;
	JPasswordField passwordf;
//    JTextField passwordf;
    JLabel username;
    JLabel password;
    JButton b7;
    JButton b8;
    JLabel l1;
	public StudentRegister() {
		this.setLayout(null);
		 
        this.setTitle("ѧ����Ϣ����ϵͳ");

        l1 = new JLabel("ע��ѧ���û�");
        l1.setFont(new Font("����",Font.BOLD,30));
        l1.setHorizontalAlignment(JTextField.CENTER);
        username =new JLabel("�û�����");
        username.setFont(new Font("����",Font.BOLD,25));
        username.setHorizontalAlignment(JTextField.CENTER);
        password =new JLabel("���룺");
        password.setFont(new Font("����",Font.BOLD,25));
        password.setHorizontalAlignment(JTextField.CENTER);

        usernamef =new JTextField(25);
        usernamef.setFont(new Font("����",Font.BOLD,25));
        passwordf =new JPasswordField(25);
        passwordf.setFont(new Font("����",Font.BOLD,25));

        b7 = new JButton("ȷ��");
        b8 = new JButton("ȡ��");
        b7.addActionListener(this);
        b8.addActionListener(this);
        
        this.add(usernamef);
        this.add(passwordf);
        this.add(username);
        this.add(password);
        this.add(l1);
        this.add(b8);
        this.add(b7);

        usernamef.setBounds(180,60,180,50);
        passwordf.setBounds(180,120,180,50);
        username.setBounds(0,60,180,50);
        password.setBounds(0,120,180,50);
        l1.setBounds(0,0,360,40);
        b7.setBounds(50,200,100,50);
        b8.setBounds(220,200,100,50);
        
        this.setBounds(900,300,400,350);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("ȷ��")) {
			Studentuser stur = new Studentuser();
			stur.setUsername(usernamef.getText().trim());
			stur.setPassword(passwordf.getText());
			Manager.insertStur(stur);
			JOptionPane.showMessageDialog(null,"ע��ɹ���","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE);
			 dispose();
		}else if (e.getActionCommand().equals("ȡ��")){
			System.exit(0);
		}
	}
}
