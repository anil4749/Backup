package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
	
		//create webelement + perform action(click,sendkeys,gettext,isdisplayed)
//1.
	//	driver.findElement(By.id("input-email")).sendKeys("patilamolentc@gmail.com");
	//	driver.findElement(By.id("input-password")).sendKeys("patil123");
	
//2. Approach
	//	WebElement emailId = driver.findElement(By.id("input-email"));
	//	WebElement password = driver.findElement(By.id("input-password"));

//		emailId.sendKeys("patilamolentc@gmail.com");
//		password.sendKeys("patil123");

//3. By Locator
	//	By emailID = By.id("input-email");
	//	By password =By.id("input-password");
		
	//	driver.findElement(emailID).sendKeys("amol@gmail.com");
	//  driver.findElement(password).sendKeys("patil123");
//4. 
	//	By emailID = By.id("input-email");
	//	By password =By.id("input-password");
		
	//	WebElement eID = driver.findElement(emailID);
	//	WebElement Pwd = driver.findElement(password);
		
	//	eID.sendKeys("patil@gmail.com");
	//	Pwd.sendKeys("patil123");

//5. Generic Function: To Create WebElement :- getElement()
		
		//By emailID = By.id("input-email");
		//By password =By.id("input-password");
		
		//getElement(emailID).sendKeys("patil@gmail.com");
		//getElement(password).sendKeys("patil@123");

//6.Generic function : - getElement() + SendkEys()
	
		//By emailID = By.id("input-email");
		//By password =By.id("input-password");
		
		//doSendKeys(emailID, "patilamol@gmail.com");
		//doSendKeys(password, "patil123");
		
//7.
			
		By emailID = By.id("input-email");
		By password =By.id("input-password");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(emailID, "patil@gmail.com");
		eleUtil.doSendKeys(password, "patil123");
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator , String value) {
		getElement(locator).sendKeys(value);
	}
	
	

}













