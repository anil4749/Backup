package com.qa.opencart.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.Utils.Constants;
import com.qa.opencart.base.BaseTest;


//NEVER EVER USE DRIVER.FINDELEMENT IN TEST PAGE
public class LoginPageTest extends BaseTest {
	
	@Test
	public void loginPageTileTest() {
		String title = loginPage.getLoginPageTitle();
		System.out.println("act page title is " + title);
		Assert.assertEquals(title, Constants.LOGIN_PAGE_TITLE);
		
	}
	@Test
	public void loginPageUrlTest() {
	String url = loginPage.getLoginPageUrl();
	System.out.println("act page url is " + url);
	Assert.assertTrue(url.contains(Constants.LOGIN_PAGE_URL_VALUE));
	}
	
	@Test
	public void forgotPwdLinkTest() {
		loginPage.isForgotPwdLinkExists();
		Assert.assertTrue(loginPage.isForgotPwdLinkExists());
	}
	
	@Test
	public void registerLinkTest() {
		Assert.assertTrue(loginPage.isRegisterLinkExists());
	}
	
	@Test
	public void loginTest() {
		loginPage.doLogin("naveenanimation20@gmail.com", "Selenium@12345");
	}
}


