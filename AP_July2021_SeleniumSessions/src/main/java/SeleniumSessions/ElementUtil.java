package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {

	private WebDriver driver;

	public ElementUtil(WebDriver driver) { // Maintaining Constructor
		this.driver = driver;
	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public void doClick(By locator) {
		getElement(locator).click();
	}

	public void doActionsSendKeys(By locator, String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).perform();
	}

	public void doActionsClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).perform();
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

	public String doGetAttribute(By locator, String attrName) {
		return getElement(locator).getAttribute(attrName);
	}

	public boolean checkElementDisable(By locator, String attrName) {
		String attrVal = getElement(locator).getAttribute(attrName);
		if (attrVal.equals("true")) {
			return true;
		}
		return false;
	}

	public void doLinkClick(By locator, String linkValue) {
		List<WebElement> linksList = getElements(locator);
		System.out.println(linksList.size());
		for (WebElement e : linksList) {
			String text = e.getText();
			System.out.println(text);
			if (text.trim().equals(linkValue)) {
				e.click();
				break;

			}
		}
	}

	public boolean checkElementDisplayed(By locator) {
		if (getElements(locator).size() == 1)
			return true;
		return false;
	}

	public boolean checkElementDisplayed(By locator, int eleOccurrence) {
		if (getElements(locator).size() == eleOccurrence)
			return true;
		return false;
	}

	/****************************************
	 * drop down utils
	 *******************************************/

	public void doSelectByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}

	public boolean doSelectByVisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
		return isDropDownValueSelected(select, text);
	}

	public boolean doSelectByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(value);
		return isDropDownValueSelected(select, value);
	}

	public boolean isDropDownValueSelected(Select select, String expValue) {
		if (select.getFirstSelectedOption().getText().equals(expValue)) {
			System.out.println(expValue + ": is selected");
			return true;
		}
		return false;
	}

	public void doSelectDropDown(By locator, String value) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		iterateDropDownAndSelect(optionsList, value);
	}

	public void selectDropDownWithoutSelect(By locator, String value) {
		List<WebElement> optionsList = getElements(locator);
		iterateDropDownAndSelect(optionsList, value);
	}

	private void iterateDropDownAndSelect(List<WebElement> optionsList, String value) {
		System.out.println("total options : " + optionsList.size());
		for (WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals(value)) {
				e.click();
				break;
			}
		}
	}

//*****Google Search List suggestion Box******//

	public void googleSearchSelect(By search, By suggestion, String searchKey, String value)
			throws InterruptedException {
		getElement(search).sendKeys(searchKey);

		Thread.sleep(2000);// 2 sec

		List<WebElement> suggList = getElements(suggestion);
		System.out.println(suggList.size());

		for (WebElement e : suggList) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals(value)) {
				e.click();
				break;
			}
		}
	}

	/**** Mutli Selection Dropdown ****/

	// TC_01 : single selection
	// selectChoice(choices, "choice 1");

	// TC_02 : multi selection
//	selectChoice(choices, "choice 6 2 3");
//	selectChoice(choices, "choice 7");

