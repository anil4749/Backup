package testngfeatures;

import org.testng.annotations.Test;

public class DependsOnMethodsConcept {

	@Test
	public void loginTest() {
		System.out.println("login test");
		int i=9/0;
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void homePageTest() {
		System.out.println("homePageTest test");
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void searchTest() {
		System.out.println("searchTest test");
	}
	
	//CRUD
	
	public void userCreate(String name ,int age) {
		System.out.println(name+ " "+ age);
	}
	
	public void updateUser(String name , int age) {
		System.out.println(name+ " "+ age);
	}

	public void deleteUser(String name , int age) {
		System.out.println(name+ " "+ age);
	}
	
	public void getUser(String name) {
		System.out.println(name);
	}
	
	
//	@Test
//	public void createUserTest() {
//		System.out.println("Create User");
//		userCreate("tom", 25);
//	}
//	
//	@Test(dependsOnMethods = "createUserTest")
//	public void updateUserTest() {
//		System.out.println("Update User");
//		updateCreate("tom", 30);
//	}

	
	@Test
	public void createUserTest() {
		System.out.println("Create User");
		userCreate("tom", 25);
	}
	
	@Test
	public void updateUserTest() {
		System.out.println("Update User");
		userCreate("tom", 25);
		updateUser("tom", 30);
	}
	
	@Test
	public void deleteUserTest() {
		System.out.println("delete User");
		userCreate("peter", 25);
		deleteUser("peter", 25);
	}
	
	@Test
	public void getUserTest() {
		System.out.println("get User");
		userCreate("Lisa", 30);
		getUser("Lisa");
	}
	
}
