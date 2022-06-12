package OOP_Encapsulation;

public class LoginPageTest {

	public static void main(String[] args) {

		//1st User
		LoginPage lp = new LoginPage();
		lp.setUsername("naveen@gmail.com");
		lp.setPassword("naveen123");
		
//		System.out.println(lp.getUsername());
//		System.out.println(lp.getPassword());
		
		lp.doLogin(lp.getUsername(), lp.getPassword());
		
		//2nd User:
		LoginPage lp1 = new LoginPage();
		lp1.setUsername("tom@gmail.com");
		lp1.setPassword("tom@123");
		
		lp1.doLogin(lp1.getUsername(), lp1.getPassword());
		
		//3rd use cases :
		lp.setPassword("naveen@456");
		
		System.out.println(lp.getPassword());
	}

}
