package steps;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page.BankandCash;
import page.LoginPage;
import util.BrowserFactory;

public class StepDef {

	WebDriver driver;
	LoginPage login;
	BankandCash newaccount;
	



	@Before
	public void BeforeRun() {
		driver = BrowserFactory.startBrowser();
		login = PageFactory.initElements(driver, LoginPage.class);
		newaccount = PageFactory.initElements(driver, BankandCash.class);
}

	@Given ("^User is on the Techfios Login Page$")
	public void User_is_on_the_Techfios_Login_Page() {
		driver.get("https://techfios.com/billing/?ng=admin/");
	}
	
	@When("^User enters the username as \"([^\"]*)\"$")
	public void user_enters_the_username_as(String userName) throws Throwable {
	    login.enterUserName(userName);
	    Thread.sleep(2000);
		
	}
	@When("^User enters the password as \"([^\"]*)\"$")
	public void user_enters_the_password_as(String password) throws Throwable {
		login.enterPassword(password);
		Thread.sleep(2000);
		
		
	}

	@When("^User clicks on the login button$")
	public void user_clicks_on_the_login_button() throws Throwable {
		login.clickSignInButton();
	    Thread.sleep(4000);
	}

	@Then("^User should be able to see the DashBoard Page$")
	public void user_should_be_able_to_see_the_DashBoard_Page() throws Throwable {
		String expectedTitle ="Dashboard- iBilling";
		String actualTitle =login.getPageTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		
		
	}

	@Then("^User clicks on bank and cash$")
	public void User_clicks_on_bank_and_cash() {
		newaccount.ClickBankAndCash();
	}
	
	@Then ("^User on new account$")
	public void User_on_new_account() {
		newaccount.clickNewAccount();
		
	}
	@Then ("^User fill up the form entering$")
	public void User_fill_up_the_form_entering(String accountTitle, String description, String initialBalance, String accountNumber, String contactPerson, String contactPhone, String internetBankingUrl   ) {
		newaccount.newAccountDetails(accountTitle, description, initialBalance, accountNumber, contactPerson, contactPhone, internetBankingUrl);
	}
	@Then ("^User should be able to see validate$")
	public void User_should_be_able_to_see_validate() throws IOException {
		newaccount.takeScreenshot();
	}
	
	@After
	public void afterRun() {
		driver.close();
		driver.quit();
	}
	
	
	
}
