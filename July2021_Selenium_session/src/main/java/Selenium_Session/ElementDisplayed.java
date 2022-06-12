package Selenium_Session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementDisplayed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BrowserUtil br = new BrowserUtil();
		
		WebDriver driver = br.initDriver("chrome");
		br.launchUrl("https://classic.freecrm.com/register/");
		
//		boolean Flag = driver.findElement(By.id("input-email")).isDisplayed();
//		System.out.println(Flag);
//		
//		driver.findElement(By.name("search")).isEnabled();

		WebElement submit = driver.findElement(By.id("submitButton"));
		
		System.out.println(submit.isDisplayed());
		System.out.println(submit.isEnabled());
		
		WebElement agreecheck = driver.findElement(By.name("agreeTerms"));
		System.out.println(agreecheck.isSelected());
		agreecheck.click();
		System.out.println(agreecheck.isSelected());//for checkboxex
		System.out.println(submit.isEnabled());
		System.out.println(submit.isDisplayed());//it is their on page or not

		br.quitBrowser();
				
	}

}
