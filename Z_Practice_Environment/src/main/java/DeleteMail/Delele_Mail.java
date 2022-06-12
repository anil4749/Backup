package DeleteMail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Delele_Mail {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new SafariDriver();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?hl=en&passive=true&continue=https%3A%2F%2Fwww.google.co.in%2F%3Fclient%3Dsafari%26channel%3Dmac_bm&ec=GAZAmgQ&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		WebElement id=driver.findElement(By.xpath("//*[@id=\'yDmH0d\']"));
		Thread.sleep(5000);
		id.sendKeys("moreanil633@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("password")).sendKeys("Anilme@1993");
		Thread.sleep(5000);
		driver.findElement(By.id("passwordNext")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("gbwa")).click();
		driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div/c-wiz/div/div/ul[1]/li[7]/a/div[5]/span"));
	}

}
