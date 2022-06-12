package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NoSuchElementExceptionConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/index.php?route=account/login");

		By Search = By.name("search1");
		By forgotPwdLinks = By.name("Forgotten Password");

		//driver.findElement(Search).sendKeys("macbook");
		
		List<WebElement> searchList = driver.findElements(Search);
		System.out.println(searchList.size());
	}

}
