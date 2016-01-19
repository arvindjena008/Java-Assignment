public class ThreadDemo
{   
	public static void main(String args[])    
	{         
		FirstThread   firstThread = new FirstThread();              
		SecondThread   secondThread = new SecondThread(); 
		ThirdThread thirdthread = new ThirdThread();
		firstThread.start();                
		secondThread.start();
		thirdthread.start();
	} 
}
