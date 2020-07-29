import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login {

	public static void main(String[] args) {
		JFrame w = new JFrame();
		w.setSize(400, 150);
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel l_username = new JLabel("�û���");
		JLabel l_password = new JLabel("����");
		JTextField t_username = new JTextField();
		JPasswordField t_password = new JPasswordField();
		
		JButton b_login = new JButton("��¼");
		JButton b_reg = new JButton("ע��");
		JButton b_cancle = new JButton("ȡ��");
		
		JPanel p_input = new JPanel();
		p_input.setLayout(new GridLayout(2, 2));
		p_input.add(l_username);
		p_input.add(t_username);
		p_input.add(l_password);
		p_input.add(t_password);
		
		JPanel p_button = new JPanel();
		p_button.setLayout(new FlowLayout());
		p_button.add(b_login);
		p_button.add(b_reg);
		p_button.add(b_cancle);
		
		w.setLayout(new BorderLayout());
		w.add(p_input, BorderLayout.CENTER);
		w.add(p_button, BorderLayout.SOUTH);
		w.setVisible(true);

	}

}
