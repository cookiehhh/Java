import java.io.*;

public class PrintWriterText {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("E://Java//test/t1.txt")));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("E://Java//test/t2.txt")));
		PrintWriter pw = new PrintWriter("E://Java//test/t3.txt");
		

	}

}
