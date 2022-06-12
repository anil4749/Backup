package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import base.Base;

public class LoginPage extends Base {

	public LoginPage(WebDriver rDriver) {
		super(rDriver);
		
	}


@FindBy(id="Email")
@CacheLookup
WebElement txtEmail;

@FindBy(id="Password")
@CacheLookup
WebElement txtPassword;

@FindBy(xpath ="input[@value='Log in']")
@CacheLookup
WebElement btnlogin;

@FindBy(linkText ="logout")
@CacheLookup
WebElement lnklogout;




public void setUsername(WebElement txtEmail) {
	this.txtEmail = txtEmail;
}

public void setPassword(WebElement txtPassword) {
	this.txtPassword = txtPassword;
}

public void clickLogin(WebElement btnlogin) {
	this.btnlogin = btnlogin;
}

public void clicklogout(WebElement lnklogout) {
	this.lnklogout = lnklogout;
}










}
