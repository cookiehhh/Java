import java.util.Scanner;
public class Manage {
	private static Student[] stus = new Student[20];
	private static int dataIndex = 0;
	public void menu(){
		System.out.println("欢迎使用学生信息管理系统");
		System.out.println("*****1：输入学生信息*****");
		System.out.println("*****2：修改学生信息*****");
		System.out.println("*****3：删除学生信息*****");
		System.out.println("*****4：查询学生信息*****");
		System.out.println("*****5：打印学生信息*****");
		System.out.println("*****6：退出学生信息*****");
			}
	//输入学生数据
	public Student stuSet(){
		Scanner in = new Scanner(System.in);
		Student stu = new Student();
		String number;
		System.out.print("请输入学号：  ");
		number = in.next();
		stu.setNumber(number);
		String name;
		System.out.print("请输入姓名：  ");
		name = in.next();
		stu.setName(name);
		while (true){
			String sex=stu.getSex();
			System.out.print("请输入性别：  ");
			sex = in.next();
			if("男".equals(sex)||"女".equals(sex)){
				stu.setSex(sex);
				break;
			}
			else{
				System.out.println("输入性别格式错误，只能输入男或女");
			}
		}
		int age=stu.getAge();
		System.out.print("请输入年龄：  ");
		age = in.nextInt();
		stu.setAge(age);
		return stu;
		}
	//输入学号
	public Student findByStuNum(){
		Scanner in = new Scanner(System.in);
		Student stu = new Student();
		String number=stu.getNumber();
		number = in.next();
		stu.setNumber(number);
		return stu;
	}
	//输入姓名
	public Student findByName(){
		Scanner in = new Scanner(System.in);
		Student stu = new Student();
		String stuName=stu.getName();
		stuName = in.next();
		stu.setName(stuName);
		return stu;
	}
	//录入数据
	public void insertStu(Student stu){
		if(dataIndex >= stus.length){
			Student[] tempStus = new Student[stus.length + stus.length >> 1];
			for(int i = 0; i < stus.length; i++){
				tempStus[i] = stus[i];
			}
			stus = tempStus;
		}
		stus[dataIndex] = stu;
		dataIndex++;
	}
	//更改学生数据
	public void changeStu(Student stu){
		for(int i = 0; i < dataIndex; i++){
			if(stus[i].getNumber().equals(stu.getNumber())){
				stus[i] = stu;
			}
		}
	}
	//删除学生
	public void deleteStu(Student stu){
		for(int i = 0; i < dataIndex; i++){
			if(stus[i].getNumber().equals(stu.getNumber())){
				for(int s = 0;s<dataIndex;s++){
					if(s<dataIndex-1){
						stus[i]=stus[i+1];
					}
				}
				dataIndex--;
			}
		}
	}
	//查找学生
	public void findStu(Student stu){
		for(int i = 0; i < dataIndex; i++){
			if(stus[i].getNumber().equals(stu.getNumber())){
				System.out.println(stus[i]);
			}
			else if(stus[i].getName().equals(stu.getName())){
				System.out.println(stus[i]);
			}
		}
	}
	//打印学生信息
	public void printStuMenus(){
		for(int i =0;i<dataIndex;i++){
			System.out.println(stus[i]);
		}
	}
}
