
class RunnableThread implements Runnable {

	Thread runner;
	public RunnableThread() {
	}
	public RunnableThread(String threadName) {
		runner = new Thread(this, threadName); 
		System.out.println(runner.getName());
		runner.start(); 
	}
	public void run()
	{
		System.out.println(Thread.currentThread());
	}
}
