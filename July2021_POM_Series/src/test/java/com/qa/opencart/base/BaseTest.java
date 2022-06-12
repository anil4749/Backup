package com.qa.opencart.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.opencart.Pages.LoginPage;
import com.qa.opencart.factory.DriverFactory;

public class BaseTest {
	
	public WebDriver driver;
	public Properties prop;
	public DriverFactory df;
	public LoginPage loginPage;
	
	@BeforeTest
	public void setUp() {
		
		df = new DriverFactory();
		df.initProp();
		driver = df.initDriver("chrome");
		loginPage = new LoginPage(driver);
		
	}
	
	
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
		
	}

}
