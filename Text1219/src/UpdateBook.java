import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UpdateBook extends JFrame{
	
	public static void main(String[] args) {
		new UpdateBook();
	}
	
	public UpdateBook() {
		JLabel jlable1 = new JLabel("要修改的编号");
		JLabel jlable2 = new JLabel("图书类别");
		JLabel jlable3 = new JLabel("名称");
		JLabel jlable4 = new JLabel("价格");
		JLabel jlable5 = new JLabel("出版社");
		JLabel jlable6 = new JLabel("作者");
		JLabel jlable7 = new JLabel("库存");
		
		JTextField text1 = new JTextField();
		JTextField text2 = new JTextField();
		JTextField text3 = new JTextField();
		JTextField text4 = new JTextField();
		JTextField text5 = new JTextField();
		JTextField text6 = new JTextField();
		JTextField text7 = new JTextField();
		
		text2.setEditable(false);
		text3.setEditable(false);
		text4.setEditable(false);
		text5.setEditable(false);
		text6.setEditable(false);
		text7.setEditable(false);

		JButton button1 = new JButton("查询");
		JButton button2 = new JButton("确定");
		
		this.add(jlable1);
		this.add(jlable2);
		this.add(jlable3);
		this.add(jlable4);
		this.add(jlable5);
		this.add(jlable6);
		this.add(jlable7);
		this.add(text1);
		this.add(text2);
		this.add(text3);
		this.add(text4);
		this.add(text5);
		this.add(text6);
		this.add(text7);
		this.add(button1);
		this.add(button2);
		
		jlable1.setBounds(20, 20, 100, 40);
		jlable2.setBounds(20, 100, 100, 40);
		jlable3.setBounds(20, 200, 100, 40);
		jlable4.setBounds(20, 300, 100, 40);
		jlable5.setBounds(270, 100, 100, 40);
		jlable6.setBounds(270, 200, 100, 40);
		jlable7.setBounds(270, 300, 100, 40);
		text1.setBounds(120, 20, 100, 40);
		text2.setBounds(120, 100, 100, 40);		
		text3.setBounds(120, 200, 100, 40);
		text4.setBounds(120, 300, 100, 40);
		text5.setBounds(320, 100, 100, 40);
		text6.setBounds(320, 200, 100, 40);
		text7.setBounds(320, 300, 100, 40);
		button1.setBounds(300, 20, 100, 40);
		button2.setBounds(200, 370, 100, 40);
		this.setLayout(null);
		this.setVisible(true);
		this.setBounds(750, 450, 500, 500);
		
		
		
	}
}
