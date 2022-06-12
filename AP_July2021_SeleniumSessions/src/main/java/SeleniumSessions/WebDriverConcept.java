package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		// Exp wait

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://demoauto.xyz/signin");

		driver.findElement(By.id("email")).sendKeys("admin02@mailinator.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		driver.findElement(By.xpath("//span[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[@title='Add lead']")).click();

//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		WebElement compName = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("company_name")));
//		compName.sendKeys("IBM");
		By comp = By.id("company_name1");
		By vatNum =By.id("vat_number");
				
		waitForElementPresent(comp, 10 , 2000).sendKeys("IBM");
		waitForElementPresent(vatNum, 15).sendKeys("12345");
	}

	public static WebElement waitForElementPresent(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public static WebElement waitForElementPresent(By locator, int timeout , int IntervalTime) {
		WebDriverWait wait = new WebDriverWait(driver, timeout, IntervalTime);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
}
