import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class BIText {

	public static void main(String[] args) throws Exception {
		long time = System.currentTimeMillis();
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("F://T1.txt"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("F://T2.txt",true));
		int c ;
		while((c = bis.read())!=-1){
			bos.write(c);
			bos.flush();
		}
		bis.close();
		bos.close();
		System.out.println("复制完成！");
		System.out.println("运行时间："+(System.currentTimeMillis() - time));

	}

}
