package Hrms;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import Resources.base;
import pageObjects.hrmsLoginpage;

public class Loggedin extends base {
@Test

public void base() throws IOException
{
	driver=InitializeDriver();
	driver.get(prop.getProperty("url"));
	
	hrmsLoginpage hr=new hrmsLoginpage(driver);
	hr.Emailid().sendKeys("yash.shaha");
	hr.Passwords().sendKeys("Yshah5293@");
	hr.submit().click();
	Assert.assertEquals(hr.welcome().getText(),"Welcome Yash");
   
	driver.quit();
}
}
