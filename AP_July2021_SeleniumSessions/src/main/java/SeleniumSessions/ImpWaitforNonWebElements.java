package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImpWaitforNonWebElements {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		System.out.println(driver.getTitle());
		
		//alerts , title and Urls --with impl wait not allowed
	
		//Impl wait bad approach
		
	}

}
