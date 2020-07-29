import java.util.Scanner;

public class Text1 {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int n = 3;
		int array[] = new int[n];
		for(int i = 0 ; i < array.length ; i++)
		{
			System.out.println("请输入第" +(i+1)+ "个数：");
			array[i] = input.nextInt();
		}
		int sum = array[0];
		
		for(int i = 0 ; i < array.length ; i++)
		{
			
			sum += array[i];
		}
		System.out.println("");
		System.out.println("");
		System.out.println("平均值为：" + (sum/array.length));
		
		System.out.println("");
		System.out.println("");
		System.out.println("以下是for循环遍历");
		for(int i = 0 ; i < array.length ; i++)
		{
			
			System.out.print(array[i]);
			System.out.print(" ");
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("以下是while循环遍历");
		int w = 0;
		while(w < array.length)
		{
			System.out.print(array[w]);
			System.out.print(" ");
			w++;
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("以下是do-while循环遍历");
		int d = 0;
		do
		{
			System.out.print(array[d]);
			System.out.print(" ");
			d++;
			
		}while(d < array.length);
		
		System.out.println("");
		System.out.println("");
		System.out.println("以下是for-each循环遍历");
		for(int i : array)
		{
			System.out.print(i);
			System.out.print(" ");
		}
		
		
	}
}
