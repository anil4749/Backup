package Selenium_Session;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowserTesting {
	
	static WebDriver driver ;

	public static void main(String[] args) {
		
		String browser = "Chrome";
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/anilmore/downloads/chromedriver");
			 driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/anilmore/downloads/geckodriver");
			 driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("safari")) {
			 driver = new SafariDriver();
		}
		else {
			System.out.println("Please pass the right browser..." + browser);
		}
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		
		}
	}

