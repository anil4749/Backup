package basics;

import java.util.Scanner;

public class LargestAmongThreeNumbers {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		
		System.out.println("Pls enter 1st numbers");
		int x = reader.nextInt();
		System.out.println("Pls enter 2nd numbers");
		int y = reader.nextInt();
		System.out.println("Pls enter 3rd numbers");
		int z = reader.nextInt();
		
//		int x = 100;
//		int y = 200;
//		int z = 300;
		
		if(x>y && x>z) {
			System.out.println("X IS THE GREATEST NUMBER");
		}
		else if (y>z) {
			System.out.println("Y is the Gretest");
		}
		else {
			System.out.println("Z is the Greatest");
		}
		
	}

}
