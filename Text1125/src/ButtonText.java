
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonText {
    public static void main(String[] args) {

        JFrame f = new JFrame("Button");
        f.setSize(400, 300);
        f.setLocation(200, 200);
        f.setLayout(null);
        JButton b = new JButton("Button");
        b.setBounds(100, 100, 100, 50);

        f.add(b);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}