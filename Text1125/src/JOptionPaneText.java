import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JOptionPaneText {
	public static void main(String[] args) {

        JFrame f = new JFrame("对话框");
        f.setSize(400, 300);
        f.setLocation(580, 240);
        f.setLayout(null);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);

        int option = JOptionPane.showConfirmDialog(f, "是否 是傻狗 ？");
        if (JOptionPane.OK_OPTION == option) {
            String answer = JOptionPane.showInputDialog(f, "请输入yes，表明是");
            if ("yes".equals(answer))
                JOptionPane.showMessageDialog(f, "你是傻狗！");
        }

    }
}
