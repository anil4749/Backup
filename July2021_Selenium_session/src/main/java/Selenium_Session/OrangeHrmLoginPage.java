package Selenium_Session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHrmLoginPage {

	public static void main(String[] args) {

		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.initDriver("chrome");
		br.launchUrl("https://www.orangehrm.com/orangehrm-30-day-trial");
		System.out.println(br.getPageTitle());
		
		By domain = By.id("Form_submitForm_subdomain");
		By name = By.id("Form_submitForm_Name");
		By emailId = By.id("Form_submitForm_Email");
		By phoneNo = By.id("Form_submitForm_Contact");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		
		eleUtil.doSendkeys(domain, "abc.com");
		eleUtil.doSendkeys(name, "Amol");
		eleUtil.doSendkeys(emailId, "patilamolentc");
		eleUtil.doSendkeys(phoneNo, "8369996243");
		
		br.quitBrowser();
		
		
	}

}
