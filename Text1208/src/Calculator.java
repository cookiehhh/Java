import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator{

	public Calculator() {
		
		JFrame frame = new JFrame("计算器");
		frame.setSize(400, 230);
		
		JTextField textf = new JTextField(30);
		textf.setHorizontalAlignment(JTextField.RIGHT);
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		panel1.add(textf);
		panel2.setLayout(new GridLayout(1,3));
		panel3.setLayout(new GridLayout(4,5,5,5));

		JButton bks = new JButton("Backspace");
        JButton ce = new JButton("CE");
        JButton c = new JButton("C");
        panel2.add(bks);
        panel2.add(ce);
        panel2.add(c);
		
        JButton data7 = new JButton("7");
        panel3.add(data7);
        JButton data8 = new JButton("8");
        panel3.add(data8);
        JButton data9 = new JButton("9");
        panel3.add(data9);
        JButton dvd = new JButton("/");
        panel3.add(dvd);
        JButton sqr = new JButton("sqrt");
        panel3.add(sqr);
        JButton data4 = new JButton("4");
        panel3.add(data4);
        JButton data5 = new JButton("5");
        panel3.add(data5);
        JButton data6 = new JButton("6");
        panel3.add(data6);
        JButton mtp = new JButton("*");
        panel3.add(mtp);
        JButton mod = new JButton("%");
        panel3.add(mod);
        JButton data1 = new JButton("1");
        panel3.add(data1);
        JButton data2 = new JButton("2");
        panel3.add(data2);
        JButton data3 = new JButton("3");
        panel3.add(data3);
        JButton minus = new JButton("-");
        panel3.add(minus);
        JButton cbw = new JButton("1/x");
        panel3.add(cbw);
        JButton data0 = new JButton("0");
        panel3.add(data0);
        JButton ldi = new JButton("+/-");
        panel3.add(ldi);
        JButton point = new JButton(".");
        panel3.add(point);
        JButton plus = new JButton("+");
        panel3.add(plus);
        JButton equ = new JButton("=");
        panel3.add(equ);
		
		frame.add(panel1,BorderLayout.NORTH);
		frame.add(panel2,BorderLayout.CENTER);
		frame.add(panel3,BorderLayout.SOUTH);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
		
		data0.addActionListener(new ActionListener(){//数字0的输入
            public void actionPerformed(ActionEvent arg0){
                if(textf.getText().equals("0")){//将按钮值与0作比较
                    textf.requestFocus();//把输入焦点放在调用这个方法的控件上(即把光标放在文本框textf里)
                }
                else{
                    String str = textf.getText();//取得当前按钮的按钮值
                    textf.setText(str+"0");   //将文本内容后加上字符0
                }
            }
        });
        data1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                if(textf.getText().equals("0")){
                    textf.setText("");//将文本框初始化为空
                    textf.setText("1");//将文本框内容置为 1
                    textf.requestFocus();
                }
                else{
                    String str = textf.getText();//取得当前按钮的按钮值
                    textf.setText(str+"1");   //将文本内容后加上字符1
                }
            }
        });
        data2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                if(textf.getText().equals("0")){
                    textf.setText("");
                    textf.setText("2");
                    textf.requestFocus();
                }
                else{
                    String str = textf.getText();
                    textf.setText(str+"2");
                }
            }
        });
        data3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                if(textf.getText().equals("0")){
                    textf.setText("");
                    textf.setText("3");
                    textf.requestFocus();
                }
                else{
                    String str = textf.getText();
                    textf.setText(str+"3");
                }
            }
        });
        data4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                if(textf.getText().equals("0")){
                    textf.setText("");
                    textf.setText("4");
                    textf.requestFocus();
                }
                else{
                    String str = textf.getText();
                    textf.setText(str+"4");
                }
            }
        });
        data5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                if(textf.getText().equals("0")){
                    textf.setText("");
                    textf.setText("5");
                    textf.requestFocus();
                }
                else{
                    String str = textf.getText();
                    textf.setText(str+"5");
                }
            }
        });
        data6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                if(textf.getText().equals("0")){
                    textf.setText("");
                    textf.setText("6");
                    textf.requestFocus();
                }
                else{
                    String str = textf.getText();
                    textf.setText(str+"6");
                }
            }
        });
        data7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                if(textf.getText().equals("0")){
                    textf.setText("");
                    textf.setText("7");
                    textf.requestFocus();
                }
                else{
                    String str = textf.getText();
                    textf.setText(str+"7");
                }
            }
        });
        data8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                if(textf.getText().equals("0")){
                    textf.setText("");
                    textf.setText("8");
                    textf.requestFocus();
                }
                else{
                    String str = textf.getText();
                    textf.setText(str+"8");
                }
            }
        });
        data9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                if(textf.getText().equals("0")){
                    textf.setText("");
                    textf.setText("9");
                    textf.requestFocus();
                }
                else{
                    String str = textf.getText();
                    textf.setText(str+"9");
                }
            }
        });
        point.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                if(textf.getText().equals("0")){
                    textf.setText("");
                    textf.setText(".");
                    textf.requestFocus();
                }
                else{
                    String str = textf.getText();
                    textf.setText(str+".");
                }
            }
        });
        plus.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                if(textf.getText().equals("0")){
                    textf.setText("");
                    textf.setText("+");
                    textf.requestFocus();
                }
                else{
                    String str = textf.getText();
                    textf.setText(str+"+");
                }
            }
        });
        minus.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                if(textf.getText().equals("0")){
                    textf.setText("");
                    textf.setText("-");
                    textf.requestFocus();
                }
                else{
                    String str = textf.getText();
                    textf.setText(str+"-");
                }
            }
        });
        mtp.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                if(textf.getText().equals("0")){
                    textf.setText("");
                    textf.setText("*");
                    textf.requestFocus();
                }
                else{
                    String str = textf.getText();
                    textf.setText(str+"*");
                }
            }
        });
        dvd.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                if(textf.getText().equals("0")){
                    textf.setText("");
                    textf.setText("/");
                    textf.requestFocus();
                }
                else{
                    String str = textf.getText();
                    textf.setText(str+"/");
                }
            }
        });
        bks.addActionListener(new ActionListener(){//监听退格键
            public void actionPerformed(ActionEvent arg0){//处理退格键被按下的事件
                String text = textf.getText();
                int i = text.length();
                if(i>0){
                    text = text.substring(0,i-1);//去掉最后一个字符
                    if (text.length() == 0) {// 如果文本没有了内容，则初始化计算器的各种值
                        textf.setText("0");
                    } else { // 显示新的文本
                        textf.setText(text);
                }
            }
            }
        });
        ce.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
            	String text = textf.getText();
                int i = text.length();
                if(i>0){
                    text = text.substring(0,0);
                    if (text.length() == 0) {
                        textf.setText("0");
                    } else { 
                        textf.setText(text);
                }
            }
            }
        });
        c.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                textf.setText("0");
            }

        });
        sqr.addActionListener(new ActionListener(){//监听sqrt键
            public void actionPerformed(ActionEvent e){//sqrt键被按事件
                String i = textf.getText();
                Double j = Double.parseDouble(i);//将字符串转换成对应的double类型的数值
                double ans = (double)Math.sqrt(j);//求开方
                String answer = String.valueOf(ans);//将double型数据转换成String类型
                textf.setText(answer);//将文本框设置为开方后的结果
            }
        });
        mod.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String i = textf.getText();
                Double j = Double.parseDouble(i);
                double ans = (double)(j/100);
                String answer = String.valueOf(ans);
                textf.setText(answer);
            }
        });
        cbw.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String i = textf.getText();
                Double j = Double.parseDouble(i);
                double ans = (double)(1/j);
                String answer = String.valueOf(ans);
                textf.setText(answer);
            }
        });
        ldi.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String i = textf.getText();
                Double j = Double.parseDouble(i);
                double ans = (double)(-j);
                String answer = String.valueOf(ans);
                textf.setText(answer);
            }
        });
        equ.addActionListener(new ActionListener(){ //监听 “等号” 按键
            public void actionPerformed(ActionEvent arg0){//处理“等号” 按键被按下事件
                //【**加法运算**】
                if(textf.getText().indexOf("+")!= -1){
                    //将字符串分割为子字符串，然后将结果作为字符串数组返回
                    String[] s = textf.getText().split("[+]");//转义字符，要用"[+]"或者"\+"
                    Double d1 = Double.parseDouble(s[0]);//返回一个指定字符串表示的double值
                    Double d2 = Double.parseDouble(s[1]);
                    double ans = d1 + d2;
                    String answer = String.valueOf(ans);//将结果转换为字符串
                    textf.setText(answer);//将加法运算的结果以字符串形式在文本框中显示
                }
                //【**减法运算**】
                else if(textf.getText().indexOf("-")!= -1){
                    String[] s = textf.getText().split("-");
                    textf.setText("");
                    Double d1 = Double.parseDouble(s[0]);
                    Double d2 = Double.parseDouble(s[1]);
                    double ans = d1-d2;
                    String answer =String.valueOf(ans);
                    textf.setText(answer);
                }
                //【**乘法运算**】
                else if(textf.getText().indexOf("*")!= -1){
                    String[] s = textf.getText().split("[*]");//*是转义字符，要用"[*]",或者"\*"
                    textf.setText("");
                    Double d1 = Double.parseDouble(s[0]);
                    Double d2 = Double.parseDouble(s[1]);
                    double ans = d1*d2;
                    String answer =String.valueOf(ans);
                    textf.setText(answer);
                }
                //【**除法运算**】
                else if(textf.getText().indexOf("/")!= -1){
                    String[] s = textf.getText().split("/");
                    textf.setText("");
                    Double d1 = Double.parseDouble(s[0]);
                    Double d2 = Double.parseDouble(s[1]);
                    double ans = d1/d2;
                    String answer =String.valueOf(ans);
                    textf.setText(answer);
                }
                else{
                    textf.setText("请选择要进行的运算");
                }
            }
        });
		
	}
	
	public static void main(String[] args) {
		new Calculator();
	}

}
