package java_sessions;

import java.util.Locale.Category;

public class TestCustomer {

	public static void main(String[] args) {

		Customer c1 = new Customer();
		c1.name = "Tom";
		c1.emailId ="tom@gmail.com";
		c1.phone=989898;
		c1.isPrime =true;
	
		System.out.println(c1.name);
		System.out.println(Customer.category);
	}

}
