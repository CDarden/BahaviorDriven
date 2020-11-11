package page;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BankandCash {

WebDriver driver;
	
	public void BankCashPage(WebDriver driver) {
		this.driver = driver;
	}
		
		@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/a/span[2]") 
		WebElement BANK_AND_CASH_FIELD;
		@FindBy(how = How.LINK_TEXT, using = "New Account") 
		WebElement NEW_ACCOUNT_FIELD;
		@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]") 
		WebElement ACCOUNT_TITLE_LOCATOR;
		@FindBy(how = How.XPATH, using = "//*[@id=\"description\"]") 
		WebElement DESCRIPTION_LOCATOR;
		@FindBy(how = How.XPATH, using = "//*[@id=\"balance\"]") 
		WebElement BALANCE_LOCATOR;
		@FindBy(how = How.XPATH, using = "//*[@id=\"account_number\"]") 
		WebElement ACCOUNT_NUMBER_LOCATOR;
		@FindBy(how = How.XPATH, using = "//*[@id=\"contact_person\"]") 
		WebElement CONTACT_PERSON_LOCATOR;
		@FindBy(how = How.XPATH, using = "//*[@id=\"contact_phone\"]") 
		WebElement CONTACT_PHONE_LOCATOR;
		@FindBy(how = How.XPATH, using = "//*[@id=\"ib_url\"]")
		WebElement INTERNET_BANKING_URL;
		@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/form/button") 
		WebElement SUBMIT_BUTTON_LOCATOR;
	
		public  void ClickBankAndCash() {
			BANK_AND_CASH_FIELD.click();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		}

		
		public void clickNewAccount() {
			NEW_ACCOUNT_FIELD.click();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		}
	
		public void newAccountDetails(String accountTitle, String description, String initialBalance, String accountNumber, String contactPerson, String contactPhone, String internetBankingUrl) {
			ACCOUNT_TITLE_LOCATOR.sendKeys(accountTitle);
			DESCRIPTION_LOCATOR.sendKeys(description);
			BALANCE_LOCATOR.sendKeys(initialBalance);
			ACCOUNT_NUMBER_LOCATOR.sendKeys(accountNumber);
			CONTACT_PERSON_LOCATOR.sendKeys(contactPerson);
			CONTACT_PHONE_LOCATOR.sendKeys(contactPhone);
			INTERNET_BANKING_URL.sendKeys(internetBankingUrl);
			
		}
		public void clickSubmit() {
			SUBMIT_BUTTON_LOCATOR.click();
		}
		
		public void takeScreenshot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot)(driver);
		File SourceFile = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(SourceFile, new File("C:\\Users\\14435\\screenshot.png"));
		}
	
	
}
