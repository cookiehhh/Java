import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JOptionPaneText {
	public static void main(String[] args) {

        JFrame f = new JFrame("�Ի���");
        f.setSize(400, 300);
        f.setLocation(580, 240);
        f.setLayout(null);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);

        int option = JOptionPane.showConfirmDialog(f, "�Ƿ� ��ɵ�� ��");
        if (JOptionPane.OK_OPTION == option) {
            String answer = JOptionPane.showInputDialog(f, "������yes��������");
            if ("yes".equals(answer))
                JOptionPane.showMessageDialog(f, "����ɵ����");
        }

    }
}
