import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.*;

public class JTextFieldText {
	public static void main(String[] args) {

        JFrame f = new JFrame("�ı���");
        f.setSize(400, 300);
        f.setLocation(200, 200);

        f.setLayout(new FlowLayout());

        JLabel lName = new JLabel("�˺ţ�");
        // �����
        JTextField tfName = new JTextField("");
        tfName.setText("�������˺�");
        tfName.setPreferredSize(new Dimension(80, 30));

        JLabel lPassword = new JLabel("���룺");
        // �����
        JTextField tfPassword = new JTextField("");
        tfPassword.setText("����������");
        tfPassword.setPreferredSize(new Dimension(80, 30));

        f.add(lName);
        f.add(tfName);
        f.add(lPassword);
        f.add(tfPassword);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
        tfPassword.grabFocus();
    }
}	
