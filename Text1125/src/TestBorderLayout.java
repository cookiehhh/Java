import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class TestBorderLayout {//边框布局
    public static void main(String[] args) {
        JFrame jf = new JFrame("边框布局");
        JButton jb = new JButton("中");
        jf.add(jb); 						//把按钮放入边框布局的中部

        JButton jb1 = new JButton("东");  //创建一个按钮
        jf.add(jb1,BorderLayout.EAST);     //放在东部

        JButton jb2 = new JButton("南"); 
        jf.add(jb2,BorderLayout.SOUTH);     //放在南部

        JButton jb3 = new JButton("西"); 
        jf.add(jb3,BorderLayout.WEST);      //放在西部  

        JButton jb4 = new JButton("北"); 
        jf.add(jb4,BorderLayout.NORTH);     //放在北边

        jf.setSize(600, 300);               //设置按钮的大小
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭
        jf.setVisible(true);//显示窗口
    }
}
