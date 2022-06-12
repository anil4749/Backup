package com.qa.opencart.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 * @author anilmore
 *
 */

public class DriverFactory {
	
	
	public WebDriver driver;
	public Properties prop;
	
	/**
	 * This method is used to initialize the webdriver on the basis of browser name...
	 * @param prop
	 * @return this method will return driver
	 */
	
	public WebDriver initDriver(String browser) {
		
		System.out.println("browser name is " + browser);
		
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		}
		else {
			System.out.println("Please pass the correct browser name..."+ browser);
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		return driver;
	}
	
	/**
	 * this method is used to initlized properties on the basis of given enviorment
	 * @return this method returns prop 
	 */
	
	public Properties initProp() {
		
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("./src/test/Resources/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
		
	}


}
