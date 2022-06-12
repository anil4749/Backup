package JavaQuestions;

import java.util.Scanner;

public class RemoveCharacters {

	public static void main(String[] args) {

		System.out.println("Please Enter String");
		try (Scanner sc = new Scanner(System.in)) {
			String s = sc.nextLine();
			char[] arr = s.toCharArray();
			StringBuilder sb = new StringBuilder();
			for (int i =0 ; i< arr.length;i++) {
				boolean repeated =false;
				for(int j=i+1;j<arr.length;j++) {
					if (arr[i] == arr[j]) {
						repeated = true;
						break;
					}
							
				}
				if(!repeated) {
					sb.append(arr[i]);
					}
			}
			System.out.println(sb);
		}
	}

}
