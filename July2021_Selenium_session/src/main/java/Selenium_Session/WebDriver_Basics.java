package Selenium_Session;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Basics {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/anilmore/downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver() ;
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
