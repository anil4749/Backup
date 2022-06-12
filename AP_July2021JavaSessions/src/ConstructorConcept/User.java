package ConstructorConcept;

public class User {

	private String name;
	private int age;
	private String city;
	
	//Constructor is helping to set the class variable//Like setter
	
	public User(String name , int age) {
		this.name = name;
		this.age= age;
	}
	
	public User(String name , String city) {
		this.name = name;
		this.city= city;
	}
	
	public User(String name) {
		this.name = name;
	}

	public User(String name, int age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	
	
}
