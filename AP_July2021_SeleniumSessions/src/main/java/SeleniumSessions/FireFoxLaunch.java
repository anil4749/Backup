package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxLaunch {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "/Users/anilmore/downloads/geckodriver");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.in");
		String title = driver.getTitle();
		System.out.println("page title :" + title);
		
		System.out.println(driver.getCurrentUrl());

		driver.quit();

	}

}
