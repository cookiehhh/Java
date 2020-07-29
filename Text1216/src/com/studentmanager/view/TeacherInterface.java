package com.studentmanager.view;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TeacherInterface extends JFrame implements ActionListener {
	JButton b3;
    JButton b4;
    JButton b5;
    JButton b6;
    JLabel la;

    public TeacherInterface() {
    	this.setTitle("ѧ����Ϣ����ϵͳ"); 
    	la = new JLabel("ѧ����Ϣ����");
        la.setFont(new Font("����",Font.BOLD,30));
        la.setHorizontalAlignment(JTextField.CENTER);
    	 
        b3 =new JButton("¼��");
        b4 =new JButton("��ѯ");
        b5 =new JButton("�޸�");
        b6 =new JButton("ɾ��");
        
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);

        this.add(b3);
        this.add(b4);
        this.add(b5);
        this.add(b6);
        this.add(la);

        b3.setBounds(130,120,120,50);
        b4.setBounds(130,280,120,50);
        b5.setBounds(130,200,120,50);
        b6.setBounds(130,360,120,50);
        la.setBounds(10, 40, 360, 40);
        
        this.setLayout(null);
        this.setBounds(700,200,400,500);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("��ѯ")) {						
			new StudentInterface();		
		}else if(e.getActionCommand().equals("�޸�")) {						
			new StudentUpdate();		
		}else if(e.getActionCommand().equals("¼��")) {						
			new StudentInsert();		
		}else if(e.getActionCommand().equals("ɾ��")) {						
			new StudentDelete();		
		}
	}
}
