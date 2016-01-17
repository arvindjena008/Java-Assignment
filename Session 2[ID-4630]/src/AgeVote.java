import java.util.Scanner;

public class AgeVote {

	public static void main(String[] args) {
		int age;
		System.out.print("Enter your age: ");
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in); 
		age = in.nextInt();
		if(age>=1&&age<=100)
		{
			if(age>=18)
			{
				System.out.println("You are eligible for vote...........");
				return;
			}	
			System.out.println("You are not eligible for vote..........");
			return;
		}
			System.out.println("Invalid Age........please try again!!!!");

	}

}
