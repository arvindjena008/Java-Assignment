import java.util.Scanner;

public class DayInMon {

	public static void main(String[] args) {
		int month;
		System.out.print("Enter the month number: ");
		Scanner in = new Scanner(System.in);
		month = in.nextInt();
		switch(month)
		{
		case 1:System.out.println("No.of days in January is 31");break;
		case 2:System.out.println("No.of days in February is 28");break;
		case 3:System.out.println("No.of days in March is 31");break;
		case 4:System.out.println("No.of days in April is 30");break;
		case 5:System.out.println("No.of days in May is 31");break;
		case 6:System.out.println("No.of days in June is 30");break;
		case 7:System.out.println("No.of days in July is 31");break;
		case 8:System.out.println("No.of days in August is 31");break;
		case 9:System.out.println("No.of days in September is 30");break;
		case 10:System.out.println("No.of days in October is 31");break;
		case 11:System.out.println("No.of days in November is 30");break;
		case 12:System.out.println("No.of days in December is 31");break;
		default:System.out.println("Invalid Month!!!!!!!!!!!!");
		}

	}

}
