package SeleniumSessions;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://classic.crmpro.com/index.html");
		driver.findElement(By.name("username")).sendKeys("groupautomation");
		driver.findElement(By.name("password")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		Thread.sleep(5000);

		driver.switchTo().frame("mainpanel");
		
		driver.findElement(By.xpath("//a[text()='Contact']")).click();
		
		driver.findElement(By.xpath("//a[text() ='Indra Nan']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
		
		selectContact("Indra Nan");
		selectContact("Harshita Deepak"); 
		System.out.println(getCompanyName("Indra Nan"));
		System.out.println(getCompanyName("Harshita Deepak"));
	}

	public static void selectContact(String contactName) {
	
		String checkBoxXpath = "//a[text() ='"+contactName+"']/parent::td/preceding-sibling::td/input[@type='checkbox']";
		driver.findElement(By.xpath(checkBoxXpath)).click();
	}
	
	public static String getCompanyName(String contactName) {
		String compNameXpath = "//a[text() ='"+contactName+"']/parent::td/preceding-following::td/input[@context='company']";
		return driver.findElement(By.xpath(compNameXpath)).getText();	
	}
}
