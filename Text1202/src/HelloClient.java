import java.net.Socket;
import java.util.Scanner;
public class HelloClient {
    public static void main(String[] args) throws Exception {
        Socket client = new Socket("localhost",9998) ;			// 连接服务器端
        // 取得客户端的输入数据流对象，表示接收服务器端的输出信息
        Scanner scan = new Scanner(client.getInputStream()) ;	// 接收服务器端回应数据
        scan.useDelimiter("\n") ;						// 设置分隔符
        if (scan.hasNext()) {							// 是否有数据
           System.out.println("【回应数据】" + scan.next());	// 取出数据
        }
        scan.close();
        client.close();
    }
}
