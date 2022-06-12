package basics;

public class SwapTwoNumbers {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		
//		System.out.println("before swapping");
//		System.out.println("a=" +a);
//		System.out.println("b=" +b);
//	
//		System.out.println("after swapping");
//		
//		//With temp variable
//		int temp;
//		temp = a;
//		a = b;
//		b = temp;
//		
//		System.out.println("a=" +a);
//		System.out.println("b=" +b);
		
		//WITHOUT TEMP VARIABLE
		
		System.out.println("before swapping");
		System.out.println("a=" +a);
		System.out.println("b=" +b);
	
		System.out.println("after swapping");
		
		a = a-b;//-10
		b = a+b;//-10
		a = b-a;//20
		System.out.println("a=" +a);
		System.out.println("b=" +b);
		
	}

}
