import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class TestBorderLayout {//�߿򲼾�
    public static void main(String[] args) {
        JFrame jf = new JFrame("�߿򲼾�");
        JButton jb = new JButton("��");
        jf.add(jb); 						//�Ѱ�ť����߿򲼾ֵ��в�

        JButton jb1 = new JButton("��");  //����һ����ť
        jf.add(jb1,BorderLayout.EAST);     //���ڶ���

        JButton jb2 = new JButton("��"); 
        jf.add(jb2,BorderLayout.SOUTH);     //�����ϲ�

        JButton jb3 = new JButton("��"); 
        jf.add(jb3,BorderLayout.WEST);      //��������  

        JButton jb4 = new JButton("��"); 
        jf.add(jb4,BorderLayout.NORTH);     //���ڱ���

        jf.setSize(600, 300);               //���ð�ť�Ĵ�С
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�ر�
        jf.setVisible(true);//��ʾ����
    }
}
