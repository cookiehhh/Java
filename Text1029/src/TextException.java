
public class TextException {
	public static int age;
	public static void aMethod(int newage) throws IllegalArgumentException
	{
		if (newage > 0) {
			age = newage;
		}
		else {
			throw new IllegalArgumentException("年龄必须大于零！");
		}
	}
	public static void main(String[] args) {
		try {
			aMethod(-10);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
