package basics;

public class MainClass {
	
	public static void main(String[] args) {
//		System.out.println("Hello World");

		Person p1 = new Person();
		p1.age = 24;
		p1.name = "amol";
		
		Person p2 = new Person(28 , "Anil More");
		
		System.out.println(p2.name + p2.age);
		
		p2.name = "more";
		System.out.println(p2.name);
	
		
//		System.out.println(p1.age + " " + p1.name);
//		System.out.println(p2.age + " " + p2.name);
//		
		System.out.println("_____________");
		p1.eat();
		p2.eat();
		p2.walk(10);
		p1.walk();
		
	
	
		
		System.out.println(Person.count);
		
	}
}

class Person {
	String name;
	int age;
	
	static int count;
	
	public Person() {
		count++;
		System.out.println("Creating an object");
	}
	
	public Person(int newAge , String newName) {
		name = newName;
		age = newAge;
	}
	
	void walk() {
		System.out.println(name + " is walking");	
	}
	
	void eat() {
		System.out.println(name + " is eating");
	}
	void walk(int steps) {
		System.out.println(name + " walked " + steps + " steps");
	}
	
}