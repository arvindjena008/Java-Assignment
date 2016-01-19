import java.util.Scanner;

public class SortArrayInsertionOfElement
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the size of an array:");
		int n = in.nextInt();
		int[] a = new int[n+1];
		for(int i=0;i<n;i++)
		{
			System.out.print("a["+i+"] = ");
			a[i]=in.nextInt();
		}
		
		int temp;
        for (int i = 1; i < n; i++)
        {
            for(int j = i ; j > 0 ; j--)
            {
                if(a[j] < a[j-1])
                {
                    temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }
            }
        }
        for(int k=0;k<n;k++)
		{
        	System.out.print(a[k]+" ");
		}
        System.out.println();
        System.out.print("Enter an element to be insert:");
        a[n]=in.nextInt();
        int[] b=a;
        int key=a[n];
        System.out.println("Before the insertion of element '"+b[n]+"'");
        for(int l:b)
        	System.out.print(l+" ");
        System.out.println();
        temp=0;
        for (int i = 1; i < b.length; i++)
        {
            for(int j = i ; j > 0 ; j--)
            {
                if(b[j] < b[j-1])
                {
                    temp = b[j];
                    b[j] = b[j-1];
                    b[j-1] = temp;
                }
            }
        }
        System.out.println("after the insertion..............");
        for(int m:b)
        	System.out.print(m+" ");
        for(int k=0;k<=b.length;k++)
        {
        	if(b[k]==key)
        	{
        		System.out.println();
                System.out.println(key+" is in "+k);
                break;
        	}
        }
        in.close();
	}

}
