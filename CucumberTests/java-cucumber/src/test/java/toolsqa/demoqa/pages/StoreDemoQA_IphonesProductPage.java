package toolsqa.demoqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import selenium.utils.ScriptUtils;

public class StoreDemoQA_IphonesProductPage {

	private WebDriver driver;
	
	public StoreDemoQA_IphonesProductPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void addiPhone4s16GBToCart()
	{
		ScriptUtils.waitForXSeconds(driver, 10);
		driver.findElement(By.xpath("//*[@id=\"default_products_page_container\"]/div[4]/div[2]/form/div[2]/div[1]/span/input")).click();
	}


}
