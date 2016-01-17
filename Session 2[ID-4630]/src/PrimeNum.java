import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		 		
		      Scanner in = new Scanner(System.in);
		      int i,num,counter;
		      String  primeNumbers = "";
		      System.out.println("Enter the value of n:");
		      int n = in.nextInt();
		      for (i = 1; i <= n; i++)  	   
		      { 		 		  
		         counter=0; 		  
		         for(num =i; num>=1; num--)
		         {
		        	 if(i%num==0)
		        	 {
		        		 counter = counter + 1;
		        	 }
		         }
		         if (counter ==2)
		         {
			        primeNumbers = primeNumbers + i + " ";
		         }	
		      }	
		      System.out.println("Prime numbers from 1 to "+n+" are :");
		      System.out.println(primeNumbers);
		   
	}

}
