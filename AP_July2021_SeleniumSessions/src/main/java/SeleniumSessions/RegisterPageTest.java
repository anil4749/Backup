package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPageTest {

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

		eleUtil.doSendKeys(firstName, "Amol");
		eleUtil.doSendKeys(lastName, "Patil");
		eleUtil.doSendKeys(emailId, "patilamolentc");
		eleUtil.doSendKeys(telephone, "8369996243");
		eleUtil.doSendKeys(password, "123");
		eleUtil.doSendKeys(confirmPw, "123");

		br.quitBrowser();

	}

}
