import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class LableText {
    public static void main(String[] args) {

        JFrame f = new JFrame("Lable");
        f.setSize(400, 300);
        f.setLocation(200, 200);
        f.setLayout(null);
        JLabel l = new JLabel("±êÇ©");
        //ÎÄ×ÖÑÕÉ«
        
        l.setForeground(Color.red);
        l.setBounds(50, 50, 280, 30);

        f.add(l);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}