package cucumber.features;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import selenium.drivers.DriverCreator;
import selenium.utils.ScriptUtils;
import toolsqa.demoqa.pages.StoreDemoQA_HomePage;
import toolsqa.demoqa.pages.YourAccountPage;

public class StepDefinitions {
	WebDriver driver;
	
	@Given("^I am on store.demoqa.com$")
	public void navigateToDemoQA() throws Throwable 
	{
		driver = DriverCreator.getChromeDriver();
		driver.get("http://store.demoqa.com/");
		driver.manage().window().maximize();
	}
	
	@When("^I go to the iPhone product page")
	public void navigateToIphoneProductPage()
	{
		ScriptUtils.waitForXSeconds(driver, 5);
		StoreDemoQA_HomePage homePage = new StoreDemoQA_HomePage(driver);
		
	}

	@When("^I click on My Account$")
	public void clickOnMyAccount() throws Throwable 
	{
		ScriptUtils.waitForXSeconds(driver, 5);
		StoreDemoQA_HomePage homePage = new StoreDemoQA_HomePage(driver);
		homePage.clickMyAccount();
	}

	@Then("^I expect to see a login page$")
	public void checkForLoginScreen() throws Throwable 
	{
		ScriptUtils.waitForXSeconds(driver, 5);
		YourAccountPage accountPage = new YourAccountPage(driver);
		String text = accountPage.returnYouMustBeLoggedInText();
		boolean foundMessage = false;
		if (text.contains("You must be logged in to use this page. Please use the form below to login to your account."))
		{
			foundMessage = true;
		}
		assert(foundMessage == true);	
	}
	
	
	
	@Then("^I expect to see iPhone 4S listed$")
	public void checkForIphone4s() throws Throwable 
	{
			
	}
	
	@After
	public void quitWebDriver()
	{
		if (driver != null)
		{
			driver.quit();
		}
	}
	
}
