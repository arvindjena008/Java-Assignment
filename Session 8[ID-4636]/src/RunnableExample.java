public class RunnableExample {

	public static void main(String[] args) {
		Thread thread1 = new Thread(new RunnableThread(), "thread1");
		Thread thread2 = new Thread(new RunnableThread(), "thread2");
		Thread thread3 = new Thread(new RunnableThread(), "thread3");
		new RunnableThread("thread");
		thread1.start();
		thread2.start();
		thread3.start();
		try
		{
			Thread.currentThread();
			Thread.sleep(1000);
		}
		catch (InterruptedException e) {
		}
		System.out.println(Thread.currentThread());
	}
}
