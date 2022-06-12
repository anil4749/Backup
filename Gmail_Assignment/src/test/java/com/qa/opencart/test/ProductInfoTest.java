package com.qa.opencart.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;
import com.qa.opencart.util.Constants;

public class ProductInfoTest extends BaseTest {
	
	@BeforeClass
	public void productInfoPageSetup() {
		accPage = loginPage.doLogin(prop.getProperty("username").trim(), prop.getProperty("password").trim());
	}
	
	@Test
	public void productHeaderTest() {
	//	resultsPage = accPage.doSearch("macbook");
		productInfoPage = resultsPage.selectProduct("MacBook Pro");
		String actHeader = productInfoPage.getProductHeaderText();
		Assert.assertEquals(actHeader, "MacBook Pro");
	}
	
	@DataProvider
	public Object[][] getImageData() {
		return new Object[][] {
			{"macbook","MacBook Pro",4},
			{"iMac","iMac",3},
			{"Apple","Apple Cinema 30\"",6},
		};
	}
	@Test(dataProvider = "getImageData")
	public void productImageCountTest(String productName ,String mainProductName ,int imageCount) {
	//	resultsPage = accPage.doSearch(productName);
		productInfoPage = resultsPage.selectProduct(mainProductName);
		Assert.assertEquals(productInfoPage.getProductImageCount(), imageCount);
	}
}
