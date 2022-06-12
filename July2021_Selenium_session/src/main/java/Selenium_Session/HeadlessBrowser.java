package Selenium_Session;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessBrowser {

	public static void main(String[] args) {

		//headless --> browser options-->It will not launch the browser,but it will block the visibility(display)
		//GhostDriver + PhantomJs --> headless --> html page source of the app
		//HtmlUnitDriver --> headless--> html page source of the app
		
		//testing is happening behind the scene
		//faster than the UI mode
		//headless is not recommended for complex app/pop-ups/mouse movement
		//recommended for sanity test cases(15-20 tcs)
		
		//headless --non UI mode
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--headless");
//		co.addArguments("--igcognito");
		
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.amazon.in");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.quit();
		
		
		
		
		
	}

}
