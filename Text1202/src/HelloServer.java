import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
public class HelloServer { 
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(9998) ;		// ���еķ����������ж˿�
        System.out.println("�ȴ��ͻ�������.....");				// ��ʾ��Ϣ
        Socket client = server.accept() ;					// �ȴ��ͻ�������
        // OutputStream��������������ݵ�������������ô�ӡ��������
        PrintStream out = new PrintStream(client.getOutputStream()) ;
        out.println("Hello World !");						// �������
        out.close(); 
        client.close();
        server.close();
    }
}
