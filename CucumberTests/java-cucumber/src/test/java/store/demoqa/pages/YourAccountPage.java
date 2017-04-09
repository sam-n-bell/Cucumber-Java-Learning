package store.demoqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class YourAccountPage 
{
	private WebDriver driver;
	
	public YourAccountPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String returnYouMustBeLoggedInText()
	{
		WebElement textBlock = driver.findElement(By.xpath("//*[@class=\"entry-content\"]/div"));
		String text = textBlock.getText();
		return text;
	}
	
	

}
