package Selenium_Session;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WDMConcept {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		WebDriverManager.firefoxdriver().setup();
		
//		WebDriver driver = new FirefoxDriver();
//		driver.get("https://www.mcqcbank.in");
//		System.out.println(driver.getTitle());
		
//		WebDriver driver = new SafariDriver();
//		driver.get("https://www.mcqcbank.in");
//		System.out.println(driver.getTitle());
		
		
		driver.quit();

	}

}
