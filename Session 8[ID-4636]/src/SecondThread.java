class SecondThread extends Thread 
{   
	public void run()     
	{             
		for (int i=1; i<=10; i++)        
		{           
			System.out.println( "Messag from Second Thread : " +i);                      
			try         
			{                
				Thread.sleep (1000);          
			}            
			catch (InterruptedException interruptedException)            
			{                
				System.out.println( "Second Thread is interrupted when it is sleeping" +interruptedException);           
			}        
		}   
	}
}
