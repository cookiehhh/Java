import java.util.ArrayList;
import java.util.List;

public class StudentTest {

	public static void main(String[] args) {
		Student stu1 = new Student(1,"����","��",123456,"ɽ��ʡ");
		Student stu2 = new Student(2,"����","��",123456,"ɽ��ʡ");
		Student stu3 = new Student(3,"����","��",123456,"ɽ��ʡ");
		
		List stuList = new ArrayList();
		stuList.add(stu1);
		stuList.add(stu2);
		stuList.add(stu3);
		
		System.out.println("ѧ������Ϊ��" + stuList.size());
		for(int i=0; i < stuList.size(); i++){
			Student stu = (Student)stuList.get(i);
			System.out.println(stu.show());
            
		}
		
		if(stuList.contains(stu1)){
            System.out.println("ѧ��������ѧ����Ϣ");
            stuList.remove(stu1);
            System.out.println("��ɾ������ˣ�");
        } else {
            System.out.println("ѧ����û�������ѧ����Ϣ");
        }
		
		if(stuList.contains(stu2)){
            System.out.println("ѧ��������ѧ����Ϣ");
            stuList.set(1, new Student(2,"����","Ů",123456,"ɽ��ʡ"));
            System.out.println("���޸�����ˣ�");
        } else {
            System.out.println("ѧ����û�������ѧ����Ϣ");
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
