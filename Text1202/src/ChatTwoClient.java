import java.awt.event.*;
import javax.swing.*;
import java.net.*;
import java.io.*;
 
public class ChatTwoClient extends JFrame implements ActionListener {
	private String name;
	private JTextArea text_re;
	private JTextField text_se;
	private PrintWriter cout;
	private JButton buttons[];
	public ChatTwoClient(String name,Socket socket) throws IOException
	{
		super("��:"+name+InetAddress.getLocalHost().getHostAddress()+":"+socket.getLocalPort());
		this.setBounds(320, 240, 400, 240);
		this.text_re=new JTextArea();
		this.text_re.setEditable(false);
		this.getContentPane().add(new JScrollPane(this.text_re));
		
		JToolBar toolBar=new JToolBar();
		this.getContentPane().add(toolBar,"South");
		toolBar.add(this.text_se=new JTextField(30));
		buttons=new JButton[2];
		buttons[0]=new JButton("����");
		buttons[1]=new JButton("����");
		toolBar.add(buttons[0]);
		toolBar.add(buttons[1]);
		buttons[0].addActionListener(this);
		buttons[1].addActionListener(this);//����ť����¼�������ί�е�ǰ������
		this.setVisible(true);
		this.name=name;
		this.cout=new PrintWriter(socket.getOutputStream(),true);//���socket�����
		this.cout.println(name);
		BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream())); //��socket���ֽ�������ת��Ϊ�ַ�����Ĭ��GBK�ַ������ٴ��������ַ�������
                String line="����"+br.readLine()+"�ɹ�";
                while(line!=null&&!line.endsWith("bye"))
		{
			text_re.append(line+"\r\n");
			line=br.readLine();
		}//��ȡ�Է����͵����ݲ���ʾ��ֱ������ΪΪ�ջ�Է�����
		br.close();
		this.cout.close();
		socket.close();
		buttons[0].setEnabled(false);
		buttons[1].setEnabled(false);
	}
	public ChatTwoClient(String name,String host,int port) throws IOException
	{
		this(name,new Socket(host,port));//������һ�����췽��
	}
	public void actionPerformed(ActionEvent ev)
	{
		if(ev.getActionCommand().equals("����"))
		{
			this.cout.println(name+":"+text_se.getText());
			text_re.append("�ң�"+text_se.getText()+"\n");
			text_se.setText("");
		}//���·��Ͱ�ť�󣬽����ݷ������������Լ�����������
		if(ev.getActionCommand().equals("����"))
		{
			text_re.append("��������\n");
			this.cout.println(name+"����\n"+"bye\n");
			buttons[0].setEnabled(false);
			buttons[1].setEnabled(false);
		}//���߰�ť���º󣬷���bye��Ϊ���߱��
	}
	
 
	public static void main(String[] args) throws IOException {
		new ChatTwoClient("mxl","127.0.0.1",2001); //ip��ַ�Ͷ˿�
 
	}
 
}
