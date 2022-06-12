package java_sessions;

public class StaticMethods {
	
	public static void sendMail() {
		System.out.println("send mail");
	}
	public void getMail() {
		System.out.println("get mail");
	}

	public static void main(String[] args) {
		StaticMethods obj = new StaticMethods();
		
		//non-static methods should be call by using object ref
		obj.getMail();
		
		//static methods called it 
		//1)by using class name
		StaticMethods.sendMail();
		
		//2. call directly
		sendMail();
		
		//3.by using object reference
		obj.sendMail();
	}

}
