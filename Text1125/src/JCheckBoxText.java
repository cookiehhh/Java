import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class JCheckBoxText {
	public static void main(String[] args) {

        JFrame f = new JFrame("��ѡ��");
        f.setSize(400, 300);
        f.setLocation(580, 200);
        f.setLayout(null);
        JCheckBox bCheckBox = new JCheckBox("ѡ��һ");
        //���� Ϊ Ĭ�ϱ�ѡ�� 
        bCheckBox.setSelected(true);
        bCheckBox.setBounds(50, 50, 130, 30);
        JCheckBox bCheckBox2 = new JCheckBox("ѡ���");
        bCheckBox2.setBounds(50, 100, 130, 30);
        //�ж� �Ƿ� �� ѡ�� 
        System.out.println(bCheckBox2.isSelected());

        f.add(bCheckBox);
        f.add(bCheckBox2);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}
