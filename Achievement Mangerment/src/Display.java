import java.util.Scanner;

public class Display {
	public static void list(){
		clear();
		for (int i = 0; i < 80; i++){
			System.out.print('=');
		}
		System.out.println();
		System.out.println("			学  生  成  绩  管  理  系  统 					");
		System.out.println();
		System.out.println("			  1.输入学生信息			");
		System.out.println("			  2.输出学生信息			");
		System.out.println("			  3.按平均成绩排序		");
		System.out.println("			  4.查找学生信息			");
		System.out.println("			  5.修改学生信息			");
		System.out.println("			  6.删除学生信息			");
		System.out.println("			  0.退出					");

		for (int i = 0; i < 80; i++){
			System.out.print('=');
		}
		System.out.println();
		System.out.print("请输入命令：");
	}
	
	public static int input(){
		Scanner input = new Scanner(System.in);
		while(true){
			clear();
			System.out.println("输入“-1”结束录入信息！");
			System.out.print("请输入学生的学号：");
			int number = input.nextInt();
			if (number != -1){
				System.out.print("请输入学生姓名：");
				String name = input.next();
				System.out.print("请输入英语成绩：");
				int english = input.nextInt();
				System.out.print("请输入数学成绩：");
				int math = input.nextInt();
				System.out.print("请输入Java成绩：");
				int java = input.nextInt();
				Student newData = new Student(number, name, english, math, java);
				if (Mangement.addData(newData) == -1){
					System.out.println("数据溢出！");
					return -2;
				}
			} 
			else{
				return -1;
			}
		}
	}
	
	public static void output(){
		clear();
		if (Mangement.getLen() == 0){
			System.out.println("没有信息！");
		} 
		else{
			System.out.println("\t\t\t\t\t数学\t英语\tJava\t平均\t总计");
			for (int i = 0; i < Mangement.getLen(); i++){
				System.out.print("序号："+(i+1)+"\t学号："+Mangement.getData(i).getNumber()+"\t姓名："+Mangement.getData(i).getName());
				System.out.println("\t"+Mangement.getData(i).getMath()+"\t"+Mangement.getData(i).getEnglish()+
						"\t"+Mangement.getData(i).getJava()+"\t"+Mangement.getData(i).getAverage()+"\t"+Mangement.getData(i).getTotal());
			}
		}
	}
	
	public static void sort(){
		Mangement.sortData();
		System.out.println("按平均分排序完成！");
	}
	
	public static void search(){
		Scanner input = new Scanner(System.in);
		clear();
		System.out.print("请输入要查询的学生学号：");
		int number = input.nextInt();
		int i;
		if ((i = Mangement.search(number)) != -1){
			clear();
			System.out.println("该学生信息如下：");
			System.out.println("\t\t\t\t数学\t英语\tJava\t平均\t总计");
			System.out.print("学号："+Mangement.getData(i).getNumber()+"\t姓名："+Mangement.getData(i).getName());
			System.out.println("\t"+Mangement.getData(i).getMath()+"\t"+Mangement.getData(i).getEnglish()+
					"\t"+Mangement.getData(i).getJava()+"\t"+Mangement.getData(i).getAverage()+"\t"+Mangement.getData(i).getTotal());
		} 
		else{
			System.out.println("没有找到相应的信息！");
		}
	}
	
	public static void rewrite(){
		Scanner input = new Scanner(System.in);
		clear();
		System.out.print("请输入要修改的学生学号：");
		int number = input.nextInt();
		int i;
		if ((i = Mangement.search(number)) != -1){
			System.out.println("请选择要修改科目：");
			System.out.println("1.英语\t2.数学\t3.Java");
			int choice = input.nextInt();
			System.out.println("请输入修改后的成绩：");
			int score = input.nextInt();
			Mangement.rewrite(choice, i, score);
			System.out.println("修改成功！");
		} 
		else{
			System.out.println("没有找到相应的信息！");
		}
	}
	
	public static void delete(){
		Scanner input = new Scanner(System.in);
		clear();
		System.out.print("请输入要删除记录的学号：");
		int number = input.nextInt();
		if (number != -1){
			if(Mangement.delete(number) == -1){
				System.out.println("没有找到相应的信息！");
				return;
			} 
			else{
				System.out.println("删除信息成功！");
			}
		}
		else{
			return;
		}	
	}
	
	public static void clear(){
		System.out.println();
		System.out.println();
	}
	
}
