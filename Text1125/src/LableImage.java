import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LableImage {
    public static void main(String[] args) {

        JFrame f = new JFrame("Image");
        f.setSize(800, 800);
        f.setLocation(580, 200);
        f.setLayout(null);

        JLabel l = new JLabel();

        //����ͼƬ����ImageIcon����
        ImageIcon i = new ImageIcon("F:/010.jpg");
        //����ImageIcon
        l.setIcon(i);
        //label�Ĵ�С����ΪImageIcon,������ʾ������
        l.setBounds(50, 50, i.getIconWidth(), i.getIconHeight());

        f.add(l);
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}