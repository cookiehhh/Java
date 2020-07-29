import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class OutputStreamWriterText {
	public static void main(String[] args) throws Exception {
		long time = System.currentTimeMillis();
		InputStreamReader isr = new InputStreamReader(new FileInputStream("E://Java//test/t1.txt"));
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("E://Java//test/t2.txt" , true));
		
//		int c ;
//		while((c = isr.read())!=-1){
//		       osw.write(c);
//		}
		char[] buffer = new char[8*1024];
		int c;	
		while(( c = isr.read(buffer,0,buffer.length))!=-1){
			osw.write(buffer, 0, c);
			osw.flush();
		}
		System.out.println("复制完成！");
   		System.out.println("运行时间："+(System.currentTimeMillis() - time));
	}
}
