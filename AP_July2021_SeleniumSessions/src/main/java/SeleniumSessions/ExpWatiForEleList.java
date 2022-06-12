package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExpWatiForEleList {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
		driver.get("https://www.freshworks.com/");

		By footerList = By.xpath("//ul[@class='footer-nav']//a");
//		List<WebElement> footerElementsList = waitForElementPresence(footerList, 5);
//		
//		for (WebElement e : footerElementsList) {
//			System.out.println(e.getText());
//		}
		//12.00
		
		printElementsTextList(footerList, 5);
	}
	
	public static List<WebElement> waitForElementsVisible(By locator , int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	
	public static List<WebElement> waitForElementPresence(By locator , int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	}
	
	public static List<String> getElementsTextList(By locator , int timeOut) {
		List<WebElement> eleList = waitForElementPresence(locator, timeOut);
		List<String> eleValList = new ArrayList<String>();
		for (WebElement e : eleList) {
			eleValList.add(e.getText());
		}
		return eleValList;
	}
	
	public static void printElementsTextList(By locator , int timeOut) {
		List<WebElement> eleList = waitForElementPresence(locator, timeOut);
		for (WebElement e : eleList) {
		System.out.println(e.getText());
		}
	}
}
