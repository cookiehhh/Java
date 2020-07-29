import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientDemo {

	private static Scanner input;

	public static void main(String[] args) throws UnknownHostException, IOException {
		input = new Scanner(System.in);
		System.out.println("客户端启动！");	
		
		Socket socket = new Socket("192.168.1.107",10002);
		
		OutputStream out = socket.getOutputStream();
		
		System.out.println("请输入数据：");
		String str = input.next();
		
		InputStream in = socket.getInputStream();
		
		byte[] byt = new byte[1024];
		
		
		
		if (str.equals("over")) {
			out.write(str.getBytes());
			socket.close();
			System.out.println("客户端关闭！");
		} else {
			out.write(str.getBytes());
			int len = in.read(byt);
			String text = new String(byt,0,len);
			System.out.println(text);
		}
		
	}

}
