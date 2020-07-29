import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {

	public static void main(String[] args) throws IOException {
        System.out.println("服务器端已启动！");
		
		//1创建服务端对象。
		ServerSocket ss = new ServerSocket(9997);
		
		//2,获取连接过来的客户端对象。
		Socket s = ss.accept();
		
		//3，通过socket对象获取输入流，要读取客户端发来的数据
		InputStream in = s.getInputStream();
		
		String ip = s.getInetAddress().getHostAddress();
		
		byte[] buf = new byte[1024];
		
		int len = in.read(buf);
		String text = new String(buf,0,len);
		System.out.println(ip+"服务端:"+text.toUpperCase());
		
		if (text.equals("over")) {
			s.close();
			ss.close();
			System.out.println("服务器端已关闭！");
		}
		
	}

}
