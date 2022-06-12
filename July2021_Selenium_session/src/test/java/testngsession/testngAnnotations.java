package testngsession;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngAnnotations {
	
	@BeforeSuite
	public void connectwithDB() {
		System.out.println("BS - connectwithDB");	
	}
	
	@BeforeTest
	public void createUser() {
		System.out.println("BT - createuser");
		
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC - launchBrowser");
	}
	@BeforeMethod
	public void launchApp() {
		System.out.println("BC - launchBrowser");
	}

	@Test
	public void homePageHeaderTEST( ) {
		System.out.println("homepageheaderTest");
	}
	@Test
	public void homePageTitleTEST( ) {
		System.out.println("homepageheaderTest");
	}
	@Test
	public void homePageSearchTEST( ) {
		System.out.println("homepageheaderTest");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("AM -- logout");		
	}
	@AfterClass
	public void closeURL() {
		System.out.println("Ac -- CLOSEURL");		
	}
}
