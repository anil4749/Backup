package testngfeatures;

import org.testng.annotations.Test;

public class InvocationCountMethod {

	@Test(invocationCount = 10)
	public void loginTest() {
		System.out.println("login test");
	}
}
