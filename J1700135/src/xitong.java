import java.util.Scanner;

public class xitong {
	public static void main(String[] args)
	{
		
	 while(true) {
		System.out.println("==================");
		System.out.println("欢迎来到学生管理系统");
		System.out.println("1.增加学生信息");
		System.out.println("2.删除学生信息");
		System.out.println("3.修改学生信息");
		System.out.println("4.查找学生信息");
		System.out.println("5.输出学生信息");
		System.out.println("6.退出");
		System.out.println("==================");
		
		Scanner in =new Scanner(System.in);
		int choice =in.nextInt();
		
		switch(choice) {
	
				case 1:
					Manager.add();
					break;
				case 2:
					Manager.delete();
					break;
				case 3:
					Manager.xiugai();
					break;
				case 4:
					Manager.chazhao();
					break;
				case 5:
					Manager.shuchu();
					break;
				case 6:
					return;

}
}
}

}
