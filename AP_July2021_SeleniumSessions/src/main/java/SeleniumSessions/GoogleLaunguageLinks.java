package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLaunguageLinks {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/index.php?route=account/register");
		
		//By langlinksXpath = By.xpath("//div[@id='SIvCob']/a");
		//doLinkClick(langlinksXpath, "मराठी");
		
		By footers = By.xpath("//footer//a");
		doLinkClick(footers, "Contact Us");

	}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static void doLinkClick(By locator , String linkValue) {
	List<WebElement> linksList = getElements(locator);
	System.out.println(linksList.size());
	for(WebElement e:linksList){
		String text = e.getText();
		System.out.println(text);
			if (text.trim().equals(linkValue)) {
				e.click();
				break;
				
			}
			}
	}
}