import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {

	public static void main(String[] args) throws IOException {
        System.out.println("����������������");
		
		//1��������˶���
		ServerSocket ss = new ServerSocket(9997);
		
		//2,��ȡ���ӹ����Ŀͻ��˶���
		Socket s = ss.accept();
		
		//3��ͨ��socket�����ȡ��������Ҫ��ȡ�ͻ��˷���������
		InputStream in = s.getInputStream();
		
		String ip = s.getInetAddress().getHostAddress();
		
		byte[] buf = new byte[1024];
		
		int len = in.read(buf);
		String text = new String(buf,0,len);
		System.out.println(ip+"�����:"+text.toUpperCase());
		
		if (text.equals("over")) {
			s.close();
			ss.close();
			System.out.println("���������ѹرգ�");
		}
		
	}

}
