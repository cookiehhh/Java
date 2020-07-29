import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FOText {
	public static void main(String[] args) throws Exception  {
		FileOutputStream out = new FileOutputStream("F://c3.txt",true);
		String s = "程序结构是三种:  顺序结构 、选择结构(分支结构)、循环结构。";
		byte[] b = s.getBytes();
		for (int i = 0; i < b.length; i++) {
			out.write(b[i]);
		}
		out.close();
	}
}
