package test123;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class jisuanqi {

	public static void main(String[] args) {
		JFrame frame = new JFrame("¼ÆËãÆ÷");
		frame.setSize(400, 250);
		
		JTextField textf = new JTextField(30);
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		panel1.add(textf);
		panel2.setLayout(new GridLayout(4,5,5,5));
		panel3.setLayout(new GridLayout(1,3));
		String[] lab1 = {"1","2","3","+","sqrt","4","5","6","-","%","7",
	            "8","9","*","1/x","0","+/-",".","/","="};
		String[] lab2 = {"Backspace","CE","C"};
		for(int i=0;i<lab1.length;i++){
            JButton button = new JButton(lab1[i]); 
            panel2.add(button);
        }
		for(int i=0;i<lab2.length;i++){
            JButton button = new JButton(lab2[i]); 
            panel3.add(button);
        }
		frame.add(panel1,BorderLayout.NORTH);
		frame.add(panel3,BorderLayout.CENTER);
		frame.add(panel2,BorderLayout.SOUTH);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setVisible(true);
	}

}
