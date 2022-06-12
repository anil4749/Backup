package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementDisplayed {

	public static void main(String[] args) {

		BrowserUtil br = new BrowserUtil();
		
		WebDriver driver = br.initDriver("chrome");
		//br.launchUrl("https://demo.opencart.com/index.php?route=account/login");
		//br.launchUrl("https://www.classic.freecrm.com/register/");
		br.launchUrl("https://api.cogmento.com/register/");
		
		//boolean flag = driver.findElement(By.id("input-email")).isDisplayed();
		//System.out.println(flag);
		
		//boolean flag1 = driver.findElement(By.name("search")).isEnabled();
		//System.out.println(flag1);
		
		WebElement submit = driver.findElement(By.id("//*[@id=\"recaptcha-anchor\"]/div[1]"));
		System.out.println(submit.isDisplayed());
		System.out.println(submit.isEnabled());
		
		WebElement agreechk = driver.findElement(By.name("terms"));
		System.out.println(agreechk.isSelected());
		agreechk.click();
		System.out.println(agreechk.isSelected());
		System.out.println(submit.isEnabled());
		
	}

}



