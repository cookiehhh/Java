import java.awt.Frame;

import javax.swing.JFrame;

public class FrameText {

	public static void main(String[] args) {
		JFrame jfram = new JFrame();
		jfram.setSize(400, 200);	
		jfram.setTitle("你好！");
		//如果在代码里没加这个方法，那么在点击框架的”叉叉“退出框架后，程序仍然没有退出，只是JFrame被关闭了。
		jfram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfram.setVisible(true);
		

	}

}
