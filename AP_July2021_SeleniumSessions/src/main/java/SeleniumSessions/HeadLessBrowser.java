package SeleniumSessions;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessBrowser {

	public static void main(String[] args) {

		//headless -->Browser options-->it will launch the browser,but it will block the visibility(display)
		//HtmlUnitDriver --> Headless->Html page source of the app
	
		//testing is happening behind the scene
		//faster than the UI mode(bcz there is no UI)
		//Headless mode is not recommended for complex app/op-up/mouse movement not works
		
		//headless -- non UI mode
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--headless");
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.facebook.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.quit();
		
		//SearchContext sc = new ChromeDriver();//Valid Top Casting
		//RemoteWebDriver dr = new ChromeDriver();//Valid
		//ChromeDriver dr = new ChromeDriver();Not recommended bcaz its valid only chrome
		
		//SearchContext dr = new RemoteWebDriver();//Valid-but not recomm
		
		
	}

}
