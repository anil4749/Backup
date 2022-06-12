package JavaQuestions;

public class ReverseStringLikePro {

	public static void main(String[] args) {

		String str = "I am Test Automation Engineer";
		
		String reverse[] = str.split(" ");
				
		for(int i=reverse.length-1; i>=0 ; i--) {
			System.out.print(reverse[i]+" ");
		}
	}

}
