import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class OutputCharText {

	public static void main(String[] args) throws Exception {
		long time = System.currentTimeMillis();
		FileInputStream in = new FileInputStream("F://T1.txt");
		FileOutputStream out = new FileOutputStream("F://T2.txt",true);
		
		int ch;
		while((ch = in.read()) != -1) {
			out.write(ch);
		}
		System.out.println("������ɣ�");
		System.out.println("����ʱ�䣺"+(System.currentTimeMillis() - time));
	}

}
