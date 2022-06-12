package AppHooks;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.qa.factory.DriverFactory;
import com.qa.util.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationHooks {
	
	private DriverFactory driverFactory;
	private WebDriver driver;
	private ConfigReader configReader;
	Properties prop;

    @Before(order =  0)
	public void getPropery() {
		configReader=new ConfigReader();
		prop=configReader.init_prop();
		
	
}
    @Before(order =  1)
    public void launchBrowser() throws InterruptedException {
    	
    	String browserName = prop.getProperty("browser");
    	
    	driverFactory=new DriverFactory();
    	driver=driverFactory.init_driver(browserName);
//    	driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
//    	Thread.sleep(3000);
//    	JavascriptExecutor executor = (JavascriptExecutor)driver;
//		executor.executeScript("document.body.style.zoom = '0.7'");
		
    	
    }
    @After(order = 0)
    public void quitDriver() {
    	driver.quit();
    }
    
    @After(order = 1)
	public void tearDown(Scenario scenario) throws IOException {
		if (scenario.isFailed()==true||scenario.isFailed()==false) {
			
			Date date=new Date();
			SimpleDateFormat formatter = new SimpleDateFormat("dd_MM_yyyy HH:mm:ss");  
	
		    //System.out.println(formatter.format(date)); 
			
			
			// take screenshot:
			String screenshotName = scenario.getName().replaceAll(" ", "_")+" "+formatter.format(date);			
			
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		    byte[] fileContent = FileUtils.readFileToByteArray(src);
		    scenario.attach(fileContent, "image/png", screenshotName);
			
			

		}
    }
}
