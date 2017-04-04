package toolsqa.demoqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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

}
