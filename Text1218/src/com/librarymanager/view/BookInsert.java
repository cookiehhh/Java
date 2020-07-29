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

import com.librarymanager.pojo.Book;
import com.librarymanager.service.Manager;

public class BookInsert extends Panel implements ActionListener{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    
	JTextField tnum;
	JTextField tname;
	JTextField ttype;
	JTextField tprice;
	JTextField tpress;
	JTextField tauthor;
	JTextField tstock;
    JLabel num;
    JLabel name;
    JLabel type;
    JLabel price;
    JLabel press;
    JLabel author;
    JLabel stock;
    JButton ins;
    JButton cal;
    JLabel la;
	public BookInsert(Window parent) {
		this.setLayout(null);
        la = new JLabel("添加图书");
        la.setForeground(Color.gray);
        la.setFont(new Font("宋体",Font.BOLD,40));
        la.setHorizontalAlignment(JTextField.CENTER);
        num =new JLabel("编号：");
        num.setFont(new Font("宋体",Font.BOLD,25));
        num.setHorizontalAlignment(JTextField.CENTER);
        name =new JLabel("名称：");
        name.setFont(new Font("宋体",Font.BOLD,25));
        name.setHorizontalAlignment(JTextField.CENTER);
        type =new JLabel("类型：");
        type.setFont(new Font("宋体",Font.BOLD,25));
        type.setHorizontalAlignment(JTextField.CENTER);
        price =new JLabel("价格：");
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

        tnum =new JTextField(25);
        tnum.setFont(new Font("宋体",Font.BOLD,25));
        tname =new JTextField(25);
        tname.setFont(new Font("宋体",Font.BOLD,25));
        ttype =new JTextField(25);
        ttype.setFont(new Font("宋体",Font.BOLD,25));
        tprice =new JTextField(25);
        tprice.setFont(new Font("宋体",Font.BOLD,25));
        tpress =new JTextField(25);
        tpress.setFont(new Font("宋体",Font.BOLD,25));
        tauthor =new JTextField(25);
        tauthor.setFont(new Font("宋体",Font.BOLD,25));
        tstock =new JTextField(25);
        tstock.setFont(new Font("宋体",Font.BOLD,25));

        ins = new JButton("确定");
        cal = new JButton("取消");
        ins.addActionListener(this);
        cal.addActionListener(this);
        
        this.add(tnum);
        this.add(tname);
        this.add(ttype);
        this.add(tprice);
        this.add(tpress);
        this.add(tauthor);
        this.add(tstock);
        this.add(num);
        this.add(name);
        this.add(type);
        this.add(price);
        this.add(press);
        this.add(author);
        this.add(stock);
        this.add(la);
        this.add(cal);
        this.add(ins);

        tnum.setBounds(140,105,180,40);
        tname.setBounds(140,155,180,40);
        ttype.setBounds(140,205,180,40);
        tprice.setBounds(140,255,180,40);
        tpress.setBounds(450,105,180,40);
        tauthor.setBounds(450,155,180,40);
        tstock.setBounds(450,205,180,40);
        num.setBounds(0,100,180,50);
        name.setBounds(0,150,180,50);
        type.setBounds(0,200,180,50);
        price.setBounds(0,250,180,50);
        press.setBounds(300,100,180,50);
        author.setBounds(310,150,180,50);
        stock.setBounds(310,200,180,50);
        ins.setBounds(200,350,100,50);
        cal.setBounds(370,350,100,50);
        la.setBounds(130, 30, 360, 40);

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("确定")) {
			Book book = new Book();
			book.setNum(tnum.getText().trim());
			book.setName(tname.getText().trim());
			book.setType(ttype.getText().trim());
			book.setPrice(Double.valueOf(tprice.getText().trim()));
			book.setPress(tpress.getText().trim());
			book.setAuthor(tauthor.getText().trim());
			book.setStock(Integer.valueOf(tstock.getText().trim()));
			Manager.insertbook(book);
			JOptionPane.showMessageDialog(null,"图书添加成功！","提示消息",JOptionPane.WARNING_MESSAGE);
		}else if (e.getActionCommand().equals("取消")){
			System.exit(0);
		}
	}

}
