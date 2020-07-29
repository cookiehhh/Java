package com.studentmanager.view;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.studentmanager.pojo.Student;
import com.studentmanager.service.Manager;

public class StudentInsert extends JFrame implements ActionListener{
	JTextField tid;
    JTextField tname;
    JTextField tch;
    JTextField tma;
    JTextField ten;
    JLabel id;
    JLabel name;
    JLabel chinese;
    JLabel math;
    JLabel english;
    JButton ins;
    JButton cal;
    JLabel la;
	public StudentInsert() {
		this.setLayout(null);
		 
        this.setTitle("ѧ����Ϣ����ϵͳ");

        la = new JLabel("���ѧ����Ϣ");
        la.setFont(new Font("����",Font.BOLD,30));
        la.setHorizontalAlignment(JTextField.CENTER);
        id =new JLabel("ѧ�ţ�");
        id.setFont(new Font("����",Font.BOLD,25));
        id.setHorizontalAlignment(JTextField.CENTER);
        name =new JLabel("������");
        name.setFont(new Font("����",Font.BOLD,25));
        name.setHorizontalAlignment(JTextField.CENTER);
        chinese =new JLabel("���ģ�");
        chinese.setFont(new Font("����",Font.BOLD,25));
        chinese.setHorizontalAlignment(JTextField.CENTER);
        math =new JLabel("��ѧ��");
        math.setFont(new Font("����",Font.BOLD,25));
        math.setHorizontalAlignment(JTextField.CENTER);
        english = new JLabel("Ӣ�");
        english.setFont(new Font("����",Font.BOLD,25));
        english.setHorizontalAlignment(JTextField.CENTER);

        tid =new JTextField(25);
        tid.setFont(new Font("����",Font.BOLD,25));
        tname =new JTextField(25);
        tname.setFont(new Font("����",Font.BOLD,25));
        tch =new JTextField(25);
        tch.setFont(new Font("����",Font.BOLD,25));
        tma =new JTextField(25);
        tma.setFont(new Font("����",Font.BOLD,25));
        ten =new JTextField(25);
        ten.setFont(new Font("����",Font.BOLD,25));

        ins = new JButton("¼��");
        cal = new JButton("ȡ��");
        ins.addActionListener(this);
        cal.addActionListener(this);
        
        this.add(tid);
        this.add(tname);
        this.add(tch);
        this.add(tma);
        this.add(ten);
        this.add(id);
        this.add(name);
        this.add(chinese);
        this.add(math);
        this.add(english);
        this.add(la);
        this.add(cal);
        this.add(ins);

        tid.setBounds(180,40,180,50);
        tname.setBounds(180,100,180,50);
        tch.setBounds(180,160,180,50);
        tma.setBounds(180,220,180,50);
        ten.setBounds(180,280,180,50);
        id.setBounds(0,40,180,50);
        name.setBounds(0,100,180,50);
        chinese.setBounds(0,160,180,50);
        math.setBounds(0,220,180,50);
        english.setBounds(0,280,180,50);
        la.setBounds(0,0,360,40);
        ins.setBounds(50,360,100,50);
        cal.setBounds(220,360,100,50);
        
        this.setBounds(900,300,400,500);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("¼��")) {
			Student stu = new Student();
			stu.setId(tid.getText().trim());
			stu.setName(tname.getText());
			stu.setChinese(Double.valueOf(tch.getText().trim()));
			stu.setMath(Double.valueOf(tma.getText().trim()));
			stu.setEnglish(Double.valueOf(ten.getText().trim()));
			Manager.insert(stu);
			JOptionPane.showMessageDialog(null,"¼��ɹ���","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE);
		}else if (e.getActionCommand().equals("ȡ��")){
			System.exit(0);
		}
	}
}
