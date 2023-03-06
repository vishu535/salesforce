package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.TestBase;

public class HomePage extends TestBase {


	public HomePage(WebDriver driver)
	{
		this.driver=driver;		
	}

	@FindBy(xpath="//span[text()='Leads']/../following-sibling::*//a")
	public WebElement leadsHeader;
	
	@FindBy(xpath="//span[text()='New Lead']")
	public WebElement leadsNewAccount;
	
	@FindBy(xpath="//span[text()='Accounts']")
	public WebElement accountHeader;
	
	@FindBy(xpath="//span[text()='Contacts']")
	public WebElement contactsHeader;
	
	@FindBy(xpath="//span[text()='Opportunities']")
	public WebElement OpportuntiesHeader;
	

	public void clickElementJs(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
	    executor.executeScript("arguments[0].click();", element);
	}
	
	public void navigateToLeads() throws InterruptedException {
		leadsHeader.click();
		Thread.sleep(2000);
		clickElementJs(leadsNewAccount);
	}

	public void navigateToAccounts() throws InterruptedException {
		Thread.sleep(8000);
		clickElementJs(accountHeader);
	}
	
	public void navigateToContacts() throws InterruptedException {
		Thread.sleep(8000);
		clickElementJs(contactsHeader);
	}
	public void navigateToOpportunities() throws InterruptedException {
		
		clickElementJs(OpportuntiesHeader);
	}


}
