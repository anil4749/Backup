package Selenium_Session;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {
	
	public WebDriver driver;
	
	/**
	 * This method is used to init driver on the bsis of given browser name
	 * browsername
	 * it return the driver
	 */
	
	public WebDriver initDriver(String browserName) {
		
		System.out.println("Browser name is : "+ browserName);
		
		if(browserName.equalsIgnoreCase("chrome")) {
//			System.setProperty("webdriver.chrome.driver", "/Users/anilmore/downloads/chromedriver");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
//			System.setProperty("webdriver.gecko.driver", "/Users/anilmore/downloads/geckodriver");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("safari")) {
			 driver = new SafariDriver();
		}
		else {
			System.out.println("Please pass the right browser..." + browserName);
		}
		
		return driver;
	}
	public void launchUrl(String url) {
		if(url == null || url.isEmpty()) {
			System.out.println("url is incorrect");
			return;
	}
		driver.get(url);
		
	}
	public String getPageTitle() {
		return driver.getTitle();
	}
	public String getPageUrl() {
		return driver.getCurrentUrl();
	}
	public void closeBrowser() {
		driver.close();
	}
	public void quitBrowser() {
		driver.quit();
	}
	
		
		
		
	}
	
	
	

