package cucumber.features;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import selenium.drivers.DriverCreator;
import selenium.utils.ScriptUtils;
import store.demoqa.pages.StoreDemoQA_CartPopUp;
import store.demoqa.pages.StoreDemoQA_CheckoutPage;
import store.demoqa.pages.StoreDemoQA_HomePage;
import store.demoqa.pages.StoreDemoQA_IphonesProductPage;
import store.demoqa.pages.YourAccountPage;
import toolsqa.store.demoqa.constants.StoreDemoQaConstants;

public class StepDefinitions {
	WebDriver driver;
	
	@Given("^I am on store.demoqa.com$")
	public void navigateToDemoQA() throws Throwable 
	{
		driver = DriverCreator.getChromeDriver();
		driver.get(StoreDemoQaConstants.STORE_QA_HOME.value());
		driver.manage().window().maximize();
	}
	
	@When("^I go to the iPhone product page")
	public void navigateToIphoneProductPage()
	{
		ScriptUtils.waitForXSeconds(driver, 5);
		StoreDemoQA_HomePage homePage = new StoreDemoQA_HomePage(driver);
		homePage.selectIphoneProductCategory();
	}

	@When("^I click on My Account$")
	public void clickOnMyAccount() throws Throwable 
	{
		ScriptUtils.waitForXSeconds(driver, 5);
		StoreDemoQA_HomePage homePage = new StoreDemoQA_HomePage(driver);
		homePage.clickMyAccount();
	}
	
	@When("^I add iPhone 4S 16GB to cart$")
	public void addIphone4s16GigsToCart() throws Throwable 
	{
		ScriptUtils.waitForXSeconds(driver, 5);
		StoreDemoQA_IphonesProductPage iphones = new StoreDemoQA_IphonesProductPage(driver);
		iphones.addiPhone4s16GBToCart();
	}
	
	@When("^I click go to checkout$")
	public void goToCheckOut() throws Throwable
	{
		StoreDemoQA_CartPopUp popUp = new StoreDemoQA_CartPopUp(driver);
		popUp.goToCheckOut();
	}

	@Then("^I expect to see a login page$")
	public void checkForLoginScreen() throws Throwable 
	{
		ScriptUtils.waitForXSeconds(driver, 5);
		YourAccountPage accountPage = new YourAccountPage(driver);
		String text = accountPage.returnYouMustBeLoggedInText();
		boolean foundMessage = false;
		if (text.contains(StoreDemoQaConstants.LOGIN_PAGE_TEXT.value()))
		{
			System.out.println("Found login text");
			foundMessage = true;
		} else {
			System.out.println("Did not find login text");
		}
		Assert.assertEquals(true, foundMessage);
	}
	
	@Then("^I expect to see a subtotal of (.*)$")
	public void checkSubtotal(String val)
	{
		ScriptUtils.waitForXSeconds(driver, 5);
		StoreDemoQA_CheckoutPage checkOut = new StoreDemoQA_CheckoutPage(driver);
		String subTotal = checkOut.returnSubTotal();
		System.out.println("Comparing " + val + " with " + subTotal);
		Assert.assertEquals(val, subTotal);
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
