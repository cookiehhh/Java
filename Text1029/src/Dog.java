
public class Dog extends Animal{
	public Dog(String name) {
		super(name);
	}
	public void eat() {
		System.out.println("����һֻ�ɰ���С�����ҽ�"+ super.name+ "�������ڳԹ�ͷ��");
	}
}
