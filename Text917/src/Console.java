import java.io.*;

public class Console {
	public static int readInt(){
		int result = 0;
		try{
			String temp =new BufferedReader(new InputStreamReader(System.in)).readLine();
			result = Integer.parseInt(temp);
		} 
		catch (Exception e){
			System.out.println("Error: "+e);
		}
		return result;
	}
	public static String readSting(){
		String result = null;
		try{
			result = new BufferedReader(new InputStreamReader(System.in)).readLine();
		} 
		catch (Exception e){
			System.out.println("Error: "+e);
		}
		return result;
	}
}
