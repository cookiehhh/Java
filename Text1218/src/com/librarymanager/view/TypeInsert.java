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
import javax.swing.JTextField;

import com.librarymanager.pojo.Type;
import com.librarymanager.service.Manager;

public class TypeInsert extends Panel implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    
	JTextField tid;
	JTextField ttype;
	JTextField trent;

    JLabel id;
    JLabel type;
    JLabel rent;
    JButton ins;
    JButton cal;
    JLabel la;
    
	public TypeInsert(Window parent) {
		this.setLayout(null);
		la = new JLabel("�������");
        la.setForeground(Color.gray);
        la.setFont(new Font("����",Font.BOLD,40));
        la.setHorizontalAlignment(JTextField.CENTER);
        id =new JLabel("��ţ�");
        id.setFont(new Font("����",Font.BOLD,25));
        id.setHorizontalAlignment(JTextField.CENTER);
        type =new JLabel("�������ƣ�");
        type.setFont(new Font("����",Font.BOLD,25));
        type.setHorizontalAlignment(JTextField.CENTER);
        rent =new JLabel("���");
        rent.setFont(new Font("����",Font.BOLD,25));
        rent.setHorizontalAlignment(JTextField.CENTER);

        tid =new JTextField(25);
        tid.setFont(new Font("����",Font.BOLD,25));
        ttype =new JTextField(25);
        ttype.setFont(new Font("����",Font.BOLD,25));
        trent =new JTextField(25);
        trent.setFont(new Font("����",Font.BOLD,25));

        ins = new JButton("ȷ��");
        cal = new JButton("ȡ��");
        ins.addActionListener(this);
        cal.addActionListener(this);
        
        this.add(la);
        this.add(tid);
        this.add(ttype);
        this.add(trent);
        this.add(id);
        this.add(type);
        this.add(rent);
        this.add(cal);
        this.add(ins);

        tid.setBounds(270,105,180,40);
        ttype.setBounds(270,165,180,40);
        trent.setBounds(270,225,180,40);
        id.setBounds(150,100,180,50);
        type.setBounds(120,160,180,50);
        rent.setBounds(150,220,180,50);
        ins.setBounds(200,350,100,50);
        cal.setBounds(360,350,100,50);
        la.setBounds(130, 30, 360, 40);
        
        this.setBounds(600, 100, 700, 500);
        this.setVisible(true);

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("ȷ��")) {
			Type type = new Type();
			type.setId(tid.getText().trim());
			type.setType(ttype.getText().trim());
			type.setRent(Double.valueOf(trent.getText().trim()));
			Manager.inserttype(type);
			JOptionPane.showMessageDialog(null,"������ӳɹ���","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE);
		}else if (e.getActionCommand().equals("ȡ��")){
			System.exit(0);
		}
	}

}
