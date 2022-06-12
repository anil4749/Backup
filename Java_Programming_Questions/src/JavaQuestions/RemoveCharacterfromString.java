package JavaQuestions;

import java.util.Scanner;

public class RemoveCharacterfromString {

	public static void main(String args[]) {
		System.out.println("Please Enter String");
		try (Scanner sc = new Scanner(System.in)) {
			String s = sc.nextLine();
			String newString = "";
			char c[] = s.toCharArray();
			int temp = 0;
			for (int i = 0; i < c.length; i++) {
				temp = 0;

				for (int j = i + 1; j < c.length; j++) {

					if (c[i] == c[j]) {
						temp = 1;
						break;
					}
				}
				if (temp == 0) {
					newString = newString + c[i];
				}
			}

			System.out.println(newString);
		}

	}

}
