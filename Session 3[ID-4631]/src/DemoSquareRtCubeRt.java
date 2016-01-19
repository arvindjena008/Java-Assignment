import java.util.Scanner;

public class DemoSquareRtCubeRt
{
public static void main(String[] args)
{ 
	SquareRtCubeRt scobj = new SquareRtCubeRt();
	int num;
	System.out.println("This program is to calculate Cube root & Square root of a given Number");
	System.out.print("Enter a number: ");
	Scanner in=new Scanner(System.in);
	num=in.nextInt();
	scobj.display(num);
	in.close();
}
}