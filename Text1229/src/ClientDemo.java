import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientDemo {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Scanner input = new Scanner(System.in);
		
		System.out.println("�ͻ���������");	
		
		//�����ͻ���socket����
		Socket socket = new Socket("192.168.1.107",9997);
		
		//��ȡsocket���е�������� 
		OutputStream out = socket.getOutputStream();
		
		System.out.println("���������ݣ�");
		String str = input.next();
		out.write(str.getBytes());
		socket.close();
		
	}

}
