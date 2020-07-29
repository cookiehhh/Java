import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
public class HelloServer { 
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(9998) ;		// 所有的服务器必须有端口
        System.out.println("等待客户端连接.....");				// 提示信息
        Socket client = server.accept() ;					// 等待客户端连接
        // OutputStream并不方便进行内容的输出，所以利用打印流完成输出
        PrintStream out = new PrintStream(client.getOutputStream()) ;
        out.println("Hello World !");						// 输出数据
        out.close(); 
        client.close();
        server.close();
    }
}
