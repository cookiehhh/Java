
public class SimpleThread extends Thread {

	private static int threadCount = 0;
	private int countDown = 20;
	public SimpleThread() {
		super(""+ ++threadCount);
	}
	public void run() {
		while(true) {
			System.out.println(this);
			if (--countDown == 0) {
				return;
			}
		}
	}
	public String toString() {
		return "#" + getName() + ":" + countDown;
	}
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			new SimpleThread().start();
		}

	}

}
