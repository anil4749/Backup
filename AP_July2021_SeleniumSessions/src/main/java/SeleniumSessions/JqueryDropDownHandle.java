package SeleniumSessions;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDownHandle {

	
	static WebDriver driver;
	public static void main(String[] args) {

		//html tag <select>
		//use select class in selenium
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
	
		driver.findElement(By.id("justAnInputBox")).click();
		
		By choices = By.xpath("//span[@class='comboTreeItemTitle']");
	
		//TC_01 : single selection
		//selectChoice(choices, "choice 1");
		
		//TC_02 : multi selection
//		selectChoice(choices, "choice 6 2 3");
//		selectChoice(choices, "choice 7");
		
//		selectChoice(choices, "choice 1", "choice 2", "choice 2 3", "choice 7");

		//TC_03 : All selection
		selectChoice(choices, "ALL");
	}

	/**
	 * This method used to select the choices from the dropdown and handling all 3 use casees
	 * 1.single selection
	 * 2.multi selection
	 * 3.all selection (pls pass the value as all/ALL/All)
	 * 
	 * @param locator
	 * @param value
	 */
	
	public static void selectChoice(By locator , String... value) {
	
		List<WebElement> choiceList= driver.findElements(locator);
	
		if(!value[0].equalsIgnoreCase("ALL")){
		
		for (int i=0 ; i<choiceList.size(); i++) {
			String text = choiceList.get(i).getText();
			System.out.println(text);
		
			for (int j =0 ; j<value.length ; j++) {
				if(text.equals(value[j])){
					choiceList.get(i).click();
					break;
					}
				}
			}	
		} else {
			//select all choices :
			try {		
				for (WebElement e : choiceList) {
					e.click();
				}
			}catch (Exception e) {
				System.out.println("all choice are selected...");
			} 
		}
	}
}
