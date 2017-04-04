package selenium.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class ScriptUtils 
{
	/**
	 * 
	 * @param driver
	 * @param numOfSeconds
	 */
	public static void waitForXSeconds(WebDriver driver, int numOfSeconds)
	{
		driver.manage().timeouts().implicitlyWait(numOfSeconds, TimeUnit.SECONDS);
	}
}
