package com.qa.opencart.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.opencart.util.Constants;
import com.qa.opencart.util.ElementUtil;

public class AccountsPage {
	
	private WebDriver driver;
	private ElementUtil elementUtil;
	
	private By composeMail = By.xpath("//div[contains(text(),'Compose')]");
	private By toReceiver = By.xpath("//textarea[@id=':6t']");
	private By subjectbody = By.xpath("//input[@id=':7b']");
	private By methodBody = By.xpath("//div[@id=':65']");
	
	private By more = By.xpath("//div[text()='More options']");
	private By label = By.xpath("//div[text()='Label']");	
	private By social = By.xpath("//div[@title='Social']");
	private By send = By.xpath("//div[text()='Send']");
			
	public AccountsPage(WebDriver driver) {
		this.driver= driver;
		elementUtil = new ElementUtil(driver);
	}

	public void composeMail() {
		elementUtil.doClick(composeMail);
	}
	
//	public AccountsPage sendMail(String un) {
//		elementUtil.doSendKeys(toReceiver,un);
//		elementUtil.doSendKeys(subjectbody);
//		elementUtil.doClick(nextLogin);
//		return new AccountsPage(driver);
//	}
	
}
