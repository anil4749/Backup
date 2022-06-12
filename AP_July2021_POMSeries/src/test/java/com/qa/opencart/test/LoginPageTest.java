package com.qa.opencart.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;
import com.qa.opencart.util.Constants;

public class LoginPageTest extends BaseTest {
	
	
	@Test
	public void loginPageTitleTest() {
		String title = loginPage.getLoginPageTitle();
		System.out.println("actual page title is : "+ title);
		Assert.assertEquals(title, Constants.LOGIN_PAGE_TITLE);
	}
	
	@Test
	public void loginPageUrlTest() {
		String url = loginPage.getLoginPageUrl();
		System.out.println("actual page url is : "+ url);
		Assert.assertTrue(url.contains(Constants.LOGIN_PAGE_URL_VALUE));
	}
	
	@Test
	public void forgotPwdLinkTest() {
		Assert.assertTrue(loginPage.isForgotPwdLinkExist());
	}
	
	@Test
	public void registerLinkTest() {
		Assert.assertTrue(loginPage.isRegisterLinkExist());
	}
	
	@Test
	public void loginTest() {
		loginPage.doLogin(prop.getProperty("username").trim(), prop.getProperty("password").trim());
	}
}
