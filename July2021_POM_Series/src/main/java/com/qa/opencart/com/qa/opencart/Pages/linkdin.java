package com.qa.opencart.Pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class linkdin {
	
	public static WebDriver driver;//this webdriver is used for this particular class
	
	public Properties prop;
	
	public static void initliazation(Properties prop) {
	    String browsername= prop.getProperty("browser");
	    if(browsername.equals("chrome")) {
	      WebDriverManager.chromedriver().setup();
	      driver= new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().deleteAllCookies();
	      driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	      //driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	      //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      driver.get(prop.getProperty("url"));
	    }
	  }

	
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

