package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.CacheLookup;
import com.relevantcodes.extentreports.LogStatus;

import utilities.TestBase;

public class LoginPage extends TestBase {
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;	
	}
    
    @FindBy(id="username")
	@CacheLookup
    public WebElement usernameInput;
    @FindBy(id="password")
	public WebElement pwdInput;
    @FindBy(id="Login")
	public WebElement loginButton;
	
	
    public void loginToSalesForce (String username, String password){
		usernameInput.sendKeys(username);
        test.log(LogStatus.INFO, "Entered username "+username);
        pwdInput.sendKeys(password);
        test.log(LogStatus.INFO, "Entered password "+password);
        loginButton.click();
        test.log(LogStatus.INFO, "Clicked on login button");
    }
    
    public void getWebText() {
    	String x= driver.findElement(By.xpath("")).getText();
    	System.out.println(x);
    }

    public void verifyLoginUserName (String expectedText) {
    //	WebDriverWait wait= new WebDriverWait(driver, 60);
   // 	wait.until(ExpectedConditions.presenceOfElementLocated(By.id(usernameError)));
   //     Assert.assertEquals(readText(By.id(usernameError)), expectedText);
    }

}
