import java.net.Socket;
import java.util.Scanner;
public class HelloClient {
    public static void main(String[] args) throws Exception {
        Socket client = new Socket("localhost",9998) ;			// ���ӷ�������
        // ȡ�ÿͻ��˵��������������󣬱�ʾ���շ������˵������Ϣ
        Scanner scan = new Scanner(client.getInputStream()) ;	// ���շ������˻�Ӧ����
        scan.useDelimiter("\n") ;						// ���÷ָ���
        if (scan.hasNext()) {							// �Ƿ�������
           System.out.println("����Ӧ���ݡ�" + scan.next());	// ȡ������
        }
        scan.close();
        client.close();
    }
}
