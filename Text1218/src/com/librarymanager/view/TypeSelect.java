package com.librarymanager.view;
import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.librarymanager.dao.SQLConnection;

public class TypeSelect extends Panel implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Connection conn = SQLConnection.getConnection();
	private PreparedStatement ps;
	private ResultSet rs;
    
    JTextField id;
    JTextField type;
    JTextField rent;

    JLabel bianhao;
    JLabel zujin;
    JLabel leixing;
    JLabel tscx;

    JButton sel;
    
	public TypeSelect(Window parent) {
		this.setLayout(null);
        bianhao =new JLabel("��ţ�");
        bianhao.setFont(new Font("����",Font.BOLD,25));
        bianhao.setHorizontalAlignment(JTextField.CENTER);
        zujin =new JLabel("���");
        zujin.setFont(new Font("����",Font.BOLD,25));
        zujin.setHorizontalAlignment(JTextField.CENTER);
        leixing =new JLabel("���ͣ�");
        leixing.setFont(new Font("����",Font.BOLD,25));
        leixing.setHorizontalAlignment(JTextField.CENTER);
        tscx =new JLabel("ͼ���ѯ");
        tscx.setForeground(Color.gray);
        tscx.setFont(new Font("����",Font.BOLD,40));
        tscx.setHorizontalAlignment(JTextField.CENTER);

        id =new JTextField(25);
        id.setFont(new Font("����",Font.BOLD,25));
        id.setEditable(false);
        id.setBorder(new EmptyBorder(0,0,0,0));
        type =new JTextField(25);
        type.setFont(new Font("����",Font.BOLD,25));
        rent =new JTextField(25);
        rent.setFont(new Font("����",Font.BOLD,25));
        rent.setEditable(false);
        rent.setBorder(new EmptyBorder(0,0,0,0));
        
        sel = new JButton("��ѯ");
        sel.addActionListener(this);
        
        this.add(id);
        this.add(type);
        this.add(rent);
        this.add(bianhao);
        this.add(zujin);
        this.add(leixing);
        this.add(sel);
        this.add(tscx);
        
        type.setBounds(280,120,180,50);
        id.setBounds(280,200,180,50);
        rent.setBounds(280,280,180,50);
        leixing.setBounds(150,120,180,50);
        bianhao.setBounds(150,200,180,50);
        zujin.setBounds(150,280,180,50);
        tscx.setBounds(230,50,180,50);
        sel.setBounds(530,120,100,50);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("��ѯ")) {						
			try {
				ps = (PreparedStatement)conn.prepareStatement("select * from type where type=? ");
				ps.setString(1, type.getText());
				rs = ps.executeQuery();
				if (rs.next()) {
					id.setText(rs.getString(1).trim());
					rent.setText(rs.getString(3).trim());
					System.out.println("�ɹ���ȡ���û���������from���ݿ�");
				}else {
					JOptionPane.showMessageDialog(this,"û�д�����","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE);
				}
			} catch (Exception e1) {
				e1.printStackTrace();
			}
				
		}else if(e.getActionCommand().equals("ȡ��")){
			System.exit(0);
		}else
		{
			JOptionPane.showMessageDialog(null , "������Ҫ��ѯ�ı��","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE);
		}
	}
}
