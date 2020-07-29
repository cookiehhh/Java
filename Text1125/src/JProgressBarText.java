import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;

public class JProgressBarText {
	public static void main(String[] args) {

        JFrame f = new JFrame("������");
        f.setSize(400, 300);
        f.setLocation(200, 200);

        f.setLayout(new FlowLayout());

        JProgressBar pb = new JProgressBar();

        //���������100
        pb.setMaximum(100);
        //��ǰ������50
        pb.setValue(50);
        //��ʾ��ǰ����
        pb.setStringPainted(true);

        f.add(pb);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}
