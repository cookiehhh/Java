import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyCompute {
    public static void main(String[] args) {
        JFrame jf = new JFrame("������"); //����һ������
        JTextField jtf = new JTextField("0",20); //��ʼ���ı�Ϊ0��������20
        jf.add(jtf,BorderLayout.NORTH); 
        String[] lab = {"CE","C","+/-","BackS","7","8","9","+","4","5","6",
            "-","1","2","3","*","0",".","=","/"}; //�����ϵ��ı�
        JPanel jp = new JPanel(); //�������
        GridLayout gl = new GridLayout(5,4); //�������񲼾�
        jp.setLayout(gl); //�����Ĳ��ַ�ʽ��Ϊ���񲼾�
        for(int i=0;i<lab.length;i++){
            JButton jb = new JButton(lab[i]); //������ť
            jp.add(jb);//�����������İ�ť���������
        }
        jf.add(jp);//�������봰��
        jf.pack(); //�Զ����ڴ�С
        jf.setResizable(false);//���ܸı䴰�ڵĴ�С
        jf.setLocation(300,200); // ���ó�ʼ��λ��
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�ر�
        jf.setVisible(true); //����˳�ʼ���ɼ�������
    }
}