import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FOText {
	public static void main(String[] args) throws Exception  {
		FileOutputStream out = new FileOutputStream("F://c3.txt",true);
		String s = "����ṹ������:  ˳��ṹ ��ѡ��ṹ(��֧�ṹ)��ѭ���ṹ��";
		byte[] b = s.getBytes();
		for (int i = 0; i < b.length; i++) {
			out.write(b[i]);
		}
		out.close();
	}
}
