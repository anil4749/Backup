package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAttribute {
	
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		
		String attrVal = driver.findElement(By.name("firstname")).getAttribute("type");
		System.out.println(attrVal);//text
		
		By submitBtn = By.xpath("//input[@class='btn btn-primary']");
		System.out.println(checkElementDisable(submitBtn, "value"));
		
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static boolean checkElementDisable(By locator , String attrName) {
		String attrVal = getElement(locator).getAttribute(attrName);
		if(attrVal.equals("true")) {
			return true;
		}
		return false;
	}

}
