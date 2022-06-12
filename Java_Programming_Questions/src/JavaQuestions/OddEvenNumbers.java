package JavaQuestions;

public class OddEvenNumbers {

	public static void main(String[] args) {

		//int num = 100;
		
		for(int i=1; i<=100; i++) {
			if(i%2==0) {
				System.out.println(i +" : No is even");
			}
			
			
			if(i%2==1) {
				
				
				if(i%5==0 ){
					System.out.println(i+" : No is odd and divisible by 5");
			    }
				
				else {
					System.out.println(i+" : No is odd");
					
				}
				
		}
	}}

}
