package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForFrame {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("http://www.londonfreelance.org/courses/frames/index.html");

//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("main"));
		
		//waitForFrameUsingIDorName("main", 5);
		By frameLocator = By.name("main");
		waitForFrameUsingByLocator(frameLocator, 5);
		
		String header = driver.findElement(By.xpath("html/body/h2")).getText();
		System.out.println(header);
		driver.switchTo().defaultContent();
		
		//38.44
	}
	
	public static void waitForFrameUsingIDorName(String frameIDorName , int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIDorName));
	}

	public static void waitForFrameUsingIndex(String frameIndex , int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));
	}
	
	public static void waitForFrameUsingByLocator(By frameLocator , int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
	}
	
}
