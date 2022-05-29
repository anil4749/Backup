package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {

	private WebDriver driver;
	
	//1. by locator
	private By emailID=By.xpath("//input[@id='email']");
	private By password=By.xpath("//input[@id='passwd']");
	private By signInButton=By.xpath("//span[normalize-space()='Sign in']");
	private By forgotPWDLink = By.linkText("Forgot your password?");
	private By registraionEmailID=By.xpath("//input[@id='email_create']");
	private By registerButton=By.xpath("//span[normalize-space()='Register']");
	private By createAccButton=By.xpath("//span[normalize-space()='Create an account']");
	
	//2. Constructor of the page class
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public String getLoginPageTitle() {	
		return driver.getTitle();	
	}
	
	public boolean ForgotPwdLinkExist() {
		return driver.findElement(forgotPWDLink).isDisplayed();	
	}
	
	public void enterUserNamme(String username) {
		driver.findElement(emailID).sendKeys(username);	
	}
	
	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
		
	}
	
	public void clickOnLogin() {
		driver.findElement(signInButton).click();
		
	}
	
	public void enterEmailID(String regemailID) {
		driver.findElement(registraionEmailID).sendKeys(regemailID);
	 
	}
	
	public void clickOnCreateAccount(){
		
		driver.findElement(createAccButton).click();
		
		
	}
	public boolean is_register_button_display() throws InterruptedException {
		Thread.sleep(10000);
		return driver.findElement(registerButton).isEnabled();
		
		 
	}
	
	public AccountPage dologin(String un, String pwd) {
		System.out.println("Login with: " + un + " and " + pwd);
		driver.findElement(emailID).sendKeys(un);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(signInButton).click();
		return new AccountPage(driver);
		
		
		
	
		
	}
	
}
