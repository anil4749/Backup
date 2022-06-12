package OOP_Inheritance;

public class Car extends Vehicle {
	
	final int speed = 100;
	
	//final method can not be overridden
	//final class - can not be inherited
	//final :- is used to prevent inheritance/method overriding
	
	public void start() {
		System.out.println("Car--> Start");
	}
	
	public void stop() {
		System.out.println("Car-->Stop");
	}
	
	public void refuel() {
		System.out.println("Car-->Refuel");
	}
	
	public static void getName() {
		System.out.println("Car get Name");
	}
	
}
