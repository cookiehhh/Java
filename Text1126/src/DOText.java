import java.io.*;


public class DOText {

	public static void main(String[] args) throws Exception {
		long time = System.currentTimeMillis();
		DataInputStream dis = new DataInputStream(new FileInputStream("F://X1.exe"));
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("F://X2.exe",true));

		int ch = 0;
		while((ch = dis.readInt()) != -1) {
			dos.writeInt(ch);
			dos.flush();
		}
		dis.close();
		dos.close();
		System.out.println("������ɣ�");
   		System.out.println("����ʱ�䣺"+(System.currentTimeMillis() - time));
	}

}
