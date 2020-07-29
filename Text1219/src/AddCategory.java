import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddCategory extends JFrame{
	
	public static void main(String[] args) {
		new AddCategory();
	}
	
	public AddCategory() {
		JLabel jlable1 = new JLabel("编号");
		JLabel jlable2 = new JLabel("图书类别");
		JLabel jlable3 = new JLabel("名称");
		
		JTextField text1 = new JTextField();
		JTextField text2 = new JTextField();
		JTextField text3 = new JTextField();

		JButton button1 = new JButton("添加");
		
		this.add(jlable1);
		this.add(jlable2);
		this.add(jlable3);
		this.add(text1);
		this.add(text2);
		this.add(text3);
		this.add(button1);
		
		jlable1.setBounds(20, 20, 100, 40);
		jlable2.setBounds(20, 100, 100, 40);
		jlable3.setBounds(20, 200, 100, 40);
		text1.setBounds(120, 20, 100, 40);
		text2.setBounds(120, 100, 100, 40);		
		text3.setBounds(120, 200, 100, 40);
		button1.setBounds(300, 20, 100, 40);
		this.setLayout(null);
		this.setVisible(true);
		this.setBounds(750, 450, 500, 500);
		
		
		
	}
}
