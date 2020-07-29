
public class TextBox {
	public static void main (String args[])
	{
		Box myBox1 = new Box(2,2,2);
		Box myBox2 = new Box();
		
		System.out.println("myBox1的体积是：" + myBox1.volume());
		System.out.println("myBox2的体积是：" + myBox2.volume());
	}
}
