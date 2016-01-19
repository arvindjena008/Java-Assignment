import java.util.Scanner;

public class DemoStudent {

	public static void main(String[] args)
	{
		int RollNo,regNo,m1,m2;
		String Name;
		int year;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Year : ");
		year = in.nextInt();
		switch(year)
		{
		case 1:
			System.out.println("Enter the details for first year");
			System.out.print("Enter the Roll No. : ");
			RollNo = in.nextInt();
			System.out.print("Enter the Name : ");
			Name = in.next();
			System.out.print("Enter the Registration no. : ");
			regNo=in.nextInt();
			System.out.print("Enter the marks for 1st subject  : ");
			m1=in.nextInt();
			System.out.print("Enter the marks for 2nd subject : ");
			m2=in.nextInt();
			Student s1 = new StudentFirstYear(RollNo, Name, regNo);
			System.out.println("The Result for 1st year :");
			s1.display(m1,m2);
			break;
		case 2:
			System.out.println("Enter the details for Second year");
			System.out.print("Enter the Roll No. : ");
			RollNo = in.nextInt();
			System.out.print("Enter the Name : ");
			Name = in.next();
			System.out.print("Enter the Registration no. : ");
			regNo=in.nextInt();
			System.out.print("Enter the marks for 1st subject  : ");
			m1=in.nextInt();
			System.out.print("Enter the marks for 2nd subject : ");
			m2=in.nextInt();
			Student s2 = new StudentSecondYear(RollNo, Name, regNo);
			System.out.println("The Result for 2nd year :");
			s2.display(m1,m2);
			break;
		case 3:
			System.out.println("Enter the details for third year");
			System.out.print("Enter the Roll No. : ");
			RollNo = in.nextInt();
			System.out.print("Enter the Name : ");
			Name = in.next();
			System.out.print("Enter the Registration no. : ");
			regNo=in.nextInt();
			System.out.print("Enter the marks for 1st subject  : ");
			m1=in.nextInt();
			System.out.print("Enter the marks for 2nd subject : ");
			m2=in.nextInt();
			Student s3 = new StudentThirdYear(RollNo, Name, regNo);
			System.out.println("The Result for 3rd year :");
			s3.display(m1,m2);
			break;
		case 4:
			System.out.println("Enter the details for fourth year");
			System.out.print("Enter the Roll No. : ");
			RollNo = in.nextInt();
			System.out.print("Enter the Name : ");
			Name = in.next();
			System.out.print("Enter the Registration no. : ");
			regNo=in.nextInt();
			System.out.print("Enter the marks for 1st subject  : ");
			m1=in.nextInt();
			System.out.print("Enter the marks for 2nd subject : ");
			m2=in.nextInt();
			Student s4 = new StudentFourthYear(RollNo, Name, regNo);
			System.out.println("The Result for 4th year :");
			s4.display(m1,m2);
			break;	
		default:
			System.out.println("Please Enter the valid year ie. 1, 2, 3 or 4........");
			break;
		}
		in.close();
	}

}
