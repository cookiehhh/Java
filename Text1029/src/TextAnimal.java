
public class TextAnimal {

	public static void main(String[] args) {
		int n = 2;
		Animal[] animal = new Animal[n];
		Student xiaoxin = new Student();
		animal[0] = new Cat("С��");
		animal[1] = new Dog("����");
		for (int i = 0; i < animal.length; i++) {
			xiaoxin.feed(animal[i]);
		}

	}

}
