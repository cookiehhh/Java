import java.util.Random;

public class DateTest {

	public static void main(String[] args) {
		Integer bo ;
		bo = (int) 12345678902.3;

		String id = randomHexString(12);
		System.out.println(id);
		System.out.println(bo);
	}
	public static String randomHexString(int len)  {
		try {
			StringBuffer result = new StringBuffer();
			for(int i=0;i<len;i++) {
				result.append(Integer.toHexString(new Random().nextInt(10)));
			}
			return result.toString().toUpperCase();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return null;
		
	}
}
