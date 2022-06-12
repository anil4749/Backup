package testngfeatures;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestEnableDisable {

	@Test()
	public void createUserTest() {
		System.out.println("Create User");
	}
	
	@Test
	public void updateUserTest() {
		System.out.println("Update User");
	}
	
	@Test(enabled = true)
	public void deleteUserTest() {
		System.out.println("delete User");
	}

	@Ignore
	@Test(enabled = true , description = "get user test for amazon app")
	public void getUserTest() {
		System.out.println("get User");
	}
}
