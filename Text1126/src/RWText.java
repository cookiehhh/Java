import java.io.*;

public class RWText {

	public static void main(String[] args) throws Exception{
		FileReader fr = new FileReader("F://a1.txt");
		FileWriter fw = new FileWriter("F://b2.txt");
		int ch = 0;
		while((ch = fr.read())!= -1) {
			fw.write(ch);
		}
		fw.close();
		fr.close();
	}

}
