import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MorningStart {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://timesofindia.indiatimes.com/");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement business=driver.findElement(By.xpath("//a[contains(@class,'_1o69u  null')][normalize-space()='Business']"));
		Actions action=new Actions(driver);
		action.moveToElement(business).perform();
		
		//WebElement vdElement=driver.findElement(By.xpath("//div[contains(@class,'c5eZV')]//div//figcaption[contains(@class,'')][contains(text(),'Sensex crashes 1,017 points dragged by IT, financi')]"));
		//action.moveToElement(vdElement).build().perform();
		
		//action.keyDown("ssddd").click();
		System.out.println(driver.getTitle());
	 
	}

}
