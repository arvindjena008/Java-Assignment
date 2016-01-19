import java.util.Scanner;

public class CheckPrimeNo
{
	void display(int num)
	{
		
		int a=2;
		 if(num==2)
		{
			System.out.println(num+" is a prime number");
		}
		else
		{
			while(num%a!=0 && num-1>a)
			{
				a++;
			}
			if(num==1 || num==0)
			{
				System.out.println(num+" is not a prime number");
			}
			else if (num % a == 0)
			{
				System.out.println(num+" is not a prime number"+"\n"+"Since Divisible it is by: "+a+"\n"+"hence, it is a composite no.");
			}		
			else
			{
				System.out.println(num+" is a prime number");
				
			}
		}

    }
	
	public static void main(String[] args) 
	{
		CheckPrimeNo cpobj = new CheckPrimeNo();
		int num;
		System.out.print("Enter a number to check prime or not:");
		Scanner in = new Scanner(System.in);
		num=in.nextInt();
		cpobj.display(num);
		in.close();
	}

}
