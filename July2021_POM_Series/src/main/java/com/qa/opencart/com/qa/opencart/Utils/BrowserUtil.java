
// 

package com.qa.opencart.Utils;

import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class BrowserUtil
{
    public WebDriver driver;
    
    public WebDriver initDriver(final String browserName) {
        System.out.println("Browser name is : " + browserName);
        if (browserName.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            this.driver = (WebDriver)new ChromeDriver();
        }
        else if (browserName.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            this.driver = (WebDriver)new FirefoxDriver();
        }
        else if (browserName.equalsIgnoreCase("safari")) {
            this.driver = (WebDriver)new SafariDriver();
        }
        else {
            System.out.println("Please pass the right browser..." + browserName);
        }
        return this.driver;
    }
    
    public void launchUrl(final String url) {
        if (url == null || url.isEmpty()) {
            System.out.println("url is incorrect");
            return;
        }
        this.driver.get(url);
    }
    
    public String getPageTitle() {
        return this.driver.getTitle();
    }
    
    public String getPageUrl() {
        return this.driver.getCurrentUrl();
    }
    
    public void closeBrowser() {
        this.driver.close();
    }
    
    public void quitBrowser() {
        this.driver.quit();
    }
}
