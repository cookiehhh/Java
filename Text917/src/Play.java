import java.util.Scanner;

public class Play {
	public static void main (String args[])
	{
		Scanner input = new Scanner(System.in);
		Mnage gaoq = new Mnage();

		System.out.println("�������û�����");
		String inputuser = input.next();
		System.out.println("���������룺");
		String inputpassword = input.next();		
		
		if(gaoq.Check(inputuser, inputpassword))
		{
			System.out.println("��¼�ɹ���");
			System.out.println(gaoq);
			System.out.println("���޸����룺");
			gaoq.password = input.next();
			System.out.println("�޸ĳɹ���");
		}
		else
		{
			System.out.println("��¼ʧ�ܣ�");
		}
		
	}

}
