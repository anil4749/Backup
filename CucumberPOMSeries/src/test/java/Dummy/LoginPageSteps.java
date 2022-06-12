package stepdefination;

import org.junit.Assert;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.*;



public class LoginPageSteps {
	
	public static String PageTitle;
	
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	@Given("user is on login page")
	public void user_is_on_login_page() {
		
		DriverFactory.getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	}

	@When("user gets title of the page")
	public void user_gets_title_of_the_page() {
		PageTitle=loginPage.getLoginPageTitle();
		System.out.println("Login Page Title is " +PageTitle);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitleName) {
		Assert.assertTrue(PageTitle.contains(expectedTitleName));
	
	}

	@Then("forgot your password link should be displayed")
	public void forgot_your_password_link_should_be_displayed() throws InterruptedException {
		Assert.assertTrue(loginPage.ForgotPwdLinkExist());
	}

	@When("users enters username {string}")
	public void users_enters_username(String username) {
		loginPage.enterUserNamme(username);
	}

	@When("user enter password {string}")
	public void user_enter_password(String password) {
		loginPage.enterPassword(password);
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		loginPage.clickOnLogin();
	}
	//----------
	@When("user enter emailID {string}")
	public void user_enter_email_id(String emailID) {
		loginPage.enterEmailID(emailID);
	    
	}

	@When("click on create an account button")
	public void click_on_create_an_account_button() {
		loginPage.clickOnCreateAccount();
	 
	}

	@Then("registore button should be display")
	public void registore_button_should_be_display() throws InterruptedException {
		Assert.assertTrue(loginPage.is_register_button_display());
	 
	}

		

}
