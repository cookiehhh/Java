
public class TextBus {
	public static void main(String[] args) {
		Bus bus1 = new Bus();
		Bus bus2 = new Bus("02","����",150);
		bus1.setNum("01");
		bus1.setType("�е�");
		bus1.setPrice(80);
		System.out.println("��ţ�"+bus1.getNum()+"\tƷ�ƣ�"+bus1.getType()+"\t�۸�"+bus1.getPrice());
		System.out.println("��ţ�"+bus2.getNum()+"\tƷ�ƣ�"+bus2.getType()+"\t�۸�"+bus2.getPrice());

	}
}
