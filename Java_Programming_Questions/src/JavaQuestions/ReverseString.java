package JavaQuestions;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		//String input = "MAHARASHTRA";
		
		Scanner scanner = new Scanner(System.in);
		String input =scanner.next();
		
		StringBuilder input1 = new StringBuilder(input);
		
		//input1.append(input);
		input1.reverse();
		System.out.println(input1);
		
	}

}
