package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitlyWaitConcept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// imp wait : applied on webdriver ref
		// dynamic wait

		// Its only applicable for web elements

		// it is global wait -- it will applied on all the web elements by default
		// timeout -- 10 secs --> selenium is going to wait until 10 secs , if the
		// element
		// not present on the page , then selenium will thro exception :
		// NoSuchElementException

		// it the element is found within 5 secs --> rest 5 secs will be ignored
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://demoauto.xyz/signin");

		driver.findElement(By.id("email")).sendKeys("admin02@mailinator.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		driver.findElement(By.xpath("//span[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[@title='Add lead']")).click();
		driver.findElement(By.id("company_name")).sendKeys("IBM");

	}

}
