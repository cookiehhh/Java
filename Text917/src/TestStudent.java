
public class TestStudent {
	public static void main (String args[])
	{
		Student s1 = new Student(17001, "小明", "男", 80);
		s1.setAge(20);
		Student s2 = new Student(17002, "小红", "女", 80);
		s2.setAge(19);
		
		s2.changeScore(90);
	
		System.out.println("学号：" + s1.getNo() + "\t姓名：" + s1.getName() + "\t年龄：" + s1.getAge() + "\t性别：" + s1.getSex() + "\t分数：" + s1.getScore());
		System.out.println("学号：" + s2.getNo() + "\t姓名：" + s2.getName() + "\t年龄：" + s2.getAge() + "\t性别：" + s2.getSex() + "\t分数：" + s2.getScore());
		System.out.println("平均分：" + (s1.getScore() + s2.getScore()) / Student.n);
	}
	
}
