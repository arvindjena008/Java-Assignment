import java.util.Scanner;

public class ValueOfNum implements ValueAndSquare
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the value of n:");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		ValueOfNum vobj=new ValueOfNum();
		vobj.value(n);
		in.close();
	}

	@Override
	public void value(int num) 
	{
		System.out.println("The value of number is : "+num);
		
	}

}
