import java.util.Scanner;

public class Play {
	public static void main (String args[])
	{
		Scanner input = new Scanner(System.in);
		Mnage gaoq = new Mnage();

		System.out.println("请输入用户名：");
		String inputuser = input.next();
		System.out.println("请输入密码：");
		String inputpassword = input.next();		
		
		if(gaoq.Check(inputuser, inputpassword))
		{
			System.out.println("登录成功！");
			System.out.println(gaoq);
			System.out.println("请修改密码：");
			gaoq.password = input.next();
			System.out.println("修改成功！");
		}
		else
		{
			System.out.println("登录失败！");
		}
		
	}

}
