import java.util.*;

public class StudentSetTest {

	public static void main(String[] args) {
		Set set1 = new HashSet();
		
		Student stu1 = new Student(1,"����","��",123456,"ɽ��ʡ");
		Student stu2 = new Student(2,"����","��",123456,"ɽ��ʡ");
		Student stu3 = new Student(3,"����","��",123456,"ɽ��ʡ");
		
		set1.add(stu1);
		set1.add(stu2);
		set1.add(stu3);
		
		System.out.println("ѧ������Ϊ��" + set1.size());


	}

}
