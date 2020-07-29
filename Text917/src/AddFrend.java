import java.util.Scanner;

public class AddFrend {
	public static void main (String args[])
	{
		Scanner input = new Scanner(System.in);
		Friend gao = new Friend();
		Friend qi = new Friend();
		
		System.out.println("请输入姓名：");
		gao.name = input.next();
		System.out.println("请输入电话：");
		gao.phone = input.next();
		System.out.println("请输入邮箱：");
		gao.mail = input.next();
		System.out.println("请输入学校名称：");
		gao.school = input.next();
		System.out.println(gao);
		/*
		System.out.println("请输入姓名：");
		qi.name = input.next();
		System.out.println("请输入电话：");
		qi.phone = input.next();
		System.out.println("请输入邮箱：");
		qi.mail = input.next();
		System.out.println("请输入学校名称：");
		qi.school = input.next();
		System.out.println(qi);
		*/
	}
}
