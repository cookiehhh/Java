import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.*;
public class JTextAreaText {
	public static void main(String[] args) {

        JFrame f = new JFrame("�ı���");
        f.setSize(400, 300);
        f.setLocation(200, 200);

        f.setLayout(new FlowLayout());

        JLabel l = new JLabel("�ı���");

        JTextArea ta = new JTextArea();
        ta.setPreferredSize(new Dimension(200, 150));
        //\n���з�
        ta.setText("һ������\n");
        //׷������
        ta.append("һ��׷�ӵ�����");
        //�����Զ�����
        ta.setLineWrap(true);
        f.add(l);
        f.add(ta);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}
