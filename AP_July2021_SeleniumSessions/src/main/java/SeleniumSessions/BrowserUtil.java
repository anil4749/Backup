package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 * @author AmolPatil
 *
 */
public class BrowserUtil {//Press Command O for checking all methods

	public WebDriver driver;//webdriver reference
	
	/**
	 * This method is used to init driver on the basis of given browser name
	 * @param browserName
	 * @return its returns the driver name
	 */
	
	public WebDriver initDriver(String browserName) {
		
		System.out.println("browser name is : "+ browserName);
		
		if(browserName.equalsIgnoreCase("chrome")) {
			//System.setProperty("webdriver.chrome.driver", "/Users/anilmore/downloads/chromedriver");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			//System.setProperty("webdriver.gecko.driver", "/Users/anilmore/downloads/geckodriver");
			WebDriverManager.firefoxdriver().setup();
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		}
		else {
			System.out.println("Please pass the right browser..."+ browserName);
		}
		
		return driver;
	}
	
	public void launchUrl(String url) {
		if(url==null || url.isEmpty()) {
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
	
	public void navigateBack() {
		driver.navigate().back();
	}
	
	public void navigateForward() {
		driver.navigate().forward();
	}
}


