//	selectChoice(choices, "choice 1", "choice 2", "choice 2 3", "choice 7");

	// TC_03 : All selection
	// selectChoice(choices, "ALL");

	/**
	 * This method used to select the choices from the dropdown and handling all 3
	 * use casees 1.single selection 2.multi selection 3.all selection (pls pass the
	 * value as all/ALL/All)
	 * 
	 * @param locator
	 * @param value
	 */

	public void selectChoice(By locator, String... value) {

		List<WebElement> choiceList = getElements(locator);

		if (!value[0].equalsIgnoreCase("ALL")) {

			for (int i = 0; i < choiceList.size(); i++) {
				String text = choiceList.get(i).getText();
				System.out.println(text);

				for (int j = 0; j < value.length; j++) {
					if (text.equals(value[j])) {
						choiceList.get(i).click();
						break;
					}
				}
			}
		} else {
			// select all choices :
			try {
				for (WebElement e : choiceList) {
					e.click();
				}
			} catch (Exception e) {
				System.out.println("all choice are selected...");
			}
		}
	}

	/**************** Action Class Utils *****************/

	public void parentChildMenuHandle(By parent, By child) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(parent)).build().perform();
		Thread.sleep(2000);
		doClick(child);
	}

	public int rightClickItemsCount(By rightClick, By items) {
		return getRightClickList(rightClick, items).size();
	}

	public void clickOnRightClickItem(By rightClick, By items, String Value) {
		Actions act = new Actions(driver);
		act.contextClick(getElement(rightClick)).build().perform();
		List<WebElement> menuList = getElements(items);
		for (WebElement e : menuList) {
			if (e.getText().equals(Value)) {
				e.click();
				break;
			}
		}

	}

	/**
	 * 
	 * @param rightClick
	 * @param items
	 * @return
	 */

	public List<String> getRightClickList(By rightClick, By items) {

		List<String> itemValueList = new ArrayList<String>();

		Actions act = new Actions(driver);
		act.contextClick(getElement(rightClick)).build().perform();

		List<WebElement> menuList = getElements(items);
		System.out.println(menuList.size());

		for (WebElement e : menuList) {
			String text = e.getText();
			// System.out.println(text);
			itemValueList.add(text);
		}
		return itemValueList;
	}

	/**********************************
	 * wait utils
	 ************************************/

	public Alert waitForJsAlert(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.alertIsPresent());// its is waiting 10 sec
	}

	public void acceptAlert(int timeOut) {
		waitForJsAlert(timeOut).accept();
	}

	public void dismissAlert(int timeOut) {
		waitForJsAlert(timeOut).dismiss();
	}

	public String alertGetText(int timeOut) {
		Alert alert = waitForJsAlert(timeOut);
		String text = alert.getText();
		alert.accept();
		return text;
	}

	public void alertSendkeys(int timeOut, String value) {
		waitForJsAlert(timeOut).sendKeys(value);
	}

	public boolean waitForUrlContains(String urlFractionString, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.urlContains(urlFractionString));
	}

	public boolean waitForUrlToBe(String urlValue, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.urlContains(urlValue));
	}

	public String waitForTitleContains(int timeout, String titleFraction) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		if (wait.until(ExpectedConditions.titleContains(titleFraction))) {
			return driver.getTitle();
		}
		return null;
	}

	public String waitForTitleToBe(int timeout, String title) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		if (wait.until(ExpectedConditions.titleIs(title))) {
			return driver.getTitle();
		}
		return null;
	}

	public void waitForFrameUsingIDorName(String frameIDorName, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIDorName));
	}

	public void waitForFrameUsingIndex(String frameIndex, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));
	}

	public void waitForFrameUsingByLocator(By frameLocator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
	}

	public void waitForElementPresent(WebElement frameElement, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameElement));
	}
	
	public List<WebElement> waitForElementPresence(By locator , int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	}
	
	public List<String> getElementsTextList(By locator , int timeOut) {
		List<WebElement> eleList = waitForElementPresence(locator, timeOut);
		List<String> eleValList = new ArrayList<String>();
		for (WebElement e : eleList) {
			eleValList.add(e.getText());
		}
		return eleValList;
	}
	
	public void printElementsTextList(By locator , int timeOut) {
		List<WebElement> eleList = waitForElementPresence(locator, timeOut);
		for (WebElement e : eleList) {
		System.out.println(e.getText());
		}
	}
	
	public List<WebElement> waitForElementsVisible(By locator , int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}

	/**
	 * An expectation for checking that an element is present on the DOM of a page.
	 * This does not necessarily mean that the element is visible.
	 * 
	 * @param locator
	 * @param timeout
	 * @return
	 */

	public WebElement waitForElementPresent(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	public WebElement waitForElementPresent(By locator, long timeout, long IntervalTime) {
		WebDriverWait wait = new WebDriverWait(driver, timeout, IntervalTime);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	/**
	 * An expectation for checking that an element is present on the DOM of a page
	 * and visible. Visibility means that the element is not only displayed but also
	 * has a height and width that is greater than 0.
	 * 
	 * 
	 * @param locator
	 * @param timeOut
	 */
	public WebElement waitForElementVisible(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public WebElement waitForElementToClickable(By locator , int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	public void clickWhenReady(By locator , int timeOut) {
		waitForElementToClickable(locator, timeOut).click();
	}
	
}
