import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class TestFlowLayout {//流布局
    public static void main(String[] args) {
        JFrame jf = new JFrame("流布局"); 	//建立一个窗口
        FlowLayout fl = new FlowLayout();  		//使用流布局
        jf.setLayout(fl);						//修改布局管理
        JButton jb1 = new JButton("按钮1");		//创建一个按钮
        jf.add(jb1); 							//把按钮jb1放入窗口
        JButton jb2 = new JButton("按钮2");		//创建一个按钮
        jf.add(jb2);							//把按钮jb2放入窗口
        jf.setSize(600, 300);					//设置窗口的大小
        jf.setLocation(300,200);				//设置窗口的初始位置
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗口
        jf.setVisible(true); 					//显示窗口
    }
}
