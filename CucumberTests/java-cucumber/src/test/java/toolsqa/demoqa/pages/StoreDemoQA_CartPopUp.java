package toolsqa.demoqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import selenium.utils.ScriptUtils;

public class StoreDemoQA_CartPopUp {

	private WebDriver driver;
	
	public StoreDemoQA_CartPopUp(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void goToCheckOut() 
	{
		ScriptUtils.waitForXSeconds(driver, 10);
		driver.findElement(By.xpath("//*[@id=\"fancy_notification_content\"]/a[1]")).click();	
	}
}
