package SeleniumSessions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContextClickConcept {


	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	
//		WebElement rightClickMe = driver.findElement(By.xpath("//span[text() = 'right click me']"));
//		Actions act = new Actions(driver);
//		act.contextClick(rightClickMe).build().perform();
//		List<WebElement> menuList = driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']//Li/span"));
//		System.out.println(menuList.size());
//		
//		for (WebElement e : menuList) {
//			String text = e.getText();
//			System.out.println(text);
		
		By rightClick = By.xpath("//span[text() = 'right click me']");
		By items = By.xpath("//ul[@class='context-menu-list context-menu-root']/Li/span");
		//getRightClickList(rightClick, items);
		
//		List<String> actList = getRightClickList(rightClick, items);
//		if (actList.contains("Copy")) {
//			System.out.println("Copy is Present");
//		}
		
//		if (rightClickItemsCount(rightClick, items) ==6) {
//			System.out.println("The Count is Corrent");
//		}
		
		clickOnRightClickItem(rightClick, items, "Quit");
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static int rightClickItemsCount(By rightClick , By items) {
		return getRightClickList(rightClick, items).size();
	}
	
	public static void clickOnRightClickItem(By rightClick , By items , String Value) {
		Actions act = new Actions(driver);
		act.contextClick(getElement(rightClick)).build().perform();
		List<WebElement> menuList = getElements(items);
		for (WebElement e : menuList) {
			if (e.getText().equals(Value)){
				e.click();
				break;
			}
		}
		
	}
	
	public static List<String> getRightClickList(By rightClick , By items) {
	
		List<String> itemValueList = new ArrayList<String>();
		
		Actions act = new Actions(driver);
		act.contextClick(getElement(rightClick)).build().perform();
	
		List<WebElement> menuList = getElements(items);
		System.out.println(menuList.size());
		
		for (WebElement e : menuList) {
			String text = e.getText();
			//System.out.println(text);
			itemValueList.add(text);
		}		
		return itemValueList;
	}
}
