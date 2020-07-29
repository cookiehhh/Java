package com.studentmanager.view;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TeacherInterface extends JFrame implements ActionListener {
	JButton b3;
    JButton b4;
    JButton b5;
    JButton b6;
    JLabel la;

    public TeacherInterface() {
    	this.setTitle("学生信息管理系统"); 
    	la = new JLabel("学生信息管理");
        la.setFont(new Font("宋体",Font.BOLD,30));
        la.setHorizontalAlignment(JTextField.CENTER);
    	 
        b3 =new JButton("录入");
        b4 =new JButton("查询");
        b5 =new JButton("修改");
        b6 =new JButton("删除");
        
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);

        this.add(b3);
        this.add(b4);
        this.add(b5);
        this.add(b6);
        this.add(la);

        b3.setBounds(130,120,120,50);
        b4.setBounds(130,280,120,50);
        b5.setBounds(130,200,120,50);
        b6.setBounds(130,360,120,50);
        la.setBounds(10, 40, 360, 40);
        
        this.setLayout(null);
        this.setBounds(700,200,400,500);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("查询")) {						
			new StudentInterface();		
		}else if(e.getActionCommand().equals("修改")) {						
			new StudentUpdate();		
		}else if(e.getActionCommand().equals("录入")) {						
			new StudentInsert();		
		}else if(e.getActionCommand().equals("删除")) {						
			new StudentDelete();		
		}
	}
}
