import java.util.Scanner;

public class xitong {
	public static void main(String[] args)
	{
		
	 while(true) {
		System.out.println("==================");
		System.out.println("��ӭ����ѧ������ϵͳ");
		System.out.println("1.����ѧ����Ϣ");
		System.out.println("2.ɾ��ѧ����Ϣ");
		System.out.println("3.�޸�ѧ����Ϣ");
		System.out.println("4.����ѧ����Ϣ");
		System.out.println("5.���ѧ����Ϣ");
		System.out.println("6.�˳�");
		System.out.println("==================");
		
		Scanner in =new Scanner(System.in);
		int choice =in.nextInt();
		
		switch(choice) {
	
				case 1:
					Manager.add();
					break;
				case 2:
					Manager.delete();
					break;
				case 3:
					Manager.xiugai();
					break;
				case 4:
					Manager.chazhao();
					break;
				case 5:
					Manager.shuchu();
					break;
				case 6:
					return;

}
}
}

}
