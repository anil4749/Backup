package Test_Package;

import java.util.Scanner;

public class ReverSeString {

	public static void main(String[] args) {
		
		
				System.out.println("Please Enter your String");
				Scanner sc = new Scanner(System.in);
				String s = sc.nextLine();
				String input = "";
				
				
				
		     //   String input = "MAHARASHTRA";
		 
		        StringBuilder rev = new StringBuilder(s);
		 
		        // append a string into StringBuilder
		        
		        //rev.append(s);
		 
		        // reverse StringBuilder 
		        //rev.reverse();
		 
		        // print reversed String
		        System.out.println("Reverse String is " +rev.reverse());
		    }
	}