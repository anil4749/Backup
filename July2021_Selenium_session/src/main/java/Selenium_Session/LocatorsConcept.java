package Selenium_Session;

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
		
		
		//create WebElement + Perform action (click,get text , isdiplayed)
//	1.	
//		driver.findElement(By.id("input-email")).sendKeys("patilamolentc");
//		driver.findElement(By.id("input-password")).sendKeys("123");

		//2.
//		WebElement emailId = driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));
//		
//		emailId.sendKeys("patilamolentc");
//		password.sendKeys("123");
//		
		//3.By locator...Best Approach
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//		
//		driver.findElement(emailId).sendKeys("patilamolentc");
//		driver.findElement(password).sendKeys("123");
		
//		//4.
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//		
//		WebElement eId = driver.findElement(emailId);
//		WebElement pwd = driver.findElement(password);
//		
//		eId.sendKeys("patilamolentc");
//		pwd.sendKeys("123");
		
		//5.generic function: getElement()
		
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//		
//		getElement(emailId).sendKeys("patilamolentc");
//		getElement(password).sendKeys("123");
		
		//6.generic function : getElement() + sendkeys()
		
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//		
//		doSendkeys(emailId, "patilamolentc");
//		doSendkeys(password, "123");
		
		//7.
		By emailId = By.id("input-email");
		By password = By.id("input-password");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendkeys(emailId, "patilamolentc");
		eleUtil.doSendkeys(password, "123");
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendkeys(By locator, String Value) {
			getElement(locator).sendKeys(Value);		
	}
}
	
	
	
