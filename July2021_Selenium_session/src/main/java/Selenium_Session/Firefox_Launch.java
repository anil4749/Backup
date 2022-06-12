package Selenium_Session;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox_Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "/Users/anilmore/downloads/geckodriver");
		
		WebDriver driver = new FirefoxDriver() ;
		driver.get("https://www.google.in");
		String title = driver.getTitle();
		System.out.println("page title :" + title);
		
		//Verification point/checkpoint:	act vs exp result
		if(title.equals("Google")) {
			System.out.println("Title is correct");
		}
		else {
			System.out.println("Wrong Title");
		}
		//Automation Testing = Automation steps + Verification Point
		
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();

	}

}
