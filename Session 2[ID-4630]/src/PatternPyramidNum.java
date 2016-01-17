
public class PatternPyramidNum {

	public static void main(String[] args) {
		int i,j,k;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++){
			 System.out.print(j);
			 if(i!=j)
				 System.out.print("*");
			/*if(i>1 && l<i){
				System.out.print("*");
				l++;
			}*/
			}	
			System.out.println();
			//l=1;
		}
		for(i=1,k=5;i<=5;i++,k--)
		{
			for(j=1;j<=k;j++)
			{
			 System.out.print(j);
			 if(k!=j)
			 System.out.print("*");
			} 
			System.out.println();
		}

	}

}
