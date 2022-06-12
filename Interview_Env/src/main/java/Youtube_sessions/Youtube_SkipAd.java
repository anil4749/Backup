package Youtube_sessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Youtube_SkipAd {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.findElement(By.id("search")).sendKeys("me roya");
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(5000);
		WebElement Video = driver.findElement(By.xpath("(//img[@id='img' and @width='360'])[1]"));
		Video.click();
		
		while(driver.findElement(By.id("search")).isDisplayed()) {
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.HOURS);	
		driver.findElement(By.xpath("//div[@id='ad-text:7']")).click();
	
		}
		
		
	}

}
