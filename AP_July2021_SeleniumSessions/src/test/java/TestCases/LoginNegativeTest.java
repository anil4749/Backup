package TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginNegativeTest extends BaseTest{

	@Test
	public void loginTest() {
		Assert.assertTrue(doLogin("Test123@gmail.com", "1234"));
	}
	
	public boolean doLogin(String username ,  String password) {
		driver.findElement(By.id("input-email")).sendKeys(username);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		String error = driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).getText();
		if (error.contains(" Warning: No match for E-Mail Address and/or Password.")) {
			return true;
		}
		return false;
	}
}
