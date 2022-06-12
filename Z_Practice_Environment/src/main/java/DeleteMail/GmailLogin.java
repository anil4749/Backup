package DeleteMail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
public class GmailLogin{
   public static void main(String[] args) {
	   
	   //WebDriverManager.chromedriver().setup();
      System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver_win32\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      //implicit wait
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      //URL launch
      driver.get("https://accounts.google.com/signin");
      //identify email
      WebElement l = driver
      .findElement(By.name("identifier"));
      l.sendKeys("moreanil633@gmail.com");
      WebElement b = driver
      .findElement(By.className("VfPpkd-LgbsSe"));
      b.click();
      //identify password
      WebElement p = driver
      .findElement(By.name("password"));
      p.sendKeys("Anilme@1993");
      b.click();
      //close browser
      driver.close();
   }
}