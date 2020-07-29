import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		 
		Scanner in = new Scanner(System.in);
		System.out.println("欢迎来到学生信息管理系统！");
		Manage tool = new Manage();		
		title:	while(true){
			tool.menu();
		System.out.println("请选择操作");
			switch(in.nextInt()){
			case 1:
				Student stu = tool.stuSet();
				tool.insertStu(stu);
				System.out.println("数据保存成功");
				break ;
			case 2://修改学生信息
				System.out.println("请输入需要修改的学生信息：");
				Student stu1 = tool.stuSet();
				tool.changeStu(stu1);
				break;
					
			case 3://删除学生信息
				System.out.println("请输入需要删除的学生学号：");
				Student stu2 = tool.findByStuNum();
				tool.deleteStu(stu2);
				System.out.println("删除成功");
				break;
					
			case 4://查询学生信息
				System.out.println("请选择查找方式：");
				System.out.println("1.根据姓名查找学生信息");
				System.out.println("2.根据学号查找学生信息");
				int b = in.nextInt();
				if(b==1){					
					System.out.println("请输入学生姓名：");
					Student stu3 = tool.findByName();
					tool.findStu(stu3);
					break;
				}
				else if(b==2){
					System.out.println("请输入学生学号：");
					Student stu4 = tool.findByStuNum();
					tool.findStu(stu4);
					break;
				}
					
			case 5://打印学生信息
					
				tool.printStuMenus();;
				break;
			case 6://退出学生信息
				System.out.println("欢迎再次使用本系统，再见！！！");
				break title;
			default:
				break;
			}
		}
 
	}
}
