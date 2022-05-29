package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountPage {
	
	
	private WebDriver driver;
	private By accountSections = By.cssSelector("div#center_column span");
	
	public AccountPage(WebDriver driver) {
		
		this.driver=driver;
	}

	public int get_accountSectionCount() {
		
		return driver.findElements(accountSections).size();
		
	}
	public String getAccountPageTitle() {
		
		return driver.getTitle();
	}
		
	public List<String> getAccountSectionList() {
		
		List<String> accountList=new ArrayList<>();
		List<WebElement>accountHeadersList= driver.findElements(accountSections);
		
		for(WebElement e:accountHeadersList)
		{
			String text = e.getText();
			System.out.println(text);
			accountList.add(text);	
		}
		return accountList;
		
	}
	
}
