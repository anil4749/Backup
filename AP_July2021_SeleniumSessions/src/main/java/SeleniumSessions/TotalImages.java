package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImages {
	static WebDriver driver;

	public static void main(String[] args) {

		//Total image on page
		//for each image , print src and alt values

			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			driver.get("https://www.amazon.in");
			
//			List<WebElement> imagelist = driver.findElements(By.tagName("img"));
			
//			System.out.println("total images : "+ imagelist.size());

//			for (int i = 0; i < imagelist.size(); i++) {
//				String altValue = imagelist.get(i).getAttribute("alt");
//				String srcValue = imagelist.get(i).getAttribute("src");

			//	System.out.println(altValue + " "+ srcValue);
		
//			}	

			//Total links on the page , and print its text and href value
			
			List<WebElement> LinkList = driver.findElements(By.tagName("a"));
			System.out.println("total links: " + LinkList.size());

			for (WebElement e : LinkList) {
				String href = e.getAttribute("href");
				String text = e.getText();
				System.out.println(href +" "+ text);
			}
	}

}
