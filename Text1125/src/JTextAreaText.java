import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.*;
public class JTextAreaText {
	public static void main(String[] args) {

        JFrame f = new JFrame("文本域");
        f.setSize(400, 300);
        f.setLocation(200, 200);

        f.setLayout(new FlowLayout());

        JLabel l = new JLabel("文本域：");

        JTextArea ta = new JTextArea();
        ta.setPreferredSize(new Dimension(200, 150));
        //\n换行符
        ta.setText("一段文字\n");
        //追加数据
        ta.append("一段追加的文字");
        //设置自动换行
        ta.setLineWrap(true);
        f.add(l);
        f.add(ta);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}
