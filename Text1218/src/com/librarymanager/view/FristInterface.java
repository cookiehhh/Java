package com.librarymanager.view;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FristInterface extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton lin,reg,rep,crep;
	CardLayout card;
	JPanel body;
	
	private Login pan_login;
	private UserRegister pan_userregister;
	private Repor pan_repor;
	private CancelRepor pan_cancelrepor;
	
	public static void main(String[] args) {
		new FristInterface();
	}

	public FristInterface() {
		
		card = new CardLayout();
		body = new JPanel(card);
		body.setBorder(BorderFactory.createTitledBorder("·Ö×é¿ò"));
		body.setBorder(BorderFactory.createLineBorder(Color.red));
		
		pan_login = new Login(this);
		pan_userregister = new UserRegister(this);
		pan_repor = new Repor(this);
		pan_cancelrepor = new CancelRepor(this);
		body.add("login", pan_login);
		body.add("userregister", pan_userregister);
		body.add("repor", pan_repor);
		body.add("cancelrepor", pan_cancelrepor);
		
		lin=new JButton("µÇÂ¼");
		reg=new JButton("×¢²á");
		rep=new JButton("¹ÒÊ§");
		crep=new JButton("È¡Ïû¹ÒÊ§");
		crep.setMargin(new Insets(0, 0, 0, 0));

		lin.addActionListener(this);
		reg.addActionListener(this);
		rep.addActionListener(this);
		crep.addActionListener(this);
		
		this.add(lin);
		this.add(rep);
		this.add(reg);
		this.add(crep);
		this.add(body);

		body.setBounds(80, 0, 500, 500);
		lin.setBounds(0, 0, 75, 30);
		reg.setBounds(0, 35, 75, 30);
		rep.setBounds(0, 70, 75, 30);
		crep.setBounds(0, 105, 75, 30);
		
		this.setLayout(null);
		this.setTitle("µÇÂ¼");
	    this.setBounds(750,150,600,550);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("µÇÂ¼")) {
			card.show(body, "login");
		}else if(e.getActionCommand().equals("×¢²á")) {	
			card.show(body, "userregister");
		}else if(e.getActionCommand().equals("¹ÒÊ§")) {	
			card.show(body, "repor");
		}else if(e.getActionCommand().equals("È¡Ïû¹ÒÊ§")) {	
			card.show(body, "cancelrepor");
		}
		
	}

}
