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

import com.librarymanager.dao.SQLConnection;

public class Return extends Panel implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Connection conn = SQLConnection.getConnection();
	private PreparedStatement ps;
	private ResultSet rs;
    JTextField tusername;
	JTextField tnum;
	JTextField tname;
	JTextField tdate;
	JTextField trent;
	JTextField tstate;
    JLabel username;
    JLabel num;
    JLabel name;
    JLabel date;
    JLabel rent;
    JLabel state;
    JButton ins;
    JLabel la;
    JLabel la2;
	public Return(Window parent) {
		this.setLayout(null);
        la = new JLabel("ͼ��黹");
        la.setFont(new Font("����",Font.BOLD,30));
        la.setHorizontalAlignment(JTextField.CENTER);
        la2 = new JLabel("ͼ��黹");
        la2.setForeground(Color.gray);
        la2.setFont(new Font("����",Font.BOLD,40));
        la2.setHorizontalAlignment(JTextField.CENTER);
        username =new JLabel("�û���");
        username.setFont(new Font("����",Font.BOLD,25));
        username.setHorizontalAlignment(JTextField.CENTER);
        num =new JLabel("ͼ���ţ�");
        num.setFont(new Font("����",Font.BOLD,25));
        num.setHorizontalAlignment(JTextField.CENTER);
        name =new JLabel("ͼ�����ƣ�");
        name.setFont(new Font("����",Font.BOLD,25));
        name.setHorizontalAlignment(JTextField.CENTER);
        date =new JLabel("����������");
        date.setFont(new Font("����",Font.BOLD,25));
        date.setHorizontalAlignment(JTextField.CENTER);
        rent = new JLabel("���");
        rent.setFont(new Font("����",Font.BOLD,25));
        rent.setHorizontalAlignment(JTextField.CENTER);
        state = new JLabel("״̬��");
        state.setFont(new Font("����",Font.BOLD,25));
        state.setHorizontalAlignment(JTextField.CENTER);

        tusername =new JTextField(25);
        tusername.setFont(new Font("����",Font.BOLD,25));
        tnum =new JTextField(25);
        tnum.setFont(new Font("����",Font.BOLD,25));
        tname =new JTextField(25);
        tname.setFont(new Font("����",Font.BOLD,25));
        tdate =new JTextField(25);
        tdate.setFont(new Font("����",Font.BOLD,25));
        trent =new JTextField(25);
        trent.setFont(new Font("����",Font.BOLD,25));
        trent.setEditable(false);
        tstate =new JTextField(25);
        tstate.setFont(new Font("����",Font.BOLD,25));
        tstate.setEditable(false);

        ins = new JButton("ȷ��");
        ins.addActionListener(this);
        
        this.add(tusername);
        this.add(tnum);
        this.add(tname);
        this.add(tdate);
        this.add(trent);
        this.add(tstate);
        this.add(username);
        this.add(num);
        this.add(name);
        this.add(date);
        this.add(rent);
        this.add(state);
        this.add(la);
        this.add(la2);
        this.add(ins);

        tusername.setBounds(180,200,180,40);
        tnum.setBounds(180,250,180,40);
        tname.setBounds(180,300,180,40);
        tdate.setBounds(180,350,180,40);
        trent.setBounds(490,300,180,40);
        tstate.setBounds(490,350,180,40);
        username.setBounds(0,200,180,50);
        num.setBounds(0,250,180,50);
        name.setBounds(0,300,180,50);
        date.setBounds(0,350,180,50);
        rent.setBounds(350,300,180,50);
        state.setBounds(350,350,180,50);
        ins.setBounds(500,220,100,50);
        la2.setBounds(140,100,360,40);
    }
    
	@Override
	public void actionPerformed(ActionEvent e) {
		int newstock;
		if (e.getActionCommand().equals("ȷ��")) {						
			try {   
				ps = (PreparedStatement)conn.prepareStatement("select * from users where username='" + tusername.getText().trim() + "'");
				rs = ps.executeQuery();
				if (rs.next()) {
					System.out.println("�û�����");
					try {   
				    	ps = (PreparedStatement)conn.prepareStatement("select * from book where num='" + tnum.getText().trim() + "'");
				    	rs = ps.executeQuery();
				    	if (rs.next()) {
					    	newstock = (Integer.valueOf(rs.getString(7).trim()) + 1);
					    	try {
				    			ps = (PreparedStatement)conn.prepareStatement("update book set stock='" + newstock + "' where num='" + tnum.getText().trim() + "'");
				    			int len = ps.executeUpdate();
						    	if (len>0) {
						    		System.out.println("���ÿ�� ");
						    	}else {
						    		JOptionPane.showMessageDialog(this, "û�б��飬���������룡", "��ʾ��Ϣ", JOptionPane.WARNING_MESSAGE);
						    	}
							} catch (Exception e2) {
								e2.printStackTrace();	
							}
					    	try {   
						    	ps = (PreparedStatement)conn.prepareStatement("select * from type where id='" + tnum.getText().trim() + "'");
						    	rs = ps.executeQuery();
						    	if (rs.next()) {
							    	double rent = (Double.valueOf(rs.getString(3).trim()));
							    	double date = (Double.valueOf(tdate.getText().trim()));
							    	trent.setText(String.valueOf(rent * date));
							    	tstate.setText("�ѹ黹");
							        System.out.println("������� ");
								}else{
									JOptionPane.showMessageDialog(this, "û�б��飬���������룡", "��ʾ��Ϣ", JOptionPane.WARNING_MESSAGE);
								}
						    } catch (Exception e1) {
						        e1.printStackTrace();		        
						    }
							try {   
						    	ps = (PreparedStatement)conn.prepareStatement("insert into record (username,num,name,date,rent,state) values(?,?,?,?,?,?)");
						        ps.setString(1, tusername.getText().trim());
						        ps.setString(2, tnum.getText().trim());
						        ps.setString(3, tname.getText().trim());
						        ps.setInt(4, Integer.valueOf(tdate.getText().trim()));
						        ps.setDouble(5, Double.valueOf(trent.getText().trim()));
						        ps.setString(6, tstate.getText().trim());
						        int i = ps.executeUpdate();
						        System.out.println("Ӱ���������: " + i);
						        JOptionPane.showMessageDialog(this,"����ɹ���","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE);
						    } catch (Exception e1) {
						        e1.printStackTrace();		        
						    }
				    	}
					}catch (Exception e2) {
						e2.printStackTrace();	
					}
				}else {
					JOptionPane.showMessageDialog(this , "û�и��û�","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE);
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
