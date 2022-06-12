package SeleniumSessions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementClickWithWAIT {
	
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
		driver.get("https://demoauto.xyz/signin");

		driver.findElement(By.id("email")).sendKeys("admin02@mailinator.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		By leads = By.xpath("//span[text()='Leads']");
		By addLeads = By.xpath("//a[@title='Add lead']");
		By compName = By.id("company_name");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.clickWhenReady(leads, 5);
		eleUtil.clickWhenReady(addLeads, 10);
		eleUtil.waitForElementVisible(compName, 5).sendKeys("IBM");
		
//		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
//		By signinLink = By.name("proceed");
//		
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.clickWhenReady(signinLink, 5);
//		
	}

}
