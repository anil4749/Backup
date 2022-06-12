package com.qa.opencart.Pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import com.qa.opencart.Utils.ElementUtil;

public class LoginPage {
	
	private WebDriver driver;//this webdriver is used for this particular class
	private ElementUtil elementUtil;
	
	//1.By locators - PO -OR 
	//2. ALL THE LOCATORS SHOULD BE PRIVATE IN NATURE
	
	private By emailId = By.id("input-email");
	private By password = By.id("input-password");
	private By loginBtn = By.xpath("//input[@value='Login']");
	private By forgotPwdLink = By.linkText("Forgotten Password");
	private By registerLink = By.linkText("Register");
	
	
	//2. Page Constructor :
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(driver);
	}
		
	//3. Page actions/methods/features:
		
		public String getLoginPageTitle() {
			return driver.getTitle();
		}
		
		public String getLoginPageUrl() {
			return driver.getCurrentUrl();
		}
		public boolean isForgotPwdLinkExists() {
		return elementUtil.doIsDiplayed(forgotPwdLink);
	}
		public boolean isRegisterLinkExists() {
			return elementUtil.doIsDiplayed(registerLink);
		}
		public void doLogin(String un , String pwd) {
			
			elementUtil.doSendKeys(emailId, un);
			elementUtil.doSendKeys(password, pwd);
			elementUtil.doClick(loginBtn);
		}	
	
}
