package Selenium_Session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {
	
	private WebDriver driver;
	
	public ElementUtil(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public void doSendkeys(By locator, String Value) {
			getElement(locator).sendKeys(Value);		
	}

	public void doClick(By locator) {
		getElement(locator).click();
	}
	
	public String doGetText(By locator) {
		return getElement(locator).getText();
	}
	
	public boolean doIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	public boolean doIsEnabled(By locator) {
		return getElement(locator).isEnabled();
	}
	public boolean doIsSelected(By locator) {
		return getElement(locator).isSelected();
	}
	
	public boolean checkElementDisabled(By locator, String attrName) {
		String attrValue = getElement(locator).getAttribute(attrName);
		if(attrValue.equals("true")) {
			return true ;
		}
		return false;
	}
}
