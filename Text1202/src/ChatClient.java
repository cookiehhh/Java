import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * ����ͻ���
 * 1������Socket����
 * 2��д������
 * 3����ȡ�ӷ������˷���������
 * 4���ر�
 * @author L
 *
 */
public class ChatClient {

    /**
     * @param args
     */
    public static void main(String[] args) {
        try {
            //1������Socket����("192.168.1.107", 8857)�ֱ�Ϊ����IP�Ͷ˿ںţ�������˿ں�Ҫһ��
            Socket client = new Socket("192.168.1.107", 8857);
            
            //2.1�����������������������
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(
                            client.getInputStream()));
            
            PrintWriter out = new PrintWriter(client.getOutputStream(), true);
            
            BufferedReader inByClient = new BufferedReader(
                    new InputStreamReader(System.in));
            
            //�������˷��͵�����
            String data = null;
            //�ͻ������������д�������
            String answer = null;
            
            do
            {
                //2.2���ͻ��˵Ķ�д����
                System.out.print("��˵��");
                //��ȡҪ���͸��������˵�����
                answer = inByClient.readLine();
                //���������д������
                out.println(answer);
                out.flush();
                
                //��ȡ�������˷��͵�����
                data = in.readLine();
                //����ӷ������˻�ȡ������
                System.out.println("�������˷�����Ϣ�ǣ�" + data);
            }while(!"bye".equals(data));
            
            //3���ر�
            in.close();
            out.close();
            inByClient.close();
            client.close();
            
            System.out.println("�ͻ��˹رա���");
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}