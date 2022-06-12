package Selenium_Session;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/anilmore/downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver() ;
		driver.get("https://www.amazon.in");
		
		String title = driver.getTitle();
		System.out.println("page title :" + title);
		
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();

	}

}
