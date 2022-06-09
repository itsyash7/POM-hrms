package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
public WebDriver driver;
public Properties prop;
	public WebDriver InitializeDriver() throws IOException
	{
		 prop=new Properties();
		FileInputStream fis=new FileInputStream("/home/excellarate/eclipse-workspace/E2E/src/main/java/Resources/data.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","/home/excellarate/Downloads/Selenium/chromedriver");	
			 driver=new ChromeDriver();
		}
		else if (browserName=="firefox")
		{
			
		}
		return driver;
	};
	
	
	
}
