import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FIText {
	public static void main(String[] args) throws Exception {
		FileInputStream in = new FileInputStream("F://a1.txt");
		int b = 0;
		while(true) {
			b = in.read();
			if(b==-1) {
				break;
			}
			System.out.print((char)b);
		}
		in.close();
	}
	
}
