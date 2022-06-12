package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Oracle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Website Link: https://www.saucedemo.com/ 
//
//			Login to the website using given credentials .Check whether login is successful or not?
//
//			User/Password: standard_user/secret_sauce (Expected Result: Login successful)
//			User/Password: standard_user1/secret_sauce(Expected Result: Login failed.)
//		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		
	}

}
