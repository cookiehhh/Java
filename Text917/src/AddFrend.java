import java.util.Scanner;

public class AddFrend {
	public static void main (String args[])
	{
		Scanner input = new Scanner(System.in);
		Friend gao = new Friend();
		Friend qi = new Friend();
		
		System.out.println("������������");
		gao.name = input.next();
		System.out.println("������绰��");
		gao.phone = input.next();
		System.out.println("���������䣺");
		gao.mail = input.next();
		System.out.println("������ѧУ���ƣ�");
		gao.school = input.next();
		System.out.println(gao);
		/*
		System.out.println("������������");
		qi.name = input.next();
		System.out.println("������绰��");
		qi.phone = input.next();
		System.out.println("���������䣺");
		qi.mail = input.next();
		System.out.println("������ѧУ���ƣ�");
		qi.school = input.next();
		System.out.println(qi);
		*/
	}
}
