import java.util.ArrayList;
import java.util.List;

public class StudentTest {

	public static void main(String[] args) {
		Student stu1 = new Student(1,"张三","男",123456,"山东省");
		Student stu2 = new Student(2,"李四","男",123456,"山东省");
		Student stu3 = new Student(3,"王五","男",123456,"山东省");
		
		List stuList = new ArrayList();
		stuList.add(stu1);
		stuList.add(stu2);
		stuList.add(stu3);
		
		System.out.println("学生数量为：" + stuList.size());
		for(int i=0; i < stuList.size(); i++){
			Student stu = (Student)stuList.get(i);
			System.out.println(stu.show());
            
		}
		
		if(stuList.contains(stu1)){
            System.out.println("学生中有这学生信息");
            stuList.remove(stu1);
            System.out.println("已删除这个人！");
        } else {
            System.out.println("学生中没有这个人学生信息");
        }
		
		if(stuList.contains(stu2)){
            System.out.println("学生中有这学生信息");
            stuList.set(1, new Student(2,"李四","女",123456,"山东省"));
            System.out.println("已修改这个人！");
        } else {
            System.out.println("学生中没有这个人学生信息");
        }

		for (Object object : stuList) {
			Student stu = (Student)object;
			System.out.println(stu.show());
		}
		
		for(int i=0; i < stuList.size(); i++){
			Student stu = (Student)stuList.get(i);
			System.out.println(stu.show());
            
		}
	}

}
