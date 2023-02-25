package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.TestBase;

public class TC_CreateAccount extends TestBase{
	LoginPage loginPage;
	AccountPage accountPage;
	HomePage homePage;
	@BeforeClass
	public void launchApp() {
		startBrowser("Chrome", "https://home-f.my.salesforce.com/");
	}

	@Test (enabled=true, priority = 1, description="Valid Login Scenario with username and password.")
	public void reateLead () throws InterruptedException  {
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		homePage = PageFactory.initElements(driver, HomePage.class);
		accountPage = PageFactory.initElements(driver, AccountPage.class);
		test=report.startTest("Login to Sales force valid");
		//   HomePage homePage = new HomePage(driver);
		//  LoginPage loginPage = new LoginPage(driver);
		loginPage.loginToSalesForce("vishveshwar.vishu-tvqv@force.com","testing@123");
		homePage.navigateToLeads();
		accountPage.createTestAccount();
	}
}