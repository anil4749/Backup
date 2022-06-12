package OOP_Inheritance;

public class BMW extends Car {
	
	int speed = 200;

	// Method Overriding :- Poly+Morphism (Dynamic or Runtime Polymorphism)-bcaz the overriden method will be decided at runtime that has to be called 
	// will happens between parent and child class , we cannot acheive method overriding with same class
	//When we have a method in the parent class and the same method in child class with:
	//1.the same name
	//2.the same number of parameters+ Same type of parameter+ with the sequence of parameters
	//3.the same return type

	//4.Final method can not be overridden(we can overload final method)
	//5.Static method can not be overridden
	//6.static method can be inherited
	
	@Override
	public void start() {
		System.out.println("BMW---> Start");
		
	}

	// Individual
	public void autoParking() {
		System.out.println("BMW --->Auto Parking ");
	}
	
	//Method Hiding:- it is acheive by static only
//	public static void getName() {//Individual Method
//		System.out.println("BMW get Name");
//	}
}
