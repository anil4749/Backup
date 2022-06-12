package Selenium_Session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RagisterPageTest {

	public static void main(String[] args) {

		BrowserUtil br = new BrowserUtil();
		
		WebDriver driver = br.initDriver("chrome");
		br.launchUrl("https://demo.opencart.com/index.php?route=account/register");
		System.out.println(br.getPageTitle());
		
		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By emailId = By.id("input-email");
		By telephone = By.id("input-telephone");
		By password = By.id("input-password");
		By confirmPw = By.id("input-confirm");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		
		eleUtil.doSendkeys(firstName, "Amol");
		eleUtil.doSendkeys(lastName, "Patil");
		eleUtil.doSendkeys(emailId, "patilamolentc");
		eleUtil.doSendkeys(telephone, "8369996243");
		eleUtil.doSendkeys(password, "123");
		eleUtil.doSendkeys(confirmPw, "123");
		
		br.quitBrowser();
		
	}

}
