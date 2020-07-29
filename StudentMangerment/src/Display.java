import java.util.Scanner;

public class Display {
	public static void list(){
		clear();
		for (int i = 0; i < 80; i++){
			System.out.print('=');
		}
		System.out.println();
		System.out.println("			ѧ  ��   ��  ��  ϵ  ͳ 					");
		System.out.println();
		System.out.println("			  1.����ѧ����Ϣ			");
		System.out.println("			  2.���ѧ����Ϣ			");
		System.out.println("			  3.����ѧ����Ϣ			");
		System.out.println("			  4.�޸�ѧ����Ϣ			");
		System.out.println("			  5.ɾ��ѧ����Ϣ			");
		System.out.println("			  0.�˳�					");

		for (int i = 0; i < 80; i++){
			System.out.print('=');
		}
		System.out.println();
		System.out.print("���������");
	}
	
	public static void input(){
		Scanner input = new Scanner(System.in);
		String no = "no";
		while(true){
			clear();
			System.out.println("���롰no������¼����Ϣ��");
			System.out.print("������ѧ����ѧ�ţ�");
			String id = input.next();
			if (!id.equals(no)){
				System.out.print("������ѧ��������");
				String name = input.next();
				System.out.print("������ѧ���Ա�");
				String sex = input.next();
				System.out.print("������ѧ�����䣺");
				String age = input.next();
				System.out.print("������ѧ����ͥסַ��");
				String address = input.next();
				Student newData = new Student(id, name, sex, age, address);
				Mangement.insert(newData);	
			} 
			else{
				return;
			}
		}
	}
	
	public static void output(){
		clear();
		Mangement.output();		
	}
	
	public static void search(){
		Scanner input = new Scanner(System.in);
		clear();
		System.out.println("��ѡ��Ҫ��ѯ�ķ�����");
		System.out.println("1.ѧ��\t2.����\t3.�Ա�\t4.��ͥסַ");
		int choice = input.nextInt();
		System.out.print("������Ҫ��ѯ��ѧ����Ϣ��");
		String massage = input.next();		
		Mangement.search(choice, massage);
	}
	
	public static void rewrite(){
		Scanner input = new Scanner(System.in);
		clear();
		System.out.print("������Ҫ�޸ĵ�ѧ��ѧ�ţ�");
		String id = input.next();
		System.out.println("��ѡ��Ҫ�޸ĵ���Ϣ��");
		System.out.println("1.ѧ��\t2.����\t3.�Ա�\t4.����\t5.��ͥסַ");
		int choice = input.nextInt();
		System.out.println("�������޸ĺ����Ϣ��");
		String newMessage = input.next();			
		Mangement.update(choice, id, newMessage);
		System.out.println("�޸ĳɹ���");	
	}
	
	public static void delete(){
		Scanner input = new Scanner(System.in);
		clear();
		System.out.print("������Ҫɾ����¼��ѧ�ţ�");
		String id = input.next();
		Mangement.delete(id);
		System.out.println("ɾ���ɹ���");	
	}
	
	public static void clear(){
		System.out.println();
		System.out.println();
	}
	
}
