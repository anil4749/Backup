package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/anilmore/downloads/chromedriver");

		WebDriver driver = new ChromeDriver();// LaunchBrowser
		driver.get("https://www.google.com");// EnteringURL

		String title = driver.getTitle();// Get Title
		System.out.println("Page Title : " + title);

		System.out.println(driver.getCurrentUrl());// Validation

		driver.quit();// close the browser

		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		title = driver.getTitle();
		//Quit  :- Null Session ID after browser quit
		//Close :- session id Invalid (NoSuchException)
		System.out.println("Page Title : " + title);
	}
}

