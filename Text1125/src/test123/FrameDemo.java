package test123;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FrameDemo {

	public static void main(String[] args) {
		JFrame jfram = new JFrame();
		jfram.setSize(400, 400);
		jfram.setLocation(600, 300);
		jfram.setBackground(Color.red);
		jfram.setTitle("ÄãºÃ£¡");

		jfram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton button = new JButton("Button");
        button.setBounds(100, 100, 100, 50);
		
		JPanel jpanle = new JPanel();
		jpanle.setSize(400, 200);
		
		jpanle.add(button);
		jfram.add(jpanle);
		
		jfram.setVisible(true);
		

	}

}
