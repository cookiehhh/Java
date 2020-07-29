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

import com.librarymanager.service.Manager;

public class BookDelete extends Panel implements ActionListener{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JButton sel;
    JButton cal;
    JTextField jtf;
    JLabel la1;
    JLabel la2;

	public BookDelete(Window parent) {
   	 
        sel = new JButton("ɾ��");
        sel.addActionListener(this);
        cal = new JButton("ȡ��");
        cal.addActionListener(this);
        jtf = new JTextField(25);
        jtf.setFont(new Font("����",Font.BOLD,25));
        la1 = new JLabel("�����ţ�");
        la1.setFont(new Font("����",Font.BOLD,25));
        la1.setHorizontalAlignment(JTextField.CENTER);
        la2 = new JLabel("ͼ��ɾ��");
        la2.setForeground(Color.gray);
        la2.setFont(new Font("����",Font.BOLD,40));
        la2.setHorizontalAlignment(JTextField.CENTER);
        
        this.add(sel);
        this.add(cal);
        this.add(jtf);
        this.add(la1);
        this.add(la2);

        sel.setBounds(220,270,100,50);
        cal.setBounds(370,270,100,50);
        jtf.setBounds(280,120,180,50);
        la1.setBounds(100,120,180,50);
        la2.setBounds(150,20,360,40);
        
        this.setLayout(null);
        this.setVisible(true);
    }
    
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("ɾ��")  &&!jtf.getText().isEmpty()){
			int option= JOptionPane.showConfirmDialog(this, "ȷ��ɾ����", "��ʾ ",JOptionPane.YES_NO_CANCEL_OPTION);
			if(option==JOptionPane.YES_OPTION) {
				Manager.deletebook(jtf.getText().trim());
				jtf.setText("");
				JOptionPane.showMessageDialog(this,"ɾ���ɹ���","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE);
			}else{
				return;
			}
		}else if(e.getActionCommand().equals("ȡ��")){
			System.exit(0);
		}else
		{
			JOptionPane.showMessageDialog(this, "������Ҫɾ���ı��","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE);
		}
		
	}
}
