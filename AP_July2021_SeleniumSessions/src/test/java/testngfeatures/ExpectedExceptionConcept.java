package testngfeatures;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	String name = "JAVA";
	
	@Test(expectedExceptions = {NullPointerException.class, ArithmeticException.class})
	public void createUserTest() {

		System.out.println("Create User Test");
		int i= 9/0;//Arithmatic Exception
		
		ExpectedExceptionConcept obj = new ExpectedExceptionConcept();
		obj = null;
		System.out.println(obj.name);//Null Pointer expection
	}
	
	
	@Test(expectedExceptions = Exception.class)
	public void UserTest() {

		System.out.println("Create User Test");
		int i= 9/0;//Arithmatic Exception
		
		ExpectedExceptionConcept obj = new ExpectedExceptionConcept();
		obj = null;
		System.out.println(obj.name);//Null Pointer expection
	}
}
