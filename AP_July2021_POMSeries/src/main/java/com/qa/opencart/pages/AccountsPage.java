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
	
	private By search = By.name("search");
	private By searchIcon = By.cssSelector("div#search span");
	private By logoutLink = By.linkText("Logout");
	private By accSecsHeaders = By.cssSelector("div#content h2");
			
	public AccountsPage(WebDriver driver) {
		this.driver= driver;
		elementUtil = new ElementUtil(driver);
	}
	
	public String geAccPageTitle() {
		return elementUtil.waitForTitleToBe(Constants.DEFAULT_TIME_OUT, Constants.ACC_PAGE_TITLE);
	}
	
	public boolean isLogoutLinkExist() {
		return elementUtil.doIsDiplayed(logoutLink);
	}
	
	public boolean isSearchFieldExist() {
		return elementUtil.doIsDiplayed(search);
	}
	
	public List<String> getAccountSecList() {
		List<WebElement> secList = elementUtil.getElements(accSecsHeaders);
		List<String> secHeaderList = new ArrayList<>();
		for (WebElement e : secList) {
			secHeaderList.add(e.getText());
		}
		return secHeaderList;
	}
	
	public ResultsPage doSearch(String productname) {
		System.out.println("product name : "+ productname);
		elementUtil.doSendKeys(search, productname);
		elementUtil.doClick(searchIcon);
		return new ResultsPage(driver);
	}

}
