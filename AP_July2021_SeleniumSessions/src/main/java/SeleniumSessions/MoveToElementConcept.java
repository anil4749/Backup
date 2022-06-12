package SeleniumSessions;

import java.lang.annotation.Target;

import org.apache.hc.core5.http.io.entity.PathEntity;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
	
//		WebElement content = driver.findElement(By.className("menulink"));
//		
//		Actions act = new Actions(driver);
//		
//		act.moveToElement(content).build().perform();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.linkText("COURSES")).click();
		
	//	By content = By.className("menulink");
		By adons = By.xpath("//div[text() ='Add-ons']");
		
		
//		By courses = By.linkText("COURSES");
//		By articles = By.linkText("ARTICLES");

		By ZeroCancel = By.xpath("//div[text() ='Zero Cancellation']");
		
		parentChildMenuHandle(adons, ZeroCancel);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void parentChildMenuHandle(By parent , By child) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(parent)).build().perform();
		Thread.sleep(2000);
		getElement(child).click();
	}

}
