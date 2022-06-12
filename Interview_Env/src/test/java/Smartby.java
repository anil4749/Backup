
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Document;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Smartby {
	
	static WebDriver driver;
	static String month="June";
	static int date=20;
    static String month1;
    static String currentMonth1;
    static String nextMonth1;

	public static void main(String[] args) throws InterruptedException {
		
	      
		    
		    
	    	WebDriverManager.chromedriver().setup();

	        driver = new ChromeDriver();
	         
	        driver.manage().window().maximize();
	        
	        driver.get("https://offers.smartbuy.hdfcbank.com/");
	        
	        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	        
	        //button to open calendar
	        driver.findElement(By.id("close_cookie")).click();
	        driver.findElement(By.xpath("//button[@onclick=\"return opendisclaimerModalNew();\"]")).click();
	        WebElement departureDate = driver.findElement(By.id("flightdeparture"));
	        WebElement returnDate = driver.findElement(By.xpath("//input[@id='flightreturn']"));
	        WebElement search = driver.findElement(By.xpath("//div[@class='col-md-7 btn-flightsearch']//span[contains(text(),'Search')]"));
	        WebElement trip = driver.findElement(By.xpath("//label[normalize-space()='One-way']"));
	        WebElement sourceDropdown = driver.findElement(By.xpath("//input[@id='flightfrom']"));
	        WebElement destinationDropdown = driver.findElement(By.xpath("//input[@id='flightto']"));
	        ////label[@for='flightOneway'] 
	     
	        String d_date="13 Nov 2022";
	        String r_date="15 Nov 2022";
	        
	        JavascriptExecutor jse = (JavascriptExecutor)driver;
	        trip.click();
	        sourceDropdown.click();
	        
	        WebDriverWait wait = new WebDriverWait(driver, 30);
	        WebElement el= wait.until(ExpectedConditions.elementToBeClickable(sourceDropdown));
	        el.click();
	        el.sendKeys("testeddata");
	        Thread.sleep(1000);
	        el.sendKeys(Keys.DELETE);
	        el.sendKeys("mumbai");
	        Thread.sleep(5000);
	        el.sendKeys(Keys.ARROW_DOWN);
	        el.sendKeys(Keys.ENTER);
	        WebElement el2= wait.until(ExpectedConditions.elementToBeClickable(destinationDropdown));
	        el2.click();
	        el2.sendKeys("testeddata");
	        Thread.sleep(1000);
	        el2.sendKeys(Keys.DELETE);
	        el2.sendKeys("Indore");
	        Thread.sleep(5000);
	        el2.sendKeys(Keys.ARROW_DOWN);
	        el2.sendKeys(Keys.ENTER);
	   
	        jse.executeScript("document.getElementById('flightdeparture').value = arguments[0]", d_date);
	        jse.executeScript("document.getElementById('flightreturn').value = arguments[0]", r_date);
		 
		    search.click();
		    WebElement iAccept = driver.findElement(By.xpath("//a[@class='btn-normal btn-animated']"));
		 
		    iAccept.click();
		  
	    
	    
}
	    
	    
	        //smartby.selectDate(month1,date);
	   
	   
	    //driver.quit();
	    
	        
	    
	public void selectDate(String month1, int date) throws InterruptedException {
		
	if (currentMonth1.contains(month1) || nextMonth1.contains(month1)) {
		try {
		    driver.findElement(By.xpath(month1)).click();
		    
		    }
		catch (Exception NoSuchElementException ) {
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
				System.out.println("loop");
				selectDate(month1,date);
				
			}
		date=date-2;

		String date1="(//td[@data-handler='selectDay'])[" +date +"]";//(//td[@data-handler='selectDay'])[12]
		
		
		////a[normalize-space()='1']
		////a[@class='ui-state-default'][normalize-space()='3']
		//(//a[@href='#'][normalize-space()='4'])[2]
		//(//a[@class='ui-state-default'][normalize-space()='5'])
		//(//a[@class='ui-state-default'][normalize-space()='5'])
		//(//a[@class='ui-state-default'][normalize-space()='11'])[2]
		////a[@class='ui-state-default'][normalize-space()='3']
		System.out.println(date1);
		driver.findElements(By.xpath(date1));
		
		List<WebElement> list=driver.findElements(By.xpath("//td[@data-handler=\"selectDay\"]"));
		
		//list.get(date).click();
		
		Thread.sleep(5000);
		driver.close();
		
		
		
		
		
		}
		
		
	}


	}

