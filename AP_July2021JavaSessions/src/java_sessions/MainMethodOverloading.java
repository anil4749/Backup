package java_sessions;

public class MainMethodOverloading {

	public static void main(String[] args) {
		System.out.println("My Main Method");
		
	}
	
	public static void main(int a) {
		System.out.println(" main method "+ a);
	}
	public static void main(int a, int b) {
		System.out.println(" main method "+ b);
	}

}
