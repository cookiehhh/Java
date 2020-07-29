import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientDemo {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Scanner input = new Scanner(System.in);
		
		System.out.println("客户端启动！");	
		
		//创建客户端socket服务。
		Socket socket = new Socket("192.168.1.107",9997);
		
		//获取socket流中的输出流。 
		OutputStream out = socket.getOutputStream();
		
		System.out.println("请输入数据：");
		String str = input.next();
		out.write(str.getBytes());
		socket.close();
		
	}

}
