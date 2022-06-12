package testNgSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.base.StandardSystemProperty;

public class TestNgAnnotation {

	// Desging TC :-

	// Global pre-condition -- @Before
	// pre-condition --@Before
	// test Steps --@Test
	// act result - expected result-- Assertions
	// post steps --@After

	// Execution : -
	// status - PASS/FAIL
	
/**
		BS--connectwithDB
		BT--createUser
		BC--launchBrowser
		
				BM--logintoApp
				homePageHeaderTest
				AM--logout
				
				BM--logintoApp
				homePageTitleTest
				AM--logout
				
				BM--logintoApp
				searchTest
				AM--logout
				
		AC--closeBrowser
		AT--deleteUser
		AS--disconnectWithDB

PASSED: homePageHeaderTest
PASSED: homePageTitleTest
PASSED: searchTest

 */

	@BeforeSuite
	public void connectWithDB() {
		System.out.println("BS--connectwithDB");
	}
	
	@BeforeTest
	public void createUser( ) {
		System.out.println("BT--createUser");
	}
	
	@BeforeClass
	public void launchBrowser( ) {
		System.out.println("BC--launchBrowser");
	}
	
	@BeforeMethod
	public void logintoApp( ) {
		System.out.println("BM--logintoApp");
	}
	
	@Test
	public void homePageHeaderTest() {
		System.out.println("homePageHeaderTest");
	}
	
	@Test
	public void homePageTitleTest() {
		System.out.println("homePageTitleTest");
	}
	
	@Test
	public void searchTest() {
		System.out.println("searchTest");
	}
	
	
	@AfterMethod
	public void logout() {
		System.out.println("AM--logout");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC--closeBrowser");
	}

	@AfterTest
	public void deleteUser() {
		System.out.println("AT--deleteUser");
	}
	@AfterSuite
	public void disconnectWithDB() {
		System.out.println("AS--disconnectWithDB");
	}
	
}
