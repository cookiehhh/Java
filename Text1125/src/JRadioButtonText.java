import javax.swing.*;

public class JRadioButtonText {
	public static void main(String[] args) {

        JFrame f = new JFrame("��ѡ��");
        f.setSize(400, 300);
        f.setLocation(580, 200);
        f.setLayout(null);
        JRadioButton b1 = new JRadioButton("��ѡ��һ");
        // ���� Ϊ Ĭ�ϱ�ѡ��
        b1.setSelected(true);
        b1.setBounds(50, 50, 130, 30);
        JRadioButton b2 = new JRadioButton("��ѡ���");
        b2.setBounds(50, 100, 130, 30);

        System.out.println(b2.isSelected());

        f.add(b1);
        f.add(b2);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}
