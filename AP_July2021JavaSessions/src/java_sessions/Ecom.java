package java_sessions;

public class Ecom {
	
	//Method Overloading :- within the same class
	//when we have diff methods:- 
	//1.with the same name
	//2.with diff types and number of parameters
	//3.sequence of the parameter should be different
	
	//CompileTimePolymorphism -->diff forms -->Static polymorphism
	
//	public void login() {
//		System.out.println("login");
//	}
//	
//	public void login(int a) {
//		System.out.println("login"+ a);
//	}
//	
//	public void login(int a , int b) {
//		System.out.println("login"+ a+b);
//	}
//	
//	public void login(int a , String b) {
//		System.out.println("login"+ a+b);
//	}
//	
//	public String login(String a , int b) {
//		System.out.println("login"+ a+b);
//		return a+b;
//	}

	public void login() {
		System.out.println("default login");
	}

	public void login(String un , String pwd) {
		System.out.println("login with : "+un + pwd);
	}
	
	public void login(String un , String pwd , String role) {
		System.out.println("login with : "+ un +pwd+ role);
	}
	
	public void login(String un , String pwd , int otp) {
		System.out.println("login with : "+ un +pwd+ otp);
	}
	
	public void login(long ph, int otp) {
		System.out.println("login with : "+ ph+ otp);
	}
	
	//
	
	public void search() {
		
	}
	
	public void search(String name) {
		
	}
	public void search(String name , int price) {
		
	}
	public void search(String name , String sellerName) {
		
	}
	//method overloading:- same method name but diff parameters
	public void booking() {
		
	}
	public void booking(String carType , String from , String to) {
		
	}
	public void booking(String carType , String from , String to,int users) {
		
	}
	public static void main(String[] args) {

		Ecom obj = new Ecom();
		obj.login();
		obj.login("admin", " admin123");
	}

}