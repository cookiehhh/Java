import java.io.*;
import java.net.*;
 
public class ChatTwoServer {
	
	public ChatTwoServer(int port,String name) throws IOException
	{
		ServerSocket server=new ServerSocket(port);//����seversocket�����ṩtcp���ӷ���ָ���˿�port���ȴ�tcp���ӡ�
		System.out.print("���ڵȴ����ӣ����������");
		Socket client=server.accept();//����socket�������ȴ����տͻ��˵����ӡ�
		new ChatTwoClient(name,client);//ʵ��ͼ�ν��档
		server.close();
	}
 
	public static void main(String[] args) throws IOException {
		new ChatTwoServer(2001,"SQ");
 
	}
 
}
