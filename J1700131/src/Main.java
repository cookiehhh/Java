import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		 
		Scanner in = new Scanner(System.in);
		System.out.println("��ӭ����ѧ����Ϣ����ϵͳ��");
		Manage tool = new Manage();		
		title:	while(true){
			tool.menu();
		System.out.println("��ѡ�����");
			switch(in.nextInt()){
			case 1:
				Student stu = tool.stuSet();
				tool.insertStu(stu);
				System.out.println("���ݱ���ɹ�");
				break ;
			case 2://�޸�ѧ����Ϣ
				System.out.println("��������Ҫ�޸ĵ�ѧ����Ϣ��");
				Student stu1 = tool.stuSet();
				tool.changeStu(stu1);
				break;
					
			case 3://ɾ��ѧ����Ϣ
				System.out.println("��������Ҫɾ����ѧ��ѧ�ţ�");
				Student stu2 = tool.findByStuNum();
				tool.deleteStu(stu2);
				System.out.println("ɾ���ɹ�");
				break;
					
			case 4://��ѯѧ����Ϣ
				System.out.println("��ѡ����ҷ�ʽ��");
				System.out.println("1.������������ѧ����Ϣ");
				System.out.println("2.����ѧ�Ų���ѧ����Ϣ");
				int b = in.nextInt();
				if(b==1){					
					System.out.println("������ѧ��������");
					Student stu3 = tool.findByName();
					tool.findStu(stu3);
					break;
				}
				else if(b==2){
					System.out.println("������ѧ��ѧ�ţ�");
					Student stu4 = tool.findByStuNum();
					tool.findStu(stu4);
					break;
				}
					
			case 5://��ӡѧ����Ϣ
					
				tool.printStuMenus();;
				break;
			case 6://�˳�ѧ����Ϣ
				System.out.println("��ӭ�ٴ�ʹ�ñ�ϵͳ���ټ�������");
				break title;
			default:
				break;
			}
		}
 
	}
}
