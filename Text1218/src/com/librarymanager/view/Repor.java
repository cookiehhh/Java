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

import com.librarymanager.pojo.Users;
import com.librarymanager.service.Manager;

public class Repor extends Panel implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JTextField usernamef;
	JPasswordField passwordf;
    JLabel username;
    JLabel password;
    JButton det;
    JButton cal;
    JLabel lab;
	public Repor(Window parent) {
		this.setLayout(null);

        lab = new JLabel("用户挂失");
        lab.setForeground(Color.gray);
        lab.setFont(new Font("宋体",Font.BOLD,40));
        lab.setHorizontalAlignment(JTextField.CENTER);
        username =new JLabel("用户名：");
        username.setFont(new Font("宋体",Font.BOLD,25));
        username.setHorizontalAlignment(JTextField.CENTER);
        password =new JLabel("密 码：");
        password.setFont(new Font("宋体",Font.BOLD,25));
        password.setHorizontalAlignment(JTextField.CENTER);

        usernamef =new JTextField(10);
        usernamef.setFont(new Font("宋体",Font.BOLD,25));
        passwordf =new JPasswordField(25);
        passwordf.setFont(new Font("宋体",Font.BOLD,25));

        det = new JButton("确定");
        cal = new JButton("取消");
        det.addActionListener(this);
        cal.addActionListener(this);
        
        this.add(usernamef);
        this.add(passwordf);
        this.add(username);
        this.add(password);
        this.add(lab);
        this.add(cal);
        this.add(det);

        username.setBounds(5, 120, 300, 80);
        password.setBounds(5, 180, 300, 80);
        lab.setBounds(90, 20, 300, 80);
        det.setBounds(100, 300, 80, 50);
        cal.setBounds(300, 300, 80, 50);
		usernamef.setBounds(220, 145, 150, 35);
		passwordf.setBounds(220, 205, 150, 35);
        
	}
	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("确定")) {
			if(!usernamef.getText().isEmpty() && !passwordf.getText().isEmpty()){
				Manager.query(usernamef.getText());
				if(Manager.user.getPassword() == null){
					usernamef.setText("");
					passwordf.setText("");
				}else{
					if(Manager.user.getPassword().equals(passwordf.getText())){
						Users user = new Users();
						user.setUsername(usernamef.getText().trim());
						user.setPassword(passwordf.getText().trim());
						Manager.repor(user);
						JOptionPane.showMessageDialog(null,"挂失成功！","提示消息",JOptionPane.WARNING_MESSAGE);
					}
					else if(usernamef.getText().isEmpty()&&passwordf.getText().isEmpty()){
						JOptionPane.showMessageDialog(this,"请输入用户名和密码！","提示消息",JOptionPane.WARNING_MESSAGE);
					}
					else if(usernamef.getText().isEmpty()){
						JOptionPane.showMessageDialog(this,"请输入用户名！","提示消息",JOptionPane.WARNING_MESSAGE);
					}
					else if(passwordf.getText().isEmpty()){
						JOptionPane.showMessageDialog(this,"请输入密码！","提示消息",JOptionPane.WARNING_MESSAGE);
					}
					else{
						JOptionPane.showMessageDialog(this,"用户名或者密码错误！\n请重新输入","提示消息",JOptionPane.ERROR_MESSAGE);
					}
				}
			}
			
		}else if (e.getActionCommand().equals("取消")){
			System.exit(0);
		}
	}
}
