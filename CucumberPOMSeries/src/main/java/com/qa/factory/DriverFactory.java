package com.qa.factory;

import java.awt.Window;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	public WebDriver driver;
	
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<WebDriver>();
	
	
	/*  This method is use to initilize the threadlocal driver on basis of given browser */
	
	public synchronized WebDriver init_driver(String browser) {
		
		System.out.println("Browser value is " +browser);
		
		if (browser.equals("Chrome")){
			WebDriverManager.chromedriver().setup();
			tlDriver.set(new ChromeDriver());
			
		}
		else if (browser.equals("Firefox")){
			WebDriverManager.firefoxdriver().setup();
			tlDriver.set(new FirefoxDriver());	
		}
		else if (browser.equals("Safari")){
			WebDriverManager.iedriver().setup();
			tlDriver.set(new InternetExplorerDriver());	
		}
		else {
			
			System.out.println("Invalid Browser : " +browser);
		}
			getDriver().manage().deleteAllCookies();
			getDriver().manage().window().maximize();
			//getDriver().manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			//getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//			JavascriptExecutor executor = (JavascriptExecutor)getDriver();
//			executor.executeScript("document.body.style.zoom = '0.1'");
			
//			DesiredCapabilities caps = new DesiredCapabilities();
//			caps.setCapability("screen-resolution", "800x600");
			return getDriver();
	
			
		}
	/*  This method is use to get driver with threadlocal  */
	public static synchronized WebDriver getDriver() {
		
		return tlDriver.get();
		
	}
}
