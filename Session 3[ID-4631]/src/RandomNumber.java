import java.util.Scanner;

public class RandomNumber 
{
	int display(int n)
	{
		return (int) (Math.random()*(n-1)+0);
	}
	public static void main(String[] args) 
	{
		RandomNumber robj = new RandomNumber();
		int num;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the value of n:");
		num = in.nextInt();
		System.out.println("In First pass random value from 0 to "+num+" is");
		System.out.println(robj.display(num));
		System.out.println("In Second pass random value from 0 to "+num+" is");
		System.out.println(robj.display(num));
		System.out.println("In Third pass random value from 0 to "+num+" is");
		System.out.println(robj.display(num));
		in.close();
	}

}
