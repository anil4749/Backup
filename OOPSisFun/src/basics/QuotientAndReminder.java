package basics;

import java.util.Scanner;

public class QuotientAndReminder {

	public static void main(String[] args) {
		
		System.out.println("Pls Enter Your numbers");
		Scanner sc = new Scanner(System.in);
		int dividend = sc.nextInt();
		int divisor = sc.nextInt();
		
		
//		int dividend = 30;
//		int divisor = 6;
		
		int quotient = dividend /divisor;
		int reminder = dividend %divisor;
		
		System.out.println(quotient);
		System.out.println(reminder);
	}

}
