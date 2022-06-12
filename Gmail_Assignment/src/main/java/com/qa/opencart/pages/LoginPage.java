package com.qa.opencart.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.util.ElementUtil;


public class LoginPage {
	
	private WebDriver driver;//here driver is just holding parameter (Null Driver)
	private ElementUtil elementUtil;
	
	//1.By Locators :- Object Repository :- Page Objects
	//all locators should be private in nature
	private By signIn = By.linkText("Sign in");
	private By emailId =  By.xpath("//input[@type='email']");
	private By next = By.xpath("//span[text()='Next']");
	private By password =  By.xpath("//input[@type='password']");
	private By nextLogin= By.xpath("//span[text()='Next']");
	
	private By composeMail = By.xpath("//div[contains(text(),'Compose')]");
	private By toReciever = By.xpath("//textarea[@id=':6t']");
	private By subjectbody = By.xpath("//input[@id=':7b']");
	private By methodBody = By.xpath("//div[@id=':65']");
	
	private By more = By.xpath("//div[text()='More options']");
	private By label = By.xpath("//div[text()='Label']");	
	private By social = By.xpath("//div[@title='Social']");
	private By send = By.xpath("//div[text()='Send']");
	

	//2. Page Constructors
	
	public LoginPage(WebDriver driver) {
	this.driver =driver;
	elementUtil = new ElementUtil(driver);
	}
	
	//3. page actions/methods/features:
	
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	public String getLoginPageUrl() {
		return driver.getCurrentUrl();
	}
	
	public AccountsPage doLogin(String un , String pwd) {
		elementUtil.doSendKeys(emailId,un);
		elementUtil.doClick(next);
		elementUtil.doSendKeys(password, pwd);
		elementUtil.doClick(nextLogin);
		return new AccountsPage(driver);
	}
	
//	public RegistrationPage navigateToRegisterPage() {
//		elementUtil.doClick(registerLink);
//		return new RegistrationPage(driver);
//	}
}
