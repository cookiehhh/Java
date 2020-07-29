import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
/**
 * �������˴���
 * ��ȡ�ͻ��˷��͵���Ϣ����ʾ���ҷ��ض�Ӧ�Ļظ�
 * 1������ServerSocket����
 * 2������accept������ȡ�ͻ�������
 * 3��ʹ����������ȡ�ͻ��˷��͵�����
 * 4��ʹ���������ͻ���д������
 * 5���رն�Ӧ�Ķ���
 * @author L
 *
 */
public class ChatServer {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try {
            //1������ServerSocket����,8875Ϊ�Զ���˿ں�
            ServerSocket server = new ServerSocket(8857);
            
            //����ʾ
            System.out.println("�ȴ��ͻ������ӡ���");
            
            //2����ȡ�ͻ�������
            Socket client = server.accept();
            
            //��ȡ�ͻ��˵������Ϣ
            System.out.println(client.getInetAddress().getHostAddress() + "���������ˡ���");
            
            //3.1�����������������������
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(
                            client.getInputStream()));
            
            //������ȡ�ӿ���̨��������ݣ��������ݷ��͸��ͻ���
            BufferedReader inByServer = new BufferedReader(
                    new InputStreamReader(System.in));
            
            PrintWriter out = new PrintWriter(client.getOutputStream(), true);
            
            //��ȡ��������
            String data = null;
            String answer = null;
            
            //ѭ���Ϳͻ��˽���ͨ��
            do
            {
                //3.2����ȡ�ͻ��˷��͵�����
                data = in.readLine();
                
                //�ڷ���������ʾ��ȡ��������
                System.out.println("�ͻ��˷�����Ϣ��" + data);
                
                //��ȡ��������Ҫ���͸��ͻ��˵���Ϣ
                System.out.print("�������˻ظ��ͻ��ˣ�");
                answer = inByServer.readLine();
                
                //3.3��������д�뵽�ͻ���
                out.println(answer);
                out.flush();
            }while(!"bye".equals(data));
            
            //4���ر������Դ
            out.flush();
            in.close();
            inByServer.close();
            out.close();
            
            //�ر�Socket����
            client.close();
            server.close();
            
            System.out.println("�������˹رա���");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}