package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementwithFindElements {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/index.php?route=account/login");

		List<WebElement> footerList =driver.findElements(By.xpath("//footer//a"));//v1
		System.out.println(footerList); //v1
		
		for (WebElement e : footerList) { //v1
			System.out.println(e.getText());
			e.click();//That moment when click on it , it got stale
			//v2 --> V3 version
			
			//driver.navigate().back();
			footerList =driver.findElements(By.xpath("//footer//a"));//V2 --> v3
			
			//Refresh
			//back/forward
			//click on link-dom updated - page is refreshed
			
		}
	}

}
