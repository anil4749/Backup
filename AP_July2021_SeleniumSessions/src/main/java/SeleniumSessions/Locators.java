package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	static WebDriver driver;

	public static void main(String[] args) {

		// 1.ID : is the Unique locator
		// 2.name : can be duplicate

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/index.php?route=account/register");

//		driver.findElement(By.name("firstname")).sendKeys("amol");
		
	//	By fn = By.name("firstname");
	//	By ln = By.id("input-lastname");
		//driver.findElement(fn).sendKeys("amol");
		
	//	ElementUtil eleUtil = new ElementUtil(driver);
	//	eleUtil.doSendKeys(fn, "Tom");
	//	eleUtil.doSendKeys(ln, "Peter");
		
	//3.Classname :- can be duplicate
	//	driver.findElement(By.className("form-control")).sendKeys("amol");

	//4.xpath : is not attribut --is just locator --address of the specific element
		
	//	driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("amol");
		
	//5.CssSelector :is not attribute-is locator
		//CSS:-Cascaded Style Sheet
	//	driver.findElement(By.cssSelector("#input-firstname")).sendKeys("amol");
			
	//6.LinkText:-Only for links-->html tag starts from <a> --> anchor tag
		//driver.findElement(By.linkText("Login")).click();
		
	//7.PartialLinkText:-Only for links-->html tag starts from <a> --> anchor tag
		//driver.findElement(By.partialLinkText("Delivery")).click();
		
		//Delivery Process , Delivery Test , Delivery Info -- so its confusion
		//but we can use this is in Paragrapah
		
	//8. tagname :
		//String header = driver.findElement(By.tagName("h2")).getText();
		//System.out.println(header);
		
		By customers = By.linkText("Customer");
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
