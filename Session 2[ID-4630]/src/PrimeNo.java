import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter the value of n to check whether it is a prime or composite no.");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		int a=2;
		 if(n==2)
		{
			System.out.println("It is a prime no");
		}
		else
		{
			while(n%a!=0 && n-1>a)
			{
				a++;
			}
			if(n==1 || n==0)
			{
				System.out.println("Not a prime no");
			}
			else if (n % a == 0)
			{
				System.out.println("Not a prime no.Since Divisible it is by: "+a+" hence, it is a composite no.");
			}		
			else
			{
				System.out.println("It is a prime no.");
				
			}
		}
	}

}
