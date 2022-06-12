package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Gmail_Auto {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/gmail/about/");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("patilamolentc@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Amol@1994");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Search mail']")).sendKeys("has:attachment");
		driver.findElement(By.xpath("(//*[name()='path'])[9]")).click();
		driver.findElement(By.xpath("(//div[@class='HY'])[2]")).click();
		
		//for *
		//span[@id=':f3']
	}

}
