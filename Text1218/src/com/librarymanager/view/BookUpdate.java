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

public class BookUpdate extends Panel implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Connection conn = SQLConnection.getConnection();
	private PreparedStatement ps;
	private ResultSet rs;
    JTextField tnum;
    JTextField ttype;
    JTextField tprice;
    JTextField tpress;
    JTextField tauthor;
    JTextField tstock;
    JTextField tname;
    JLabel num;
    JLabel name;
    JLabel type;
    JLabel la;
    JLabel price;
    JLabel press;
    JButton sel;
    JButton ins;
    JButton cal;
    JLabel author;
    JLabel stock;

	public BookUpdate(Window parent) {
		this.setLayout(null);
		num =new JLabel("图书编号：");
        num.setFont(new Font("宋体",Font.BOLD,25));
        num.setHorizontalAlignment(JTextField.CENTER);
        name =new JLabel("名称：");
        name.setFont(new Font("宋体",Font.BOLD,25));
        name.setHorizontalAlignment(JTextField.CENTER);
        type =new JLabel("类型：");
        type.setFont(new Font("宋体",Font.BOLD,25));
        type.setHorizontalAlignment(JTextField.CENTER);
        price =new JLabel("单价：");
        price.setFont(new Font("宋体",Font.BOLD,25));
        price.setHorizontalAlignment(JTextField.CENTER);
        press = new JLabel("出版社：");
        press.setFont(new Font("宋体",Font.BOLD,25));
        press.setHorizontalAlignment(JTextField.CENTER);
        author = new JLabel("作者：");
        author.setFont(new Font("宋体",Font.BOLD,25));
        author.setHorizontalAlignment(JTextField.CENTER);
        stock = new JLabel("库存：");
        stock.setFont(new Font("宋体",Font.BOLD,25));
        stock.setHorizontalAlignment(JTextField.CENTER);
        la = new JLabel("图书修改");
        la.setForeground(Color.gray);
        la.setFont(new Font("宋体",Font.BOLD,40));
        la.setHorizontalAlignment(JTextField.CENTER);

        tnum =new JTextField(25);
        tnum.setFont(new Font("宋体",Font.BOLD,25));
        ttype =new JTextField(25);
        ttype.setFont(new Font("宋体",Font.BOLD,25));
        ttype.setEditable(false);
        ttype.setBorder(new EmptyBorder(0,0,0,0));
        tprice =new JTextField(25);
        tprice.setFont(new Font("宋体",Font.BOLD,25));
        tprice.setEditable(false);
        tprice.setBorder(new EmptyBorder(0,0,0,0));
        tpress =new JTextField(25);
        tpress.setFont(new Font("宋体",Font.BOLD,25));
        tpress.setEditable(false);
        tpress.setBorder(new EmptyBorder(0,0,0,0));
        tauthor =new JTextField(25);
        tauthor.setFont(new Font("宋体",Font.BOLD,25));
        tauthor.setEditable(false);
        tauthor.setBorder(new EmptyBorder(0,0,0,0));
        tstock = new JTextField(25);
        tstock.setFont(new Font("宋体",Font.BOLD,25));
        tstock.setEditable(false);
        tstock.setBorder(new EmptyBorder(0,0,0,0));
        tname = new JTextField(25);
        tname.setFont(new Font("宋体",Font.BOLD,25));
        tname.setEditable(false);
        tname.setBorder(new EmptyBorder(0,0,0,0));
        
        sel = new JButton("查询");
        ins = new JButton("确定");
        cal = new JButton("取消");
        ins.addActionListener(this);
        cal.addActionListener(this);
        sel.addActionListener(this);
        
        this.add(tnum);
        this.add(ttype);
        this.add(tprice);
        this.add(tpress);
        this.add(tauthor);
        this.add(num);
        this.add(name);
        this.add(type);
        this.add(price);
        this.add(press);
        this.add(sel);
        this.add(cal);
        this.add(ins);
        this.add(tstock);
        this.add(tname);
        this.add(author);
        this.add(stock);
        this.add(la);
        
        tnum.setBounds(240,120,180,50);
        
        ttype.setBounds(450,200,180,50);
        tprice.setBounds(160,260,180,50);
        tpress.setBounds(450,260,180,50);
        tauthor.setBounds(160,320,180,50);
        tname.setBounds(160,200,180,50);
        tstock.setBounds(450,320,180,50);
        
        num.setBounds(90,120,180,50);
        
        name.setBounds(30,200,180,50);
        type.setBounds(330,200,180,50);
        price.setBounds(30,258,180,50);
        press.setBounds(320,260,180,50);
        author.setBounds(30,320,180,50);
        stock.setBounds(320,320,180,50);
        la.setBounds(250,35,180,50);
        sel.setBounds(470,120,100,50);
        ins.setBounds(200,400,100,50);
        cal.setBounds(370,400,100,50);
}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("查询")) {						
			try {
				ps = (PreparedStatement)conn.prepareStatement("select * from book where num=? ");
				ps.setString(1, tnum.getText().trim());
				rs = ps.executeQuery();
				if (rs.next()) {
					tname.setText(rs.getString(2).trim());
					ttype.setText(rs.getString(3).trim());
					tprice.setText(rs.getString(4).trim());
					tpress.setText(rs.getString(5).trim());
					tauthor.setText(rs.getString(6).trim());
					tstock.setText(rs.getString(7).trim());
					System.out.println("成功获取到用户名和密码from数据库");
					tname.setEditable(true);
					ttype.setEditable(true);
					tprice.setEditable(true);
					tpress.setEditable(true);
					tauthor.setEditable(true);
					tstock.setEditable(true);
				}else {
					JOptionPane.showMessageDialog(this,"没有此书","提示消息",JOptionPane.WARNING_MESSAGE);
				}

			} catch (Exception e1) {
				e1.printStackTrace();
			}
				
		}else if(e.getActionCommand().equals("确定")){
			int option= JOptionPane.showConfirmDialog(this, "确定修改？", "提示 ",JOptionPane.YES_NO_CANCEL_OPTION);
			if(option==JOptionPane.YES_OPTION) {
				try {   
			    	ps = (PreparedStatement)conn.prepareStatement("update book set num='" + tnum.getText().trim() + "',name='" + tname.getText().trim() + "',type='" + ttype.getText().trim() + "',price='" + tprice.getText().trim() + "',press='" + tpress.getText().trim() + "',author='" + tauthor.getText().trim() + "',stock='" + tstock.getText().trim() + "'where num='" + tnum.getText().trim() + "'");
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
