import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class TestGrid {
    public static void main(String[] args) {
        JFrame jf = new JFrame("��״����");
        GridLayout gl = new GridLayout(5,4); //5��4�еı��
        jf.setLayout(gl); //�޸Ĳ���Ϊ��״ 5 �� 4 ��
        for(int i=0;i<20;i++){
            JButton jb = new JButton(i+""); //����תString
            jf.add(jb);
        }
        //jf.setSize(600,300); //���ô�С
        jf.pack(); //�Զ�������С//pack����
        jf.setLocation(300,200); // ���ó�ʼ��λ��
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�ر�
        jf.setVisible(true); //����˳�ʼ���ɼ�������
    }

}