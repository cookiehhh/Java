import javax.swing.JComboBox;
import javax.swing.JFrame;

public class JComboBoxText {
	public static void main(String[] args) {

        JFrame f = new JFrame("下拉框");
        f.setSize(400, 300);
        f.setLocation(580, 240);
        f.setLayout(null);

        //下拉框出现的条目
        String[] heros = new String[] { "一", "二" };
        JComboBox cb = new JComboBox(heros);

        cb.setBounds(50, 50, 80, 30);

        f.add(cb);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}
