package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExpWaitForAlerts {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		// driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.findElement(By.name("proceed")).click();

//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		Alert alert = wait.until(ExpectedConditions.alertIsPresent());// its is waitng 10 sec
//		// automatically switched to alert
//		System.err.println(alert.getText());
//		alert.accept();
		
		//acceptAlert(10);
		System.out.println(alertGetText(5));
		driver.switchTo().defaultContent();
	}

	public static Alert waitForJsAlert(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.alertIsPresent());// its is waiting 10 sec
	}
	public static void acceptAlert(int timeOut) {
		waitForJsAlert(timeOut).accept();
	}
	public static void dismissAlert(int timeOut) {
		waitForJsAlert(timeOut).dismiss();
	}
	public static String alertGetText(int timeOut) {
		Alert alert =  waitForJsAlert(timeOut);
		String text = alert.getText();
		alert.accept();
		return text;
	}
	public static void alertSendkeys(int timeOut , String value) {
		waitForJsAlert(timeOut).sendKeys(value);
	}
}
