package java_sessions;

import java.util.Iterator;

public class LoopsConcept {

	public static void main(String[] args) {
	

		// print 1 to 10
		//1.while
		
		int i =1;
		
		while (i<=10) {
			System.out.println(i);
			i++;//i++ use for infinite loop
			//++i;// to print 1 to 10 numbers
			//i=i+1;
			//i=i+2;//to print odd number
			
		}
		int k =1;
		while(k<=100) {
			System.out.println(k);
				if(k%5==0) {
					System.out.println("hiii");
				}
				k++;
		}
		//Taj hotel --Welcome Board
//		while(true) {
//			System.out.println("Welcome to Hotel Taj");
//		}
//		
		//System.out.println("hi"); here we generate infite loop  , so code not able to reach here
		
		//but in this case we can use Flag
//		boolean flag = false;
//		while(flag) {
//	}
		
		//Use cases for while
		//1.when the number of iterations are not fixed -- prefer while loop
		//2.Amazon -- total products--1 to 100 , 1 to 200 , 1 to 300;
		//3. checking the element present on the pages -- while loop
	
		boolean t = true ;
		while(t) {
			System.out.println("welcome");
			t= false;
		}
		
		System.out.println("_________");
		
		//2. for loop
		// 1 to 100 print ;
		
		for (int p =1; p<=10; p++) {
			System.out.println(p);// 1 then 2 then 3... 10
		}
//		for(;;) {
//			System.out.println("bye");
//		}
		
		//Print a to z Alphabets
		for (char c ='a'; c<='z';c++) {
			System.out.println(c +" ");
		}
		
		//Print double values (whenever we need to print Build number)
		for(double d =1.1; d<=10.0; d++) {
			System.out.println(d);
		}
		// use cases for for loop:
		//1.when we are sure about the total number of iterations
		//2.iterating arrays(bcaz its fixed in size) , arraylist -- for loop;
		//3.data driven - get the data from Excel -- total rows =10
		System.out.println("_______");
		//3.do - while loop:
		
		int r =1;
		
		do {
			System.out.println(r);//1 infinite time
			r++;
		}
		while (r<=10);
		//Use cases for do-while
		//1.pagination: 
		//2.check the title of the page
		
		
		//loop with break statement:
		for (int h=1;h<=100;h++) {
			System.out.println(h);
			if(h% 5==0) {
				System.out.println("hi");
				break;
			}
		}
		
		//get the list of all footer links
		//start a loop
		//put a condition to check the link text is equal to "amazon"
		//click on that element
		//break the loop
		
	}
}





















