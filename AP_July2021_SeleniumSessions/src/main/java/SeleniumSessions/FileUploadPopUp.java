package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopUp {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
	
		//type="file" --is mandatory
		
		driver.findElement(By.name("upfile")).sendKeys("//file path");
		
		//autoIT -//Robot for file upload
		
		//Frames - also not a popup but switch to particular frame
		//window based//BrowserBased Pop-up -- multiple window handling - window handler API

		//JS popup
		//auth popup
		//file upload popup
		//frame webelement
		//browserbased pop-ups-window handler api
		//advertisement popup-window handler api
	}

}
