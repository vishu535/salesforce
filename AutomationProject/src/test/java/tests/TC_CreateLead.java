package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LeadPage;
import pages.LoginPage;
import utilities.TestBase;


public class TC_CreateLead extends TestBase {
	LoginPage loginPage;
	LeadPage leadPage;
	HomePage homePage;
	ContactPage contactPage;
	
	@BeforeClass
	public void launchApp()
	{	
		startBrowser("Chrome", "https://home-f.my.salesforce.com/");
		
	//	PageFactory.initElements(driver, Payment.class);
			
	}
   
    @Test (enabled=true, priority = 1, description="Valid Login Scenario with username and password.")
    public void CreateLead () throws InterruptedException  {
    	loginPage = PageFactory.initElements(driver, LoginPage.class);
    	homePage = PageFactory.initElements(driver, HomePage.class);
    	leadPage = PageFactory.initElements(driver, LeadPage.class);
    	contactPage = PageFactory.initElements(driver, ContactPage.class);
    	test=report.startTest("Login to Sales force valid");
     //   HomePage homePage = new HomePage(driver);
      //  LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToSalesForce("nareshkommu048-snaw@force.com","Hello@1234");
        homePage.navigateToLeads();
        leadPage.createTestLead();
        
    }

}
