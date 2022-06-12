package ConstructorConcept;

public class TestUser {
	
	public static void main(String[] args) {
		
		User u1 = new User("Tom", 20);
		System.out.println(u1.getName());
		System.out.println(u1.getAge());
		
		u1.setName("Tom Peter");
		System.out.println(u1.getName());
		
		User u2 = new User("Tome", "City");
		User u3 = new User("sonu");
		User u4 = new User("amol", 12, "Mumbai");
		
	//	Company comp =  new Company();
 	}

}
