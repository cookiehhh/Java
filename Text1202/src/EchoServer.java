import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
class EchoThread implements Runnable {					// �����߳���
    private Socket client;								// ÿ���̴߳���һ���ͻ���
    public EchoThread(Socket client) {				// �����̶߳���ʱ����Socket
        this.client = client;
    }
    @Override
    public void run() {	
        try {	// ÿ���̶߳���ȡ�ø���Socket���������������
            Scanner scan = new Scanner(client.getInputStream());
            PrintStream out = new PrintStream(client.getOutputStream());
            boolean flag = true; 					// ���ƶ�ν��ղ���
            while (flag) {
                if (scan.hasNext()) {					// �Ƿ�������
                   String str = scan.next().trim(); 		// �õ��ͻ��˷��͵�����
                   if (str.equalsIgnoreCase("byebye")) { 	// �������
                      out.println("�ݰݣ��´��ٻᣡ");
                      flag = false; 					// �˳�ѭ��
                   } else { 						// Ӧ�û�Ӧ������Ϣ
                      out.println("ECHO : " + str);		// ��Ӧ��Ϣ
                   }
                }
            }
            scan.close();
            out.close();
            client.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
public class EchoServer {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(9999);	// ��9999�˿��ϼ���
        boolean flag = true;						// ѭ�����
        while (flag) {								// ���ն���ͻ�������
            Socket client = server.accept(); 			// �ͻ�������
            new Thread(new EchoThread(client)).start();	// �������������߳�
        }
        server.close();
    }
}
