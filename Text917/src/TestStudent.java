
public class TestStudent {
	public static void main (String args[])
	{
		Student s1 = new Student(17001, "С��", "��", 80);
		s1.setAge(20);
		Student s2 = new Student(17002, "С��", "Ů", 80);
		s2.setAge(19);
		
		s2.changeScore(90);
	
		System.out.println("ѧ�ţ�" + s1.getNo() + "\t������" + s1.getName() + "\t���䣺" + s1.getAge() + "\t�Ա�" + s1.getSex() + "\t������" + s1.getScore());
		System.out.println("ѧ�ţ�" + s2.getNo() + "\t������" + s2.getName() + "\t���䣺" + s2.getAge() + "\t�Ա�" + s2.getSex() + "\t������" + s2.getScore());
		System.out.println("ƽ���֣�" + (s1.getScore() + s2.getScore()) / Student.n);
	}
	
}
