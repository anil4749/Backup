package JavaQuestions;

public class ReverseString1 {

	public static void main(String[] args) {

		String a = "Amol";
		int c = 0;

		Character ch[] = new Character[a.length()];

		for (int i = a.length()-1; i >= 0; i--) {
			ch[c] = a.charAt(i);
			System.out.print(ch[c]);
		}

//		
//		String input = "Maharashtra";
//		char[] rev = input.toCharArray();
//		arun.kumavat@ClaraFutura.tech
//		for(int i= rev.length-1; i>=0;i--) {
//			System.out.print(rev[i]);
//		}
	}

}
