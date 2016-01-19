class Thread1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("child Thread = "+i);
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
public class ExThreadUsingRun {

	public static void main(String[] args) throws InterruptedException 
	{
		Thread1 t1=new Thread1();
		t1.start();
		while(t1.isAlive())
		{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Main thread will be alive till the child thread is live");
			Thread.sleep(500);
		}
		}
		System.out.println("Main thread's run is over");
	}

}
