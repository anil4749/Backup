package java_sessions;

public class TimeComplexity {

	public static void main(String[] args) {

		//TC - Big O(n)
		
		int i =1;//1 --> 0(1)
		
		int k =10;//1
		
		//0(2)
		//constant time: 0(1)
		
		for(int j=1; j<=10; j++) {
			System.out.println(j);
		}
		//1+n+n ==> 1+3n ==> 3n
		
		for(int p=1; p<=5; p++) {
			for(int q=1;q<=5; q++) {
				System.out.println(p+ ""+ q);
			}
		}
	}

}
