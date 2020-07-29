
public class Dog extends Animal{
	public Dog(String name) {
		super(name);
	}
	public void eat() {
		System.out.println("我是一只可爱的小狗，我叫"+ super.name+ "，我正在吃骨头。");
	}
}
