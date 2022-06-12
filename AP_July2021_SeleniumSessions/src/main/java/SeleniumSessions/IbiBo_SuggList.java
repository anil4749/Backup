package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IbiBo_SuggList {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.goibibo.com/");
		
		driver.findElement(By.id("multiCity")).click();

		driver.findElement(By.xpath("//input[@id=\"gosuggest_inputSrc\"][1]")).sendKeys("Hyderabad");
		
		Thread.sleep(2000);		
		
		List<WebElement> options = driver.findElements(By.xpath("//li[@role='option']"));
		System.out.println("Total Options : "+options.size());
				
		for(WebElement e: options) {
			String text = e.getText();
				if (text.equals("Bidar, India(IXX)\n"
						+ "Bidar\n"
						+ "IN\n"
						+ "  (127 KMs from Hyderabad, India)")) {
					e.click();
					System.out.println("Option Selected :"+text);
					break;
				}
		}
	}

}
