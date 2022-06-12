package SeleniumSessions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		//Mac Machines
		System.setProperty("webdriver.chrome.driver", "/Users/anilmore/downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();//LaunchBrowser
		driver.get("https://www.google.com");//EnteringURL
		
		String title =driver.getTitle();//Get Title
		System.out.println(title);
		
		//Verification Point /Checkpoint - act vs exp result
		
		if(title.equals("Google")){
			System.out.println("Title is Correct");
			}
		else {
			System.out.println("Wrong Title");
		}
		
		//Automation Steps + Verification Point ->Automation Test
		
		System.out.println(driver.getCurrentUrl());//Validation
		
		System.out.println(driver.getPageSource().contains("Copyright"));
		
		driver.quit();//close the browser
		
		}
}
