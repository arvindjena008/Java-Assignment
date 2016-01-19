import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args)
	{
		int n,index=0;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the size of an array:");
		n = in.nextInt();
		int[] a = new int[n];
		for(int i=0;i<a.length;i++)
		{
			System.out.print("a["+i+"] = ");
			a[i]=in.nextInt();
		}	
        for(int j:a)
		{
        	System.out.println("Element at index "+index+" "+j);
			index++;
			
		}
		System.out.println("the array in reverse order is:");
		for(int k=0;k<a.length;k++)
		{
			System.out.println("Element at index "+ k +" "+ a[--n]);
			
		}		
		
		in.close();
	}

}
