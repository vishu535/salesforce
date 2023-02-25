package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.CacheLookup;
import com.relevantcodes.extentreports.LogStatus;

import utilities.TestBase;

public class LeadPage extends TestBase {
	
	public LeadPage(WebDriver driver) {
		this.driver=driver;	
	}
    
    @FindBy(xpath="//button[@aria-label='Lead Status, New']")
	@CacheLookup
    public WebElement leadStatusSelect;
    
    @FindBy(xpath="//button[@name='salutation']")
	public WebElement salutationFieldSelect;
    
    @FindBy(xpath="//span[@title='Mr.']")
	public WebElement salutationValue;
    
    @FindBy(xpath="//input[@name='firstName']")
	public WebElement firstName;
    
    @FindBy(xpath="//input[@name='lastName']")
   	public WebElement lastName;
    
    @FindBy(xpath="//input[@name='suffix']")
   	public WebElement suffix;
	
    @FindBy(xpath="//input[@name='Title']")
   	public WebElement Title;
    

    @FindBy(xpath="//input[@name='Email']")
   	public WebElement Email;
    
    @FindBy(xpath="//input[@name='Phone']")
   	public WebElement Phone;	
    
    @FindBy(xpath="//input[@name='MobilePhone']")
   	public WebElement MoblilePhone;
    
    @FindBy(xpath="//button[@aria-label=\"Rating, --None--\"]")
   	public WebElement Rating;
    
    @FindBy(xpath="//input[@name='Company']")
   	public WebElement Company;
    
    @FindBy(xpath="//button[@aria-label=\"Industry, --None--\"]")
   	public WebElement Industry;
    
    @FindBy(xpath="//input[@name='NumberOfEmployees']")
   	public WebElement Employees;
    
    @FindBy(xpath="//button[@aria-label=\"Lead Source, --None--\"]")
   	public WebElement Leadsource;
    
    @FindBy(xpath="//input[@placeholder='Search Address']")
   	public WebElement SearchAddress;
    
    @FindBy(xpath="//input[@name='city']")
   	public WebElement City;
    
    @FindBy(xpath="//input[@name='province']")
   	public WebElement State;
    
    @FindBy(xpath="//input[@name='postalCode']")
   	public WebElement Zipcode;
    
    @FindBy(xpath="//input[@name='country']")
   	public WebElement Country;
    
    @FindBy(xpath="//button[@name='SaveEdit']")
    public WebElement save;
   



	
    public void createTestLead (){
    	leadStatusSelect.click();
    	leadStatusSelect.click();
    	
    	salutationFieldSelect.click();
    	salutationValue.click();
    	firstName.sendKeys("Test1");
    	lastName.sendKeys("Test2");
    	suffix.sendKeys("Testsuffix");
    	Title.sendKeys("Testlead");
    	Phone.sendKeys("7673975945");
    	MoblilePhone.sendKeys("1234567890");
    	Rating.sendKeys("None");
    	Company.sendKeys("Cigniti");
    	Industry.sendKeys("None");
    	Employees.sendKeys("300");
    	Leadsource.sendKeys("None");
    	SearchAddress.sendKeys("Testlead");
    	City.sendKeys("Hyderabad");
    	State.sendKeys("Telangana");
    	Zipcode.sendKeys("12345");
    	Country.sendKeys("India");
        save.click();
    
		
    }





	public void createTestAccount() {
		// TODO Auto-generated method stub
		
	}
    
  

}
