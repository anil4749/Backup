package ConstructorConcept;

public class Employee {

	// constructor having the same name as the class name
	// doesn't have any return type/no void
	// its not a function
	// but function may or may not return
	// constructor can be overloaded
	// Constructor will be called when you create the object of the class
	//with const .. you can avoid creating of unnecessary objects
	//buss login / feature should be defined inside the functions/methods
	
	public Employee() { //o parameter const -- default constructor
		System.out.println("default cons");
	}

	public Employee(int a) { //1- parameter const
		System.out.println("1 para const...." + a);
	}
	
	public Employee(int a , String b) {//2 parameter const
		System.out.println("2 para const....." + (a+b));
	}	
	
	public static void main(String[] args) {
		Employee e1 = new Employee(10 , "Tom");
		Employee e2 = new Employee(20);
	}

}
