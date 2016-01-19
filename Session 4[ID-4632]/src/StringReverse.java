import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		StringBuffer sentence = new StringBuffer();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string");
		sentence.append(input.nextLine());
		sentence=sentence.reverse();
		System.out.println("The reverse of above string is");
		System.out.println(sentence);
		input.close();
	}

}
