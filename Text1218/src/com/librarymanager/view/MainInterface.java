package com.librarymanager.view;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

public class MainInterface extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JMenuBar JMB;
	JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8;
	JLabel lab;
	JMenu M1,M2,M3,M4,M5;
	JPanel body;
	JRadioButton book,type;
	ButtonGroup bg;
	CardLayout card;
	Toolkit tool;
	Dimension wndsize;
	JMenuItem menuItem0,menuItem1,menuItem2,menuItem3,menuItem4,
	menuItem5,menuItem6,menuItem7,menuItem8,menuItem9,menuItem10,menuItem11,
	menuItem12,menuItem13,menuItem14,menuItem15,menuItem16,menuItem17;
	
	private Borrow pan_borrow;
	private Return pan_return;
	private RecordSelect pan_recordselect;
	private BookInsert pan_bookinsert;
	private TypeInsert pan_typeinsert;
	private BookUpdate pan_bookupdate;
	private TypeUpdate pan_typeupdate;
	private BookDelete pan_bookdelete;
	private TypeDelete pan_typedelete;
	private BookSelect pan_bookselect;
	private TypeSelect pan_typeselect;
	private BookSelectAll pan_bookselectall;
	private TypeSelectAll pan_typeselectall;
	
	public MainInterface() {
		
		Container content=this.getContentPane();
		content.setLayout(new BorderLayout());
		tool=this.getToolkit();
		wndsize=tool.getScreenSize();
		JMB=new JMenuBar();
		M1=new JMenu("用户管理");
		M2=new JMenu("图书流通管理");
		M3=new JMenu("图书管理");
		M4=new JMenu("图书类型管理");
		M5=new JMenu("帮助");
		
		menuItem0=new JMenuItem("用户登录");
		menuItem1=new JMenuItem("用户注册");
		menuItem2=new JMenuItem("挂失");
		menuItem3=new JMenuItem("取消挂失");
		menuItem4=new JMenuItem("退出");
//		M1.add(menuItem0);
//		M1.add(menuItem1);
//		M1.add(menuItem2);
//		M1.add(menuItem3);
		M1.add(menuItem4);
	 
		menuItem5=new JMenuItem("读者借书");
		menuItem6=new JMenuItem("读者还书");
		menuItem7=new JMenuItem("借阅统计");
		M2.add(menuItem5);
		M2.add(menuItem6);
		M2.add(menuItem7);
	 
		menuItem8=new JMenuItem("添加图书");
		menuItem9=new JMenuItem("修改图书");
		menuItem10=new JMenuItem("删除图书");
		menuItem11=new JMenuItem("查询全部图书");
		menuItem12=new JMenuItem("查询单个图书");
	 
		M3.add(menuItem8);
		M3.add(menuItem9);
		M3.add(menuItem10);
		M3.add(menuItem11);
		M3.add(menuItem12);
		
		menuItem13=new JMenuItem("添加类型");
		menuItem14=new JMenuItem("修改类型");
		menuItem15=new JMenuItem("删除类型");
		menuItem16=new JMenuItem("查询全部类型");
		menuItem17=new JMenuItem("查询单个类型");
		
		M4.add(menuItem13);
		M4.add(menuItem14);
		M4.add(menuItem15);
		M4.add(menuItem16);
		M4.add(menuItem17);
	 
		menuItem0.addActionListener(this);
		menuItem1.addActionListener(this);
		menuItem2.addActionListener(this);
		menuItem3.addActionListener(this);
		menuItem4.addActionListener(this);
		menuItem5.addActionListener(this);
		menuItem6.addActionListener(this);
		menuItem7.addActionListener(this);
		menuItem8.addActionListener(this);
		menuItem9.addActionListener(this);
		menuItem10.addActionListener(this);
		menuItem11.addActionListener(this);
		menuItem12.addActionListener(this);
		menuItem13.addActionListener(this);
		menuItem14.addActionListener(this);
		menuItem15.addActionListener(this);
		menuItem16.addActionListener(this);
		menuItem17.addActionListener(this);

		menuItem0.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z,ActionEvent.ALT_MASK));
		menuItem1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,ActionEvent.ALT_MASK));
		menuItem2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,ActionEvent.ALT_MASK));
		menuItem3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,ActionEvent.ALT_MASK));
		menuItem4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.ALT_MASK));
		menuItem5.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,ActionEvent.ALT_MASK));
		menuItem6.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F,InputEvent.ALT_MASK));
		menuItem7.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G,InputEvent.ALT_MASK));
		menuItem8.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H,InputEvent.ALT_MASK));
		menuItem9.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I,InputEvent.ALT_MASK));
		menuItem10.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_J,InputEvent.ALT_MASK));
		menuItem11.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K,InputEvent.ALT_MASK));
		menuItem12.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L,InputEvent.ALT_MASK));
		menuItem13.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,InputEvent.ALT_MASK));
		menuItem14.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,InputEvent.ALT_MASK));
		menuItem15.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,InputEvent.ALT_MASK));
		menuItem16.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,InputEvent.ALT_MASK));
		menuItem17.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q,InputEvent.ALT_MASK));
		
		JMB.add(M1);
		JMB.add(M2);
		JMB.add(M3);
		JMB.add(M4);
		JMB.add(M5);
	 
		this.setJMenuBar(JMB);
        lab = new JLabel("图书管理系统");
        lab.setForeground(Color.gray);
        lab.setFont(new Font("宋体",Font.BOLD,40));
        lab.setHorizontalAlignment(JTextField.CENTER);
		jb1 = new JButton("图书租赁");
		jb1.addActionListener(this);
		jb2 = new JButton("图书归还");
		jb2.addActionListener(this);
		jb3 = new JButton("租还查询");
		jb3.addActionListener(this);
		jb4 = new JButton("图书添加");
		jb4.addActionListener(this);
		jb5 = new JButton("图书修改");
		jb5.addActionListener(this);
		jb6 = new JButton("图书删除");
		jb6.addActionListener(this);
		jb7 = new JButton("全部查询");
		jb7.addActionListener(this);
		jb8 = new JButton("单个查询");
		jb8.addActionListener(this);
		book=new JRadioButton("图书管理",true);
		book.addActionListener(this);
		type=new JRadioButton("类型管理");
		type.addActionListener(this);
		bg=new ButtonGroup();
		bg.add(book);
		bg.add(type);
		
		card = new CardLayout();
		body = new JPanel(card);
		body.setBorder(BorderFactory.createTitledBorder("分组框"));
		body.setBorder(BorderFactory.createLineBorder(Color.red));
		

		pan_borrow = new Borrow(this);
		pan_return = new Return(this);
		pan_recordselect = new RecordSelect(this);
		pan_bookinsert = new BookInsert(this);
		pan_typeinsert = new TypeInsert(this);
		pan_bookupdate = new BookUpdate(this);
		pan_typeupdate = new TypeUpdate(this);
		pan_bookdelete = new BookDelete(this);
		pan_typedelete = new TypeDelete(this);
		pan_bookselect = new BookSelect(this);
		pan_typeselect = new TypeSelect(this);
		pan_bookselectall = new BookSelectAll(this);
		pan_typeselectall = new TypeSelectAll(this);

		body.add("borrow", pan_borrow);
		body.add("return", pan_return);
		body.add("recordselect", pan_recordselect);
		body.add("bookinsert", pan_bookinsert);
		body.add("typeinsert", pan_typeinsert);
		body.add("bookupdate", pan_bookupdate);
		body.add("typeupdate", pan_typeupdate);
		body.add("bookdelete", pan_bookdelete);
		body.add("typedelete", pan_typedelete);
		body.add("bookselect", pan_bookselect);
		body.add("typeselect", pan_typeselect);
		body.add("bookselectall", pan_bookselectall);
		body.add("typeselectall", pan_typeselectall);
		
		this.add(lab);
		this.add(jb1);
		this.add(jb2);
		this.add(jb3);
		this.add(jb4);
		this.add(jb5);
		this.add(jb6);
		this.add(jb7);
		this.add(jb8);
		this.add(book);
		this.add(type);
		this.add(body);
		
		body.setBounds(225, 125, 700, 500);
		lab.setBounds(350,30,300,60);
		jb1.setBounds(60, 175, 100, 30);
		jb2.setBounds(60, 235, 100, 30);
		jb3.setBounds(60, 295, 100, 30);
		jb4.setBounds(60, 355, 100, 30);
		jb5.setBounds(60, 415, 100, 30);
		jb6.setBounds(60, 475, 100, 30);
		jb7.setBounds(60, 530, 100, 30);
		jb8.setBounds(60, 595, 100, 30);
		
		book.setBounds(25, 125, 100, 30);
		type.setBounds(125, 125, 100, 30);
		
		this.setLayout(null);
		this.setTitle("主界面");
	    this.setBounds(750,150,1024,720);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj=e.getSource();
		
		if(obj==menuItem0){
//			card.show(body, "login");
		 }else if(obj==menuItem1){
//			card.show(body, "userregister");
		 }else if(obj==menuItem2){
//			 card.show(body, "repor");
		 }else if(obj==menuItem3){
//			 card.show(body, "cancelrepor");
		 }else if(obj==menuItem4){
			 System.exit(0);
		 }else if(obj==menuItem5){
			 card.show(body, "borrow");
		 }else if(obj==menuItem6){
			 card.show(body, "return");
		 }else if(obj==menuItem7){
			 card.show(body, "recordselect");
		 }else if(obj==menuItem8){
			 card.show(body, "bookinsert");
		 }else if(obj==menuItem9){
			 card.show(body, "bookupdate");
		 }else if(obj==menuItem10){
			 card.show(body, "bookdelete");
		 }else if(obj==menuItem11){
			 card.show(body, "bookselectall");
		 }else if(obj==menuItem12){
			 card.show(body, "bookselect");
		 }else if(obj==menuItem13){
			 card.show(body, "typeinsert");
		 }else if(obj==menuItem14){
			 card.show(body, "typeupdate");
		 }else if(obj==menuItem15){
			 card.show(body, "typedelete");
		 }else if(obj==menuItem16){
			 card.show(body, "typeselectall");
		 }else if(obj==menuItem17){
			 card.show(body, "typeselect");
		 }
		 
		
		if (e.getActionCommand().equals("图书租赁")) {
			card.show(body, "borrow");
		}else if(e.getActionCommand().equals("图书归还")) {	
			card.show(body, "return");
		}else if(e.getActionCommand().equals("租还查询")) {	
			card.show(body, "recordselect");
		}else if(e.getActionCommand().equals("图书添加")) {
			if(book.isSelected()){
				card.show(body, "bookinsert");
			}else if(type.isSelected()) {
				card.show(body, "typeinsert");
			}
		}else if(e.getActionCommand().equals("图书修改")) {	
			if(book.isSelected()){
				card.show(body, "bookupdate");
			}else if(type.isSelected()) {
				card.show(body, "typeupdate");
			}
		}else if(e.getActionCommand().equals("图书删除")) {	
			if(book.isSelected()){
				card.show(body, "bookdelete");
			}else if(type.isSelected()) {
				card.show(body, "typedelete");
			}
		}else if(e.getActionCommand().equals("全部查询")) {	
			if(book.isSelected()){
				card.show(body, "bookselectall");
			}else if(type.isSelected()) {
				card.show(body, "typeselectall");
			}
		}else if(e.getActionCommand().equals("单个查询")) {	
			if(book.isSelected()){
				card.show(body, "bookselect");
			}else if(type.isSelected()) {
				card.show(body, "typeselect");
			}
		}
	}
}
