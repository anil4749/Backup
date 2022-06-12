package java_sessions;

import javax.annotation.processing.AbstractProcessor;

public class Employee {
	
	//Class--> blueprint/template of all objects
	//class is a concept
	//class template --> create the object
	
	//class variable after the class
	//class properties --. we never give values here
	
	String name;//every employee having name
	int age;//employee having age
	double salary;//employee salary
	boolean isActive;//employee is active or not

	//This are global variable
	//This class variable commmon for all the objects , but their values will be different
	
	public static void main(String[] args) {
		
		String name="Peter"; //This are local variable --> we need to initilize first
		System.out.println(name);
		
		//create the object : - use new keyword
		Employee e1 = new Employee();
		
		e1.name ="Tom";
		e1.age =20;
		e1.salary =23.44;
		e1.isActive =true;
		
		System.out.println(e1.name);
		System.out.println(e1.age);
		System.out.println(e1.salary);
		System.out.println(e1.isActive);
		
		Employee e2 = new Employee();
		e2.name ="Naveen";
		e2.isActive =false;
		
		
		System.out.println(e2.name+" "+e2.age+ " "+ e2.salary + " "+e2.isActive);
		
		e2.salary =12.22;
		System.out.println(e2.name+" "+e2.age+ " "+ e2.salary + " "+e2.isActive);

		//No Ref Objects
		new Employee().name ="Lisa";
		new Employee().age =21;
		
		Employee e5 = new Employee();
		e5 = null;
		
		System.out.println(e5.name); //NullpointerException
	
		//System.gc();//will try to destroy 3 objects
	}

}








