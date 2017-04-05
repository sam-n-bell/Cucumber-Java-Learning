package selenium.drivers;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverCreator {
	
	private static Properties prop = new Properties();
	private static InputStream input;
	private static WebDriver driver;
	private static String browserProperty;
	private static String browserLocation;
	
	public static WebDriver getChromeDriver()
	{
		try 
		{
			input = new FileInputStream("config.properties");

			// load a properties file
			prop.load(input);

			// get the property values
			browserProperty = (prop.getProperty("chromeDriverProperty"));
			browserLocation = (prop.getProperty("chromeDriverLocation"));
		} 
		catch (IOException ex) 
		{
			ex.printStackTrace();
		} 
		finally 
		{
			if (input != null) 
			{
				try 
				{
					input.close();
				} 
				catch (IOException e) 
				{
					e.printStackTrace();
				}
			}
		}
		System.setProperty(browserProperty, browserLocation);
		driver = new ChromeDriver();
		return driver;
	}
}
