
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {

	public static void main(String[] args) throws IOException {
		System.out.println("服务器端已启动！");
		
		ServerSocket serverSocket = new ServerSocket(10002);
		
		Socket socket = serverSocket.accept();
		
		String ip = socket.getInetAddress().getHostAddress();
		
		InputStream in = socket.getInputStream();
		OutputStream out = socket.getOutputStream();
		
		byte[] byt = new byte[1024];
		
		int len = in.read(byt);
		String text = new String(byt,0,len);
		if (text.equals("over")) {
			socket.close();
			serverSocket.close();
			System.out.println("服务器端已关闭！");
		} else {
			System.out.println(ip+":"+text.toUpperCase());
			out.write(text.toUpperCase().getBytes());
		}
		

		
		
	}

}
