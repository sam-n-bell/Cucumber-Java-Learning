package selenium.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverCreator {
	
	private static WebDriver driver;
	
	public static WebDriver getChromeDriver()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\JavaProjects\\SeleniumFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
}
