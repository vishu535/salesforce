package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.CacheLookup;
import com.relevantcodes.extentreports.LogStatus;

import utilities.TestBase;

public class AccountPage extends TestBase {
	
	public AccountPage(WebDriver driver) {
		this.driver=driver;	
	}
    
    @FindBy(xpath="//div[@title='New']")
	public WebElement newButton;
	
    @FindBy(xpath="//input[@name='Name']")
    public WebElement accountNameField;
    
    @FindBy(xpath="(//input[@name='Phone'])[1]")
    public WebElement PhoneField;
    
    @FindBy(xpath="//input[@name='Website']")
    public WebElement WebsiteField;
    
    @FindBy(xpath="//input[@name='NumberOfEmployees']")
    public WebElement EmployeesField;
    
    @FindBy(xpath="(//input[@name='city'])[1]")
    public WebElement CityField;
    

    @FindBy(xpath="(//input[@name='country'])[2]")
    public WebElement CountryField;
    
    @FindBy(xpath="//button[@name='SaveEdit']")
    public WebElement SaveButton;
    
    
    
    public void createNewAccount () {
 
    	newButton.click();
  
    }

    public void fillAccountDetails() {
    	
    	accountNameField.sendKeys("Rakesh");
    	PhoneField.sendKeys("123456");
    	WebsiteField.sendKeys("abcd.com");
    	EmployeesField.sendKeys("15");
    	CityField.sendKeys("Bangalore");
    	CountryField.sendKeys("India");
    	SaveButton.click();

    }
    
   
    
}


