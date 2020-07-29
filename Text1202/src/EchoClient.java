import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;
public class EchoClient {
    public static void main(String[] args) throws Exception {
        Socket client = new Socket("localhost", 9999);		// 服务器地址与端口
        Scanner input = new Scanner(System.in); 		// 键盘输入数据
        // 利用Scanner包装客户端输入数据（服务器端输出），PrintStream包装客户端输出数据；
        Scanner scan = new Scanner(client.getInputStream());
        PrintStream out = new PrintStream(client.getOutputStream());
        input.useDelimiter("\n");					// 设置键盘输入分隔符
        scan.useDelimiter("\n");						// 设置回应数据分隔符
        boolean flag = true;						// 循环标志
        while (flag) {
            System.out.print("请输入要发送数据：");
            if (input.hasNext()) {					// 键盘是否输入数据
               String str = input.next().trim();			// 取得键盘输入数据
               out.println(str); 					// 发送数据到服务器端
               if (str.equalsIgnoreCase("byebye")) {		// 结束标记
                  flag = false; 					// 结束循环
               }
               if (scan.hasNext()) {					// 服务器端有回应
                  System.out.println(scan.next()); 		// 输出回应数据
               }
            }
        }
        input.close();
        scan.close();
        out.close();
        client.close();
    }
}
