package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WDMConcept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		//WebDriverManager.firefoxdriver().setup(); for firefox
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		System.out.println(driver.getTitle());
	}

}
