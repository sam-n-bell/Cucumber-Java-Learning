package toolsqa.demoqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import selenium.utils.ScriptUtils;

public class StoreDemoQA_HomePage 
{
	
private WebDriver driver;
	
	public StoreDemoQA_HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void clickMyAccount()
	{
		driver.findElement(By.xpath("//*[@id=\"account\"]/a")).click();
	}
	
	private void hoverOverProductCategory()
	{
		Actions action = new Actions(driver);
		WebElement prodCat = driver.findElement(By.xpath("//*[@id=\"menu-item-33\"]/a"));
		action.moveToElement(prodCat).build().perform();
	}
	
	public void selectIphoneProductCategory()
	{
		hoverOverProductCategory();
		Actions action = new Actions(driver);
		WebElement iPhonesCat = driver.findElement(By.xpath("//*[@id=\"menu-item-37\"]/a"));
		//action.moveToElement(iPhonesCat).build().perform();
		ScriptUtils.waitForXSeconds(driver, 3);
		driver.findElement(By.linkText("iPhones")).click();
	}

}
