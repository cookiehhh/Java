import java.io.FileInputStream;
import java.io.InputStreamReader;

public class InputStreamReaderText {

	public static void main(String[] args) throws Exception {
		InputStreamReader isr = new InputStreamReader(new FileInputStream("E://Java//test/t1.txt"));
//		int c ;
//		while((c = isr.read())!=-1){
//		       System.out.print((char)c);
//		}
		char[] buffer = new char[8*1024];
		int c;
		
		while(( c = isr.read(buffer,0,buffer.length))!=-1){
			String s = new String(buffer,0,c);
			System.out.print(s);
		}


	}

}
