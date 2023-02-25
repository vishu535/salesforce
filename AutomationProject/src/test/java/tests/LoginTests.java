package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import utilities.TestBase;


public class LoginTests extends TestBase {
	LoginPage loginPage;
	
	@BeforeClass
	public void launchApp()
	{	
		startBrowser("Chrome", "https://home-f.my.salesforce.com/");
		
	//	PageFactory.initElements(driver, Payment.class);
			
	}
    @Test (priority = 1, description="Invalid Login Scenario with invalid username and password.")
    public void invalidLoginTest_EmptyUserEmptyPassword ()  {
    	loginPage = PageFactory.initElements(driver, LoginPage.class);
 //       HomePage homePage = new HomePage(driver);
 //       LoginPage loginPage = new LoginPage(driver);
    	test=report.startTest("Login to Sales force");
        loginPage.loginToSalesForce("ee","ttt");

        loginPage.verifyLoginUserName("Please check your username and password. If you still can't log in, contact your Salesforce administrator.");
    }
    
    @Test (enabled=false, priority = 1, description="Valid Login Scenario with username and password.")
    public void validLoginTest ()  {
    	loginPage = PageFactory.initElements(driver, LoginPage.class);
    	test=report.startTest("Login to Sales force valid");
     //   HomePage homePage = new HomePage(driver);
      //  LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToSalesForce("vishveshwar.vishu-tvqv@force.com","testing@123");
   //     homePage.navigateToLeads();
    }

}
