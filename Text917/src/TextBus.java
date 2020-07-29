
public class TextBus {
	public static void main(String[] args) {
		Bus bus1 = new Bus();
		Bus bus2 = new Bus("02","优秀",150);
		bus1.setNum("01");
		bus1.setType("中等");
		bus1.setPrice(80);
		System.out.println("编号："+bus1.getNum()+"\t品牌："+bus1.getType()+"\t价格："+bus1.getPrice());
		System.out.println("编号："+bus2.getNum()+"\t品牌："+bus2.getType()+"\t价格："+bus2.getPrice());

	}
}
