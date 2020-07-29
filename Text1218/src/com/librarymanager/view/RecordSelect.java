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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.librarymanager.dao.SQLConnection;

public class RecordSelect extends Panel implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Connection conn = SQLConnection.getConnection();
	private PreparedStatement ps;
	private ResultSet rs;

	JButton sel;
    JTextField jtf;
    JLabel la1;
    JLabel la2;

    
	DefaultTableModel model;
	JTable table;
	JScrollPane jsp ;

	public RecordSelect(Window parent) {
   	 
        sel = new JButton("查询");
        sel.addActionListener(this);
        jtf = new JTextField(25);
        jtf.setFont(new Font("宋体",Font.BOLD,25));
        la1 = new JLabel("查询借阅信息");
        la1.setFont(new Font("宋体",Font.BOLD,25));
        la2 = new JLabel("借阅查询");
        la2.setForeground(Color.gray);
        la2.setFont(new Font("宋体",Font.BOLD,40));
        la2.setHorizontalAlignment(JTextField.CENTER);
        
        String[] colnames = { "用户姓名", "图书编号","图书名称","天数","租金","状态"};
		model = new DefaultTableModel(colnames, 100);
		table = new JTable(model);
		jsp = new JScrollPane(table);


        this.add(sel);
        this.add(jtf);
        this.add(la1);
        this.add(la2);
        this.add(jsp);

        sel.setBounds(350,75,80,35);
        la1.setBounds(150,70,180,50);
        la2.setBounds(140,20,360,40);
        jsp.setBounds(0, 120, 700, 500);
        
        this.setLayout(null);
}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("查询")) {						
			try {
				ps = (PreparedStatement)conn.prepareStatement("select * from record");
				rs = ps.executeQuery();
				int i=0;
				while (rs.next()) {
					table.setValueAt(rs.getString(1).trim(), i, 0);
					table.setValueAt(rs.getString(2).trim(), i, 1);
					table.setValueAt(rs.getString(3).trim(), i, 2);
					table.setValueAt(rs.getString(4).trim(), i, 3);
					table.setValueAt(rs.getString(5).trim(), i, 4);
					table.setValueAt(rs.getString(6).trim(), i, 5);
					i++;
					System.out.println("成功获取到用户名和密码from数据库");
				}
			} catch (Exception e1) {
				e1.printStackTrace();
			}
				
		}else if(e.getActionCommand().equals("取消")){
			System.exit(0);
		}else
		{
			JOptionPane.showMessageDialog(null , "请输入要查询的编号","提示消息",JOptionPane.WARNING_MESSAGE);
		}
		
	}
}
