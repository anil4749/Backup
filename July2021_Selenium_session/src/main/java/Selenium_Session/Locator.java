package Selenium_Session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locator {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		//1.ID - It is Unique locator
		//2.name - It can be duplicate
		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			driver.get("https://www.freshworks.com");
			
//			driver.findElement(By.name("firstname")).sendKeys("Amol");

//			By fn = By.name("firstname");
//			By ln = By.name("input-lastname");
//			//driver.findElement(fn).sendKeys("naveen");
//			
//			ElementUtil eleUtil = new ElementUtil(driver);
//			eleUtil.doSendkeys(fn, "Amol");
//			eleUtil.doSendkeys(ln, "Patil");
			
//			//3.ClassName :- Duplicate
//			//driver.findElement(By.className("form-control")).sendKeys("Amol");
//			
			//4.Xpath : is not attribute -- is locator --address of the element inside te DOM
			
//			driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Amol");
			
			//5.Css selector- is not attribute -it's not property -- its locator
			//css - (Cascaded style sheet)
//			driver.findElement(By.cssSelector("#input-firstname")).sendKeys("Amol");

//			//6.linkText :- only for links--> html tag = <a --anchor tag
//			driver.findElement(By.linkText("Login")).click();
			
			//7.partialLinkText :- only for links--> html tag = <a --anchor tag
//			driver.findElement(By.partialLinkText("Delivery")).click();
			
			//8.tagName :
			
//			String header = driver.findElement(By.tagName("h2")).getText();
//			System.out.println(header);
			
			
			By customers = By.linkText("Customers");
			By header = By.tagName("h2");
			String headerText = doGetText(header);
			System.out.println(headerText);
			
			doClick(customers);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
		
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	
	public static String doGetText(By locator) {
		return getElement(locator).getText();
	}
	
}
