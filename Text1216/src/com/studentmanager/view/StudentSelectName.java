package com.studentmanager.view;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import com.studentmanager.service.Manager;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentSelectName extends JFrame implements ActionListener{
	JButton sel;
    JButton cal;
    JTextField jtf;
    JLabel la1;
    JLabel la2;

	DefaultTableModel model;
	JTable table;
	JScrollPane jsp;

	public StudentSelectName() {
		this.setTitle("ѧ����Ϣ����ϵͳ");
   	 
        sel = new JButton("��ѯ");
        sel.addActionListener(this);
        cal = new JButton("ȡ��");
        cal.addActionListener(this);
        jtf = new JTextField(25);
        jtf.setFont(new Font("����",Font.BOLD,25));
        la1 = new JLabel("����������");
        la1.setFont(new Font("����",Font.BOLD,25));
        la1.setHorizontalAlignment(JTextField.CENTER);
        la2 = new JLabel("ѧ����Ϣ��ѯ-����");
        la2.setForeground(Color.gray);
        la2.setFont(new Font("����",Font.BOLD,40));
        la2.setHorizontalAlignment(JTextField.CENTER);
        
        String[] colnames = { "ѧ��", "����", "����", "��ѧ", "Ӣ��" };
		model = new DefaultTableModel(colnames, 3);
		table = new JTable(model);
		jsp = new JScrollPane(table);

        this.add(sel);
        this.add(cal);
        this.add(jtf);
        this.add(la1);
        this.add(la2);
        this.add(jsp);

        sel.setBounds(50,150,100,50);
        cal.setBounds(200,150,100,50);
        jtf.setBounds(180,80,180,50);
        la1.setBounds(0,80,180,50);
        la2.setBounds(0,0,360,40);
        jsp.setBounds(0, 300, 400, 500);
        
        this.setLayout(null);
        this.setBounds(800,300,400,500);
        this.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand().equals("��ѯ")  &&!jtf.getText().isEmpty()) {						
			Manager.selectname(jtf.getText());
			jtf.setText("");
			table.setValueAt(Manager.id, 0, 0);
			table.setValueAt(Manager.name, 0, 1);
			table.setValueAt(Manager.chinese, 0, 2);
			table.setValueAt(Manager.math, 0, 3);
			table.setValueAt(Manager.english, 0, 4);
				
		}else if(e.getActionCommand().equals("ȡ��")){
			System.exit(0);
		}else
		{
			JOptionPane.showMessageDialog(null , "������Ҫ��ѯ�ı��","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE);
		}

	}
}