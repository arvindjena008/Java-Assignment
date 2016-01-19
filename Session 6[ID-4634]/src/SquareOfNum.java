import java.util.Scanner;

public class SquareOfNum implements ValueAndSquare
{

	public static void main(String[] args) 
	{
		System.out.print("Enter the value of n:");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		SquareOfNum sobj=new SquareOfNum();
		sobj.value(n);
		in.close();
	}

	@Override
	public void value(int num)
	{
		System.out.println("The Square of number is : "+(num*num));
	}

}
