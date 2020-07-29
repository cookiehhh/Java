import java.util.Scanner;

public class Display {
	public static void list(){
		clear();
		for (int i = 0; i < 80; i++){
			System.out.print('=');
		}
		System.out.println();
		System.out.println("			学  生   管  理  系  统 					");
		System.out.println();
		System.out.println("			  1.输入学生信息			");
		System.out.println("			  2.输出学生信息			");
		System.out.println("			  3.查找学生信息			");
		System.out.println("			  4.修改学生信息			");
		System.out.println("			  5.删除学生信息			");
		System.out.println("			  0.退出					");

		for (int i = 0; i < 80; i++){
			System.out.print('=');
		}
		System.out.println();
		System.out.print("请输入命令：");
	}
	
	public static void input(){
		Scanner input = new Scanner(System.in);
		String no = "no";
		while(true){
			clear();
			System.out.println("输入“no”结束录入信息！");
			System.out.print("请输入学生的学号：");
			String id = input.next();
			if (!id.equals(no)){
				System.out.print("请输入学生姓名：");
				String name = input.next();
				System.out.print("请输入学生性别：");
				String sex = input.next();
				System.out.print("请输入学生年龄：");
				String age = input.next();
				System.out.print("请输入学生家庭住址：");
				String address = input.next();
				Student newData = new Student(id, name, sex, age, address);
				Mangement.insert(newData);	
			} 
			else{
				return;
			}
		}
	}
	
	public static void output(){
		clear();
		Mangement.output();		
	}
	
	public static void search(){
		Scanner input = new Scanner(System.in);
		clear();
		System.out.println("请选择要查询的方法：");
		System.out.println("1.学号\t2.姓名\t3.性别\t4.家庭住址");
		int choice = input.nextInt();
		System.out.print("请输入要查询的学生信息：");
		String massage = input.next();		
		Mangement.search(choice, massage);
	}
	
	public static void rewrite(){
		Scanner input = new Scanner(System.in);
		clear();
		System.out.print("请输入要修改的学生学号：");
		String id = input.next();
		System.out.println("请选择要修改的信息：");
		System.out.println("1.学号\t2.姓名\t3.性别\t4.年龄\t5.家庭住址");
		int choice = input.nextInt();
		System.out.println("请输入修改后的信息：");
		String newMessage = input.next();			
		Mangement.update(choice, id, newMessage);
		System.out.println("修改成功！");	
	}
	
	public static void delete(){
		Scanner input = new Scanner(System.in);
		clear();
		System.out.print("请输入要删除记录的学号：");
		String id = input.next();
		Mangement.delete(id);
		System.out.println("删除成功！");	
	}
	
	public static void clear(){
		System.out.println();
		System.out.println();
	}
	
}
