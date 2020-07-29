
public class Cat extends Animal{
	public Cat(String name) {
		super(name);
	}
	public void eat() {
		System.out.println("我是一只可爱的猫，我叫"+ super.name+ "，我正在吃鱼。");
	}
}
