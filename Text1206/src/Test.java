import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test {

    TextField tf = new TextField(40);       //��ʾ�ı���
    StringBuffer s1 = new StringBuffer();   //��¼�������֣��Լ��������
    StringBuffer s2 = new StringBuffer();   //��¼�������֣�������һ����������ֻ�������
    static String flag = new String();      //���������ţ�+��-��*��/
    boolean start = true;   //������㿪ʼ�����,��֤һ������֮�󣬵ڶ��ν�������ʱ��ͬʱ�����ʾ���棬��s1Ϊ��

    public void init(){
        //������
        JFrame f = new JFrame("������");
        JPanel p1 = new JPanel();
        p1.add(tf);
        f.add(p1,BorderLayout.NORTH);
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(1,3));
        //����������
        ActionListener listen =new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {

                //��������0~9
                if(arg0.getActionCommand()=="0"){

                    if(!s1.toString().equals(new String())){
                        if(!start){
                            //s1���㣬��֤����������������
                            s1.delete(0, s1.length());
                        }
                        start = true;
                        tf.setText(s1.append("0").toString());
                    }   
                }
                if(arg0.getActionCommand()=="1"){
                    if(!start){
                        s1.delete(0, s1.length());
                    }
                    start = true;
                    tf.setText(s1.append("1").toString());
                }
                if(arg0.getActionCommand()=="2"){
                    if(!start){
                        s1.delete(0, s1.length());
                    }
                    start = true;
                    tf.setText(s1.append("2").toString());
                }
                if(arg0.getActionCommand()=="3"){
                    if(!start){
                        s1.delete(0, s1.length());
                    }
                    start = true;
                    tf.setText(s1.append("3").toString());
                }
                if(arg0.getActionCommand()=="4"){
                    if(!start){
                        s1.delete(0, s1.length());
                    }
                    start = true;
                    tf.setText(s1.append("4").toString());
                }
                if(arg0.getActionCommand()=="5"){
                    if(!start){
                        s1.delete(0, s1.length());
                    }
                    start = true;
                    tf.setText(s1.append("5").toString());
                }
                if(arg0.getActionCommand()=="6"){
                    if(!start){
                        s1.delete(0, s1.length());
                    }
                    start = true;
                    tf.setText(s1.append("6").toString());
                }
                if(arg0.getActionCommand()=="7"){
                    if(!start){
                        s1.delete(0, s1.length());
                    }
                    start = true;
                    tf.setText(s1.append("7").toString());
                }
                if(arg0.getActionCommand()=="8"){
                    if(!start){
                        s1.delete(0, s1.length());
                    }
                    start = true;
                    tf.setText(s1.append("8").toString());
                }
                if(arg0.getActionCommand()=="9"){
                    if(!start){
                        s1.delete(0, s1.length());
                    }
                    start = true;
                    tf.setText(s1.append("9").toString());
                }
                //����С����
                if(arg0.getActionCommand()=="."){
                    if(!start){
                        s1.delete(0, s1.length());
                    }
                    start=true;
                    if(s1.toString().equals(new String()))
                        tf.setText(s1.append("0.").toString());
                    else if(s1.length()==1&&s1.charAt(0)=='-')
                        tf.setText(s1.append("0.").toString());
                    else
                        tf.setText(s1.append(".").toString());
                }
                //���븺��
                if(arg0.getActionCommand()=="+/-"){
                    if(!start){
                        s1.delete(0, s1.length());
                    }
                    start = true;
                    if(s1.toString().equals(new String()))
                        tf.setText(s1.append('-').toString());
                }
                //�˸�Backspace
                if(arg0.getActionCommand()=="Backspace"){
                    start = true;
                    if(s1.length()!=0){
                        //ɾ����������һλ
                        s1.deleteCharAt(s1.length()-1);
                        tf.setText(s1.toString());
                    }
                }
                //����CE
                if(arg0.getActionCommand()=="CE"){
                    //������У�start�����Ϊtrue
                    start = true;
                    s1.delete(0, s1.length());
                    s2.delete(0, s2.length());
                    tf.setText(s1.toString());
                }
                //���C
                if(arg0.getActionCommand()=="C"){
                    //��յ�ǰ���룬��s1����
                    start = true;
                    s1.delete(0, s1.length());
                    tf.setText(s1.toString());
                }
                //�Ӻ�
                if(arg0.getActionCommand()=="+"){
                    start = true;
                    flag="+";
                    //s2����s1��ֵ
                    s2.append(String.valueOf(s1.toString()));
                    //s1���㣬���½�����һ������
                    s1.delete(0, s1.length());
                    tf.setText(s1.toString());
                }
                //����
                if(arg0.getActionCommand()=="-"){
                    start = true;
                    flag="-";
                    s2.append(String.valueOf(s1.toString()));
                    s1.delete(0, s1.length());
                    tf.setText(s1.toString());
                }
                //�˺�
                if(arg0.getActionCommand()=="*"){
                    start = true;
                    flag="*";
                    s2.append(String.valueOf(s1.toString()));
                    s1.delete(0, s1.length());
                    tf.setText(s1.toString());
                }
                //����
                if(arg0.getActionCommand()=="/"){
                    start = true;
                    flag="/";
                    s2.append(String.valueOf(s1.toString()));
                    s1.delete(0, s1.length());
                    tf.setText(s1.toString());
                }
                //������
                if(arg0.getActionCommand()=="sqrt"){
                    start =false;
                    double s=Double.parseDouble(s1.toString());
                    s1.delete(0, s1.length());
                tf.setText(s1.append(String.valueOf(Math.sqrt(s))).toString());
                }
                //��%
                if(arg0.getActionCommand()=="%"){
                    start =false;
                    double s=Double.parseDouble(s1.toString());
                    s1.delete(0, s1.length());
                    tf.setText(s1.append(String.valueOf(s/100)).toString());
                }
                //��1/x
                if(arg0.getActionCommand()=="1/x"&&!s1.toString().equals(new String())&&Double.parseDouble(s1.toString())!=0){
                    start =false;
                    double s=Double.parseDouble(s1.toString());
                    s1.delete(0, s1.length());
                    tf.setText(s1.append(String.valueOf(1/s)).toString());
                }
                //����
                if(arg0.getActionCommand()=="="&&s1.length()!=0&&s2.length()!=0){
                    //start���Ϊfalse
                    start =false;
                    //�ֱ��ȡs1��s2��ֵ
                    double s4=Double.parseDouble(s1.toString()); 
                    double s3=Double.parseDouble(s2.toString());
                    //���s1��s2�����ڿ�ʼ��һ������
                    s1.delete(0, s1.length());
                    s2.delete(0, s2.length());
                    //��������
                    if(flag=="+"){
                        tf.setText(s1.append(String.valueOf(s3+s4)).toString());
                    }
                    if(flag=="-"){
                        tf.setText(s1.append(String.valueOf(s3-s4)).toString());
                    }
                    if(flag=="*"){
                        tf.setText(s1.append(String.valueOf(s3*s4)).toString());
                    }
                    if(flag=="/"){
                        tf.setText(s1.append(String.valueOf(s3/s4)).toString());
                    }
                }       

            }
        };
        //��Ӱ�ť�Լ�������
        JButton bks = new JButton("Backspace");
        bks.addActionListener(listen);
        JButton ce = new JButton("CE");
        ce.addActionListener(listen);
        JButton c = new JButton("C");
        c.addActionListener(listen);
        p2.add(bks);
        p2.add(ce);
        p2.add(c);
        f.add(p2);
        JPanel p3 = new JPanel();
        p3.setLayout(new GridLayout(4,5));
        JButton b1 = new JButton("7");
        p3.add(b1);
        b1.addActionListener(listen);
        JButton b2 = new JButton("8");
        p3.add(b2);
        b2.addActionListener(listen);
        JButton b3 = new JButton("9");
        p3.add(b3);
        b3.addActionListener(listen);
        JButton b4 = new JButton("/");
        p3.add(b4);
        b4.addActionListener(listen);
        JButton b5 = new JButton("sqrt");
        p3.add(b5);
        b5.addActionListener(listen);
        JButton b6 = new JButton("4");
        p3.add(b6);
        b6.addActionListener(listen);
        JButton b7 = new JButton("5");
        p3.add(b7);
        b7.addActionListener(listen);
        JButton b8 = new JButton("6");
        p3.add(b8);
        b8.addActionListener(listen);
        JButton b9 = new JButton("*");
        p3.add(b9);
        b9.addActionListener(listen);
        JButton b10 = new JButton("%");
        p3.add(b10);
        b10.addActionListener(listen);
        JButton b11 = new JButton("1");
        p3.add(b11);
        b11.addActionListener(listen);
        JButton b12 = new JButton("2");
        p3.add(b12);
        b12.addActionListener(listen);
        JButton b13 = new JButton("3");
        p3.add(b13);
        b13.addActionListener(listen);
        JButton b14 = new JButton("-");
        p3.add(b14);
        b14.addActionListener(listen);
        JButton b15 = new JButton("1/x");
        p3.add(b15);
        b15.addActionListener(listen);
        JButton b16 = new JButton("0");
        p3.add(b16);
        b16.addActionListener(listen);
        JButton b17 = new JButton("+/-");
        p3.add(b17);
        b17.addActionListener(listen);
        JButton b18 = new JButton(".");
        p3.add(b18);
        b18.addActionListener(listen);
        JButton b19 = new JButton("+");
        p3.add(b19);
        b19.addActionListener(listen);
        JButton b20 = new JButton("=");
        p3.add(b20);
        b20.addActionListener(listen);
        f.add(p3,BorderLayout.SOUTH);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.pack();
        f.setVisible(true);
    }

    public static void main(String args[]){
        //���÷�����ʵ�ּ�����
        new Test().init();
    }

}