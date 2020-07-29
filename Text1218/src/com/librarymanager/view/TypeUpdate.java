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

public class TypeUpdate extends Panel implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Connection conn = SQLConnection.getConnection();
	private PreparedStatement ps;
	private ResultSet rs;
    JTextField ttype;
    JTextField trent;
    JTextField tid;
    JLabel la;
    JLabel type;
    JLabel id;
    JLabel rent;
    JButton sel;
    JButton ins;
    JButton cal;

	public TypeUpdate(Window parent) {
		this.setLayout(null);
		type =new JLabel("图书类型：");
        type.setFont(new Font("宋体",Font.BOLD,25));
        type.setHorizontalAlignment(JTextField.CENTER);
        id =new JLabel("编号：");
        id.setFont(new Font("宋体",Font.BOLD,25));
        id.setHorizontalAlignment(JTextField.CENTER);
        rent =new JLabel("租金：");
        rent.setFont(new Font("宋体",Font.BOLD,25));
        rent.setHorizontalAlignment(JTextField.CENTER);
        la = new JLabel("类型修改");
        la.setForeground(Color.gray);
        la.setFont(new Font("宋体",Font.BOLD,40));
        la.setHorizontalAlignment(JTextField.CENTER);

        ttype =new JTextField(25);
        ttype.setFont(new Font("宋体",Font.BOLD,25));
        trent =new JTextField(25);
        trent.setFont(new Font("宋体",Font.BOLD,25));
        trent.setEditable(false);
        trent.setBorder(new EmptyBorder(0,0,0,0));
        tid =new JTextField(25);
        tid.setFont(new Font("宋体",Font.BOLD,25));
        tid.setEditable(false);
        tid.setBorder(new EmptyBorder(0,0,0,0));
        
        sel = new JButton("查询");
        ins = new JButton("确定");
        cal = new JButton("取消");
        ins.addActionListener(this);
        cal.addActionListener(this);
        sel.addActionListener(this);
        
        this.add(ttype);
        this.add(trent);
        this.add(tid);
        this.add(type);
        this.add(id);
        this.add(rent);
        this.add(la);
        this.add(sel);
        this.add(cal);
        this.add(ins);
        
        ttype.setBounds(290,120,180,50);
        trent.setBounds(290,300,180,50);
        tid.setBounds(290,200,180,50);
        type.setBounds(140,120,180,50);
        
        id.setBounds(130,200,180,50);
        rent.setBounds(130,300,180,50);
        
        la.setBounds(250,35,180,50);
        
        sel.setBounds(530,120,100,50);
        ins.setBounds(200,400,100,50);
        cal.setBounds(370,400,100,50);
}


	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("查询")) {						
			try {
				ps = (PreparedStatement)conn.prepareStatement("select * from type where type=? ");
				ps.setString(1, ttype.getText().trim());
				rs = ps.executeQuery();
				if (rs.next()) {
					trent.setText(rs.getString(3).trim());
					tid.setText(rs.getString(1).trim());
					System.out.println("成功获取到用户名和密码from数据库");
				}else {
					JOptionPane.showMessageDialog(this,"没有此类型","提示消息",JOptionPane.WARNING_MESSAGE);
				}
				trent.setEditable(true);
				tid.setEditable(true);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
				
		}else if(e.getActionCommand().equals("确定")){
			int option= JOptionPane.showConfirmDialog(this, "确定修改？ ", "提示 ",JOptionPane.YES_NO_CANCEL_OPTION);
			if(option==JOptionPane.YES_OPTION) {
				try {   
			    	ps = (PreparedStatement)conn.prepareStatement("update type set id='" + tid.getText().trim() + "',rent='" + trent.getText().trim() + "',type='" + ttype.getText().trim() + "'where type='" + ttype.getText().trim() + "'");
			    	int i = ps.executeUpdate();
				    System.out.println("影响的数据行: " + i);
				    JOptionPane.showMessageDialog(this,"修改成功！","提示消息",JOptionPane.WARNING_MESSAGE);
			    } catch (Exception e1) {
			        e1.printStackTrace();		        
			    }
			}else{
				return;
			}
			
		}else if(e.getActionCommand().equals("取消")){
			System.exit(0);
		}else
		{
			JOptionPane.showMessageDialog(null , "请输入要查询的编号","提示消息",JOptionPane.WARNING_MESSAGE);
		}
		
	}
}
