import java.util.Scanner;

public class Manager {
	static Scanner in = new Scanner(System.in );
	
	static Student[] stu = new Student[100];
	public static int number=0;
	public static int i;
	public static void add() {
		for( i = 0;i < 2;i ++)
		{
			System.out.println("������ѧ����ѧ��,����,����,����");
			String NO = in.next();
			String name = in.next();
			
			int age = in.nextInt();
			int score = in.nextInt();
			stu[i] = new Student(NO, name,  age, score);
			number++;
			System.out.println("��ӳɹ�");
			
			
		}
	
	}
public static void delete() {
	System.out.println("������Ҫɾ��ѧ����ѧ��");
	String NO = in.next();
	for(int i = 0;i < number;i ++)
	{
		if(NO.equals(stu[i].getNO())) {
			for(int j = i;j < number;j ++)
			{
				stu[j] = stu[j+1];
			}
			number--;
			return;
		}
		
	}
	System.out.println("ɾ���ɹ���");
	
	
}
public static void xiugai() {
	System.out.println("������Ҫ�޸�ѧ����ѧ��");
	String NO = in.next();
	for(int i = 0;i < number;i ++)
	{
	if(NO.equals(stu[i].getNO()))
		{
		System.out.println("������Ҫ�޸�ѧ����ѧ��,����,����,����");
		
			
		String NO1 = in.next();
		String name = in.next();
		int age = in.nextInt();
		int score = in.nextInt();
		stu[i] = new Student(NO1, name,  age, score);
		
		return;
		}
		
	}
	
}
public static void chazhao() {
	System.out.println("������Ҫ��ѯ��ѧ��ѧ��");
	String NO = in.next();
	for(int i = 0;i < number;i ++)
	{
	if(NO.equals(stu[i].getNO()))
		{
			System.out.println("ѧ��      ����            ����      ����");
			System.out.println(stu[i].getNO()+"\t"+stu[i].getname()+"\t"+stu[i].getage()+"\t"+stu[i].getscore());
			return;
		}	
	}

	
}
	


public static void shuchu() {
	
	for(int i = 0;i < number;i ++)
	{
		System.out.println("ѧ��      ����           ����      ����");
		System.out.println(stu[i].getNO()+"\t"+stu[i].getname()+"\t"+stu[i].getage()+"\t"+stu[i].getscore());
	}
	

}
	
	
	

}
