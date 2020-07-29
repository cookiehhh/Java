import java.util.Scanner;
public class Manage {
	private static Student[] stus = new Student[20];
	private static int dataIndex = 0;
	public void menu(){
		System.out.println("��ӭʹ��ѧ����Ϣ����ϵͳ");
		System.out.println("*****1������ѧ����Ϣ*****");
		System.out.println("*****2���޸�ѧ����Ϣ*****");
		System.out.println("*****3��ɾ��ѧ����Ϣ*****");
		System.out.println("*****4����ѯѧ����Ϣ*****");
		System.out.println("*****5����ӡѧ����Ϣ*****");
		System.out.println("*****6���˳�ѧ����Ϣ*****");
			}
	//����ѧ������
	public Student stuSet(){
		Scanner in = new Scanner(System.in);
		Student stu = new Student();
		String number;
		System.out.print("������ѧ�ţ�  ");
		number = in.next();
		stu.setNumber(number);
		String name;
		System.out.print("������������  ");
		name = in.next();
		stu.setName(name);
		while (true){
			String sex=stu.getSex();
			System.out.print("�������Ա�  ");
			sex = in.next();
			if("��".equals(sex)||"Ů".equals(sex)){
				stu.setSex(sex);
				break;
			}
			else{
				System.out.println("�����Ա��ʽ����ֻ�������л�Ů");
			}
		}
		int age=stu.getAge();
		System.out.print("���������䣺  ");
		age = in.nextInt();
		stu.setAge(age);
		return stu;
		}
	//����ѧ��
	public Student findByStuNum(){
		Scanner in = new Scanner(System.in);
		Student stu = new Student();
		String number=stu.getNumber();
		number = in.next();
		stu.setNumber(number);
		return stu;
	}
	//��������
	public Student findByName(){
		Scanner in = new Scanner(System.in);
		Student stu = new Student();
		String stuName=stu.getName();
		stuName = in.next();
		stu.setName(stuName);
		return stu;
	}
	//¼������
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
	//����ѧ������
	public void changeStu(Student stu){
		for(int i = 0; i < dataIndex; i++){
			if(stus[i].getNumber().equals(stu.getNumber())){
				stus[i] = stu;
			}
		}
	}
	//ɾ��ѧ��
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
	//����ѧ��
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
	//��ӡѧ����Ϣ
	public void printStuMenus(){
		for(int i =0;i<dataIndex;i++){
			System.out.println(stus[i]);
		}
	}
}
