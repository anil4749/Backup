package stepdefination;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

//import com.github.dockerjava.api.model.Driver;
import com.pages.AccountPage;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class AccountPageSteps {
	
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private AccountPage accountPage;
	
	@Given("user has already loged in to application")
	public void user_has_already_loged_in_to_application(DataTable credTable) {
		
		List<Map<String, String>> credList=credTable.asMaps();
		String username =credList.get(0).get("Username");
		String password =credList.get(0).get("Password");
		
		DriverFactory.getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	    accountPage=loginPage.dologin(username, password);
	  
	}

	@Given("user is on accounts page")
	public void user_is_on_accounts_page() {
		
		accountPage.getAccountPageTitle();
		
	}

	@Then("user gets accounts section")
	public void user_gets_accounts_section(DataTable sectioDataTable) {
		List<String> expectedSectionList =sectioDataTable.asList();
		System.out.println("Expected Section List : " +expectedSectionList);
		
		List<String> actualAccountSectionList=accountPage.getAccountSectionList();
		
		Assert.assertTrue(actualAccountSectionList.containsAll(expectedSectionList));
		
	
	}

	@Then("account section count should be {int}")
	public void account_section_count_should_be(Integer expectedSectionCount) {
		//int temp = accountPage.get_accountSectionCount();
		//System.out.println("Account Section count is" +temp);
		Assert.assertTrue(accountPage.get_accountSectionCount()== expectedSectionCount);
		
	    
	}


}
