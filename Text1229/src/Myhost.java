import java.net.InetAddress;
import java.net.UnknownHostException;

public class Myhost {

	public static void main(String[] args) {
		String host = null;
		try {
			InetAddress ia = InetAddress.getLocalHost();
			System.out.println(ia);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
