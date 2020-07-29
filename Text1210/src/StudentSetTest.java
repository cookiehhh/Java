import java.util.*;

public class StudentSetTest {

	public static void main(String[] args) {
		Set set1 = new HashSet();
		
		Student stu1 = new Student(1,"张三","男",123456,"山东省");
		Student stu2 = new Student(2,"李四","男",123456,"山东省");
		Student stu3 = new Student(3,"王五","男",123456,"山东省");
		
		set1.add(stu1);
		set1.add(stu2);
		set1.add(stu3);
		
		System.out.println("学生数量为：" + set1.size());


	}

}
