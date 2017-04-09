package store.demoqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StoreDemoQA_CheckoutPage {
	
	private WebDriver driver;
	
	public StoreDemoQA_CheckoutPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String returnSubTotal()
	{
		String total = driver.findElement(By.xpath("//*[@id=\"checkout_page_container\"]/div[1]/span/span")).getText();
		return total;
	}

}
