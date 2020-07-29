import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;
public class EchoClient {
    public static void main(String[] args) throws Exception {
        Socket client = new Socket("localhost", 9999);		// ��������ַ��˿�
        Scanner input = new Scanner(System.in); 		// ������������
        // ����Scanner��װ�ͻ����������ݣ����������������PrintStream��װ�ͻ���������ݣ�
        Scanner scan = new Scanner(client.getInputStream());
        PrintStream out = new PrintStream(client.getOutputStream());
        input.useDelimiter("\n");					// ���ü�������ָ���
        scan.useDelimiter("\n");						// ���û�Ӧ���ݷָ���
        boolean flag = true;						// ѭ����־
        while (flag) {
            System.out.print("������Ҫ�������ݣ�");
            if (input.hasNext()) {					// �����Ƿ���������
               String str = input.next().trim();			// ȡ�ü�����������
               out.println(str); 					// �������ݵ���������
               if (str.equalsIgnoreCase("byebye")) {		// �������
                  flag = false; 					// ����ѭ��
               }
               if (scan.hasNext()) {					// ���������л�Ӧ
                  System.out.println(scan.next()); 		// �����Ӧ����
               }
            }
        }
        input.close();
        scan.close();
        out.close();
        client.close();
    }
}
