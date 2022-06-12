import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.reporters.jq.BannerPanel;

import io.github.bonigarcia.wdm.WebDriverManager;

public class deaninfo {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.deaninfotech.com/");

		// 1.TC URL
		String actURL = "https://www.deaninfotech.com/";
		String ExpURL = driver.getCurrentUrl();

		// Assert.assertEquals(actURL, ExpURL);

		if (actURL.equals(ExpURL)) {
			System.out.println("URL is correct");
		} else {
			System.out.println("URL is incorrect");
		}

		// 2.TC Title

		String actTitle = "Web App Design, Website Development & Cloud Services";
		String ExpTitle = driver.getTitle();
		if (actTitle.equals(ExpTitle)) {
			System.out.println("Title is correct");
		} else {
			System.out.println("Title is incorrect");
		}

		// 3.TC
		int titleLength = driver.getTitle().length();
		System.out.println("Length of the title is : " + titleLength);

		// 4.TC HomePageBanner

		String actBanner = "Re-Engineer your Business with Custom Enterprise Solution\n"
				+ "";
		WebElement ExpBanner = driver.findElement(By.xpath("//section[@class='dean-banner']//h2[1]"));

		if (actBanner.equals(ExpBanner)) {
			System.out.println("Banner is correct");
		} else {
			System.out.println("Banner is incorrect");
		}

		// 5.TC logo

		WebElement logo = driver.findElement(By.xpath("//img[@alt='logo-footer']"));
		if (logo.isDisplayed()) {
			System.out.println("Logo is Present");
		} else {
			System.out.println("Logo is not present");
		}

		// 6.Header Links

		List webelemenet = driver.findElements(By.xpath("//div[@class='header-right']"));
		System.out.println(webelemenet.size());

		// 7.Portfolio

		driver.findElement(By.xpath("//a[text()='Our Portfolio']")).click();
		System.out.println(driver.getCurrentUrl());

		String actPortfolioBanner = "We Create And Customize Applications To Enhance User Experience\n"
				+ "";
		WebElement ExpPortfolioBanner = driver.findElement(By.xpath("(//h2[contains(text(),'We')])[1]"));

		if (actPortfolioBanner.equals(ExpPortfolioBanner)) {
			System.out.println("Portfolio Banner is Present");
		} else {
			System.out.println("Portfolio Banner is not Present");
		}

		// 8. Refreshing Page
		driver.navigate().back();
		Thread.sleep(5000);
		System.out.println(driver.getCurrentUrl());

		// 9. Hire Dedicated Developers

//		driver.findElement(By.xpath("//a[normalize-space()='Hire Dedicated Developers']")).click();
//		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getTitle());
//
//		String actHirePageBanner = "Hire the Best Software Developers for Your Digital Success";
//		WebElement ExpHirePageBanner = driver
//				.findElement(By.xpath("//h2[text()='Hire the Best Software Developers for Your Digital Success']"));
//
//		if (actHirePageBanner.equals(ExpHirePageBanner)) {
//			System.out.println("Hire developer Banner is Present");
//		} else {
//			System.out.println("Hire developer Banner is not Present");
//		}

//		// 10. Back page
//		driver.navigate().refresh();
//		Thread.sleep(5000);
//		System.out.println(driver.getCurrentUrl());

		// 11. Contact Page

		driver.findElement(By.xpath("//a[@class='portfolio hvr-sweep-to-right hvr-wobble-vertical']")).click();
		System.out.println(driver.getCurrentUrl());
		String actContactBanner = "We offer edge cutting solutions that fulfil your business needs\n"
				+ "";
		WebElement ExpContactBanner = driver.findElement(By.xpath("//h2[contains(text(),'We')]"));

		if (actContactBanner.equals(ExpContactBanner)) {
			System.out.println("Contact Banner is Correct");
		} else {
			System.out.println("Contact Banner is InCorrect");
		}
	}

}
