import java.util.InputMismatchException;
import java.util.Scanner;

public class ExArrayIndexOut {

	public static void main(String[] args) {
		int n,index;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the size of an array:");
		n = in.nextInt();
		try
		{
		int[] a = new int[n];
		for(int i=0;i<a.length;i++)
		{
			System.out.print("a["+i+"] = ");
			a[i]=in.nextInt();
		}	
		
			System.out.print("Enter the index to be :");
			index=in.nextInt();
			System.out.println("the element at index "+index+" is : "+a[index]);
		}
		catch (ArrayIndexOutOfBoundsException ie)
		{
			System.out.println("the array size is :"+n);
			System.out.println("there is no element at this position......");
		}
		catch (InputMismatchException i)
		{
			System.out.println("please enter ineger value.......");
		}
		catch (Exception e)
		{
			System.out.println("please check once again");
		}
		finally
		{
			in.close();
		}
	}

}
