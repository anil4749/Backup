package JavaQuestions;

public class Print1to100WithoutUsingLoop {

	static void printNos(int n) {
		if (n>0)
		{
			printNos(n-1);
			System.out.println(n +" ");
		}
	}
	public static void main(String[] args) {
		printNos(100);
	}

}
