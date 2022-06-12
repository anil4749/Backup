package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.util.ElementUtil;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class LoginPage {
	
	private WebDriver driver;//here driver is just holding parameter (Null Driver)
	private ElementUtil elementUtil;
	
	//1.By Locators :- Object Repository :- Page Objects
	//all locators should be private in nature
	private By emailId =  By.id("input-email");
	private By password =  By.id("input-password");
	private By loginButton =  By.xpath("//input[@value='Login']");
	private By forgotPwdLink = By.linkText("Forgotten Password");
	private By registerLink = By.linkText("Register");

	
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
	public boolean isForgotPwdLinkExist() {
		return elementUtil.doIsDiplayed(forgotPwdLink);
	}
	
	public boolean isRegisterLinkExist() {
		return elementUtil.doIsDiplayed(registerLink);
	}
	
	public AccountsPage doLogin(String un , String pwd) {
		elementUtil.doSendKeys(emailId,un);
		elementUtil.doSendKeys(password, pwd);
		elementUtil.doClick(loginButton);
		return new AccountsPage(driver);
	}
	
	public RegistrationPage navigateToRegisterPage() {
		elementUtil.doClick(registerLink);
		return new RegistrationPage(driver);
	}
}
