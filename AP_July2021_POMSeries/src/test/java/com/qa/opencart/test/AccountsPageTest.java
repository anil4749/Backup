package com.qa.opencart.test;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;
import com.qa.opencart.util.Constants;

public class AccountsPageTest extends BaseTest {

	@BeforeClass
	public void accPageSetup() {
		accPage = loginPage.doLogin(prop.getProperty("username").trim(), prop.getProperty("password").trim());
	}
	
	@Test
	public void accPageTitleTest() {
		String title = accPage.geAccPageTitle();
		System.out.println("Acc page title is : "+ title);
		Assert.assertEquals(title, Constants.ACC_PAGE_TITLE);
	}
	
	@Test
	public void accPageLogoutLinkTest() {
		Assert.assertTrue(accPage.isLogoutLinkExist());
	}

	@Test
	public void accPageSearchTest() {
		Assert.assertTrue(accPage.isSearchFieldExist());
	}
	
	@Test
	public void accPageSecHeaderTest() {
		List<String> actSecList = accPage.getAccountSecList();
		System.out.println(actSecList);
		Assert.assertEquals(actSecList, Constants.EXP_ACCOUNTS_SECTION_LIST);
	}
	
	
	@DataProvider // Return type 2D object array
	public Object[][] productData() {
		return new Object[][] {
			{"macbook"},
			{"iMac"},
			{"Apple"},
		};
	}
	
	
	@Test(dataProvider ="productData")
	public void searchTest(String productName) {
		resultsPage = accPage.doSearch(productName);
		Assert.assertTrue(resultsPage.getSearchProductListCounts()>0);
		 
	}
	
	@DataProvider // Return type 2D object array
	public Object[][] productSelectData() {
		return new Object[][] {
			{"macbook","MacBook Pro"},
			{"iMac","iMac"},
			{"Apple","Apple Cinema 30\""},
		};
	}
	
	@Test(dataProvider = "productSelectData")
	public void selectProductTest(String productName,String mainProductName) {
		resultsPage = accPage.doSearch(productName);
		resultsPage.selectProduct(mainProductName);
	}
}




