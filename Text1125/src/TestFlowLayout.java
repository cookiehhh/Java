import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class TestFlowLayout {//������
    public static void main(String[] args) {
        JFrame jf = new JFrame("������"); 	//����һ������
        FlowLayout fl = new FlowLayout();  		//ʹ��������
        jf.setLayout(fl);						//�޸Ĳ��ֹ���
        JButton jb1 = new JButton("��ť1");		//����һ����ť
        jf.add(jb1); 							//�Ѱ�ťjb1���봰��
        JButton jb2 = new JButton("��ť2");		//����һ����ť
        jf.add(jb2);							//�Ѱ�ťjb2���봰��
        jf.setSize(600, 300);					//���ô��ڵĴ�С
        jf.setLocation(300,200);				//���ô��ڵĳ�ʼλ��
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�رմ���
        jf.setVisible(true); 					//��ʾ����
    }
}
