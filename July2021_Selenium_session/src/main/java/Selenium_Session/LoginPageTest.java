package Selenium_Session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageTest {

	public static void main(String[] args) {

		BrowserUtil br = new BrowserUtil();
		
		WebDriver driver = br.initDriver("chrome");
		br.launchUrl("https://demo.opencart.com/index.php?route=account/login");
		System.out.println(br.getPageTitle());
		
		By emailId = By.id("input-email");
		By password = By.id("input-password");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendkeys(emailId, "patilamolentc");
		eleUtil.doSendkeys(password, "123");
		
		br.quitBrowser();
		
	}

}
