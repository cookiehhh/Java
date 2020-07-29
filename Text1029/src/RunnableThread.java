
class MyThread implements Runnable{
	
	public void run() {
		this.sale();
	}
	public synchronized void sale() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + i);
		}
	}
}

public class RunnableThread{
	
	public static void main(String[] args) {
		
			MyThread r = new MyThread();
			new Thread(r,"售票窗口1:").start();
			new Thread(r,"售票窗口2:").start();
			new Thread(r,"售票窗口3:").start();

		

	}

}
