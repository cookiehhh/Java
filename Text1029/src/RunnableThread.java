
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
			new Thread(r,"��Ʊ����1:").start();
			new Thread(r,"��Ʊ����2:").start();
			new Thread(r,"��Ʊ����3:").start();

		

	}

}
