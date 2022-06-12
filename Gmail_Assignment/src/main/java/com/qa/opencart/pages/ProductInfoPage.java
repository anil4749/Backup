package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.util.Constants;
import com.qa.opencart.util.ElementUtil;

public class ProductInfoPage {
	
	private WebDriver driver;
	private ElementUtil elementUtil;
	
	private By productHeader =By.cssSelector("div#content h1");
	private By productImages =By.cssSelector("ul.thumbnails img");
	private By quantity = By.id("input-quantity");
	private By addToCartBtn = By.id("button-cart");
	
	public ProductInfoPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(driver);
	}
	
	public String getProductHeaderText() {
		return elementUtil.doGetText(productHeader);
	}
	
	public int getProductImageCount() {
		return elementUtil.waitForElementsVisible(productImages, Constants.DEFAULT_TIME_OUT).size();
	}
}
