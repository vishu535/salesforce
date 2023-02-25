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
    
    @FindBy(id="Login")
	public WebElement loginButton;
	
    public void createTestAccount () {
 

    
  
    }

}

