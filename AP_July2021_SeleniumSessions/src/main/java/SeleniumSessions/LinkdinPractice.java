package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkdinPractice {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.linkedin.com/home");
		
		driver.findElement(By.xpath("//a[@class='nav__button-secondary']")).click();
		
//		String Text1=driver.findElement(By.id("username")).getText();
//		System.out.println(Text1);
//		
//		String text = driver.findElement(By.id("password")).getText();
//		System.out.println(text);
		
		String text = driver.findElement(By.xpath("//h1")).getText();
		System.out.println(text);
		
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		
//		driver.close();
	}

}
