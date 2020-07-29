import java.util.Scanner;

public class Manager {
	static Scanner in = new Scanner(System.in );
	
	static Student[] stu = new Student[100];
	public static int number=0;
	public static int i;
	public static void add() {
		for( i = 0;i < 2;i ++)
		{
			System.out.println("请输入学生的学号,姓名,年龄,分数");
			String NO = in.next();
			String name = in.next();
			
			int age = in.nextInt();
			int score = in.nextInt();
			stu[i] = new Student(NO, name,  age, score);
			number++;
			System.out.println("添加成功");
			
			
		}
	
	}
public static void delete() {
	System.out.println("请输入要删除学生的学号");
	String NO = in.next();
	for(int i = 0;i < number;i ++)
	{
		if(NO.equals(stu[i].getNO())) {
			for(int j = i;j < number;j ++)
			{
				stu[j] = stu[j+1];
			}
			number--;
			return;
		}
		
	}
	System.out.println("删除成功！");
	
	
}
public static void xiugai() {
	System.out.println("请输入要修改学生的学号");
	String NO = in.next();
	for(int i = 0;i < number;i ++)
	{
	if(NO.equals(stu[i].getNO()))
		{
		System.out.println("请输入要修改学生的学号,姓名,年龄,分数");
		
			
		String NO1 = in.next();
		String name = in.next();
		int age = in.nextInt();
		int score = in.nextInt();
		stu[i] = new Student(NO1, name,  age, score);
		
		return;
		}
		
	}
	
}
public static void chazhao() {
	System.out.println("请输入要查询的学生学号");
	String NO = in.next();
	for(int i = 0;i < number;i ++)
	{
	if(NO.equals(stu[i].getNO()))
		{
			System.out.println("学号      姓名            年龄      分数");
			System.out.println(stu[i].getNO()+"\t"+stu[i].getname()+"\t"+stu[i].getage()+"\t"+stu[i].getscore());
			return;
		}	
	}

	
}
	


public static void shuchu() {
	
	for(int i = 0;i < number;i ++)
	{
		System.out.println("学号      姓名           年龄      分数");
		System.out.println(stu[i].getNO()+"\t"+stu[i].getname()+"\t"+stu[i].getage()+"\t"+stu[i].getscore());
	}
	

}
	
	
	

}
