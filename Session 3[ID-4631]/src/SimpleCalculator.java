import java.util.Scanner;

public class SimpleCalculator 
{
	void display(double n1,char ch,double n2)
	{
		switch(ch)
		{
		case '+':System.out.println("The Addition of "+n1+" and "+n2+" is : "+(n1+n2)+"\n"+"!!!!!!Thank You!!!!!!");break;
		case '-':System.out.println("The Subtraction of "+n1+" and "+n2+" is : "+(n1-n2)+"\n"+"!!!!!!Thank You!!!!!!");break;
		case '/':System.out.println("The Division of "+n1+" and "+n2+" is : "+(n1/n2)+"\n"+"!!!!!!Thank You!!!!!!");break;
		case '*':System.out.println("The Multiplication of "+n1+" and "+n2+" is : "+(n1*n2)+"\n"+"!!!!!!Thank You!!!!!!");break;
		default:System.out.println("------------Please choose correct operator------------"+"\n"+"!!!!!!Thank You!!!!!!");
		}
	}
	public static void main(String[] args) 
	{
		double num1,num2;
		char chr;
		SimpleCalculator cobj=new SimpleCalculator();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the First number : ");
		num1=in.nextDouble();
		
		System.out.print("Enter the Second number : ");
		num2=in.nextDouble();
		
		System.out.println("+");
		System.out.println("-");
		System.out.println("/");
		System.out.println("*");
		System.out.print("Choose any one operator : ");
		chr=in.next().charAt(0);
		cobj.display(num1, chr, num2);
		in.close();		
	}

}
