import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class OutputByteText {

	public static void main(String[] args) throws Exception {
		long time = System.currentTimeMillis();
		FileInputStream in = new FileInputStream("F://X1.exe");
		FileOutputStream out = new FileOutputStream("F://X2.exe",true);
		
		byte[] buffer = new byte[2*1024];
		int ch = 0;
		while((ch = in.read(buffer, 0, buffer.length)) != -1) {
			out.write(buffer, 0, buffer.length);
			out.flush();
		}
		in.close();
		out.close();
		System.out.println("复制完成！");
		System.out.println("运行时间："+(System.currentTimeMillis() - time));
	}

}
