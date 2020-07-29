import java.util.Scanner;

public class Display {
	public static void list(){
		clear();
		for (int i = 0; i < 80; i++){
			System.out.print('=');
		}
		System.out.println();
		System.out.println("			ѧ  ��  ��  ��  ��  ��  ϵ  ͳ 					");
		System.out.println();
		System.out.println("			  1.����ѧ����Ϣ			");
		System.out.println("			  2.���ѧ����Ϣ			");
		System.out.println("			  3.��ƽ���ɼ�����		");
		System.out.println("			  4.����ѧ����Ϣ			");
		System.out.println("			  5.�޸�ѧ����Ϣ			");
		System.out.println("			  6.ɾ��ѧ����Ϣ			");
		System.out.println("			  0.�˳�					");

		for (int i = 0; i < 80; i++){
			System.out.print('=');
		}
		System.out.println();
		System.out.print("���������");
	}
	
	public static int input(){
		Scanner input = new Scanner(System.in);
		while(true){
			clear();
			System.out.println("���롰-1������¼����Ϣ��");
			System.out.print("������ѧ����ѧ�ţ�");
			int number = input.nextInt();
			if (number != -1){
				System.out.print("������ѧ��������");
				String name = input.next();
				System.out.print("������Ӣ��ɼ���");
				int english = input.nextInt();
				System.out.print("��������ѧ�ɼ���");
				int math = input.nextInt();
				System.out.print("������Java�ɼ���");
				int java = input.nextInt();
				Student newData = new Student(number, name, english, math, java);
				if (Mangement.addData(newData) == -1){
					System.out.println("���������");
					return -2;
				}
			} 
			else{
				return -1;
			}
		}
	}
	
	public static void output(){
		clear();
		if (Mangement.getLen() == 0){
			System.out.println("û����Ϣ��");
		} 
		else{
			System.out.println("\t\t\t\t\t��ѧ\tӢ��\tJava\tƽ��\t�ܼ�");
			for (int i = 0; i < Mangement.getLen(); i++){
				System.out.print("��ţ�"+(i+1)+"\tѧ�ţ�"+Mangement.getData(i).getNumber()+"\t������"+Mangement.getData(i).getName());
				System.out.println("\t"+Mangement.getData(i).getMath()+"\t"+Mangement.getData(i).getEnglish()+
						"\t"+Mangement.getData(i).getJava()+"\t"+Mangement.getData(i).getAverage()+"\t"+Mangement.getData(i).getTotal());
			}
		}
	}
	
	public static void sort(){
		Mangement.sortData();
		System.out.println("��ƽ����������ɣ�");
	}
	
	public static void search(){
		Scanner input = new Scanner(System.in);
		clear();
		System.out.print("������Ҫ��ѯ��ѧ��ѧ�ţ�");
		int number = input.nextInt();
		int i;
		if ((i = Mangement.search(number)) != -1){
			clear();
			System.out.println("��ѧ����Ϣ���£�");
			System.out.println("\t\t\t\t��ѧ\tӢ��\tJava\tƽ��\t�ܼ�");
			System.out.print("ѧ�ţ�"+Mangement.getData(i).getNumber()+"\t������"+Mangement.getData(i).getName());
			System.out.println("\t"+Mangement.getData(i).getMath()+"\t"+Mangement.getData(i).getEnglish()+
					"\t"+Mangement.getData(i).getJava()+"\t"+Mangement.getData(i).getAverage()+"\t"+Mangement.getData(i).getTotal());
		} 
		else{
			System.out.println("û���ҵ���Ӧ����Ϣ��");
		}
	}
	
	public static void rewrite(){
		Scanner input = new Scanner(System.in);
		clear();
		System.out.print("������Ҫ�޸ĵ�ѧ��ѧ�ţ�");
		int number = input.nextInt();
		int i;
		if ((i = Mangement.search(number)) != -1){
			System.out.println("��ѡ��Ҫ�޸Ŀ�Ŀ��");
			System.out.println("1.Ӣ��\t2.��ѧ\t3.Java");
			int choice = input.nextInt();
			System.out.println("�������޸ĺ�ĳɼ���");
			int score = input.nextInt();
			Mangement.rewrite(choice, i, score);
			System.out.println("�޸ĳɹ���");
		} 
		else{
			System.out.println("û���ҵ���Ӧ����Ϣ��");
		}
	}
	
	public static void delete(){
		Scanner input = new Scanner(System.in);
		clear();
		System.out.print("������Ҫɾ����¼��ѧ�ţ�");
		int number = input.nextInt();
		if (number != -1){
			if(Mangement.delete(number) == -1){
				System.out.println("û���ҵ���Ӧ����Ϣ��");
				return;
			} 
			else{
				System.out.println("ɾ����Ϣ�ɹ���");
			}
		}
		else{
			return;
		}	
	}
	
	public static void clear(){
		System.out.println();
		System.out.println();
	}
	
}
