package driverFactory.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.fasterxml.jackson.databind.annotation.JsonAppend.Prop;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 * @author anilmore
 *
 */

public class DriverFactory {

	public WebDriver driver;
	public Properties prop;

	public static String highlight;

	/**
	 * This method is used to initialize the webdriver on the basis of given browser
	 * name..
	 * 
	 * @param browser
	 * @return this method will return driver
	 */

	public WebDriver initDriver(Properties prop) {
		highlight = prop.getProperty("highlight");
		String browser = prop.getProperty("browser").trim();

		System.out.println("browser name is : " + browser);

		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));

		return driver;

	}

	/**
	 * this method is used to initilize the properties on the basis of given env(QA
	 * or Dev)
	 * 
	 * @return this method returns prop
	 */

	public Properties initProp() {

		prop = new Properties();
		FileInputStream ip = null;

		String env = System.getProperty("env");
		if (env == null) {

			try {
				ip = new FileInputStream("./src/test/resources/config/config.properties");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Running on Environment: " + env);

			try {
				prop.load(ip);
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		}
		return prop;

	}
}