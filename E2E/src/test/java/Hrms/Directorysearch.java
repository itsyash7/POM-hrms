package Hrms;

import java.io.IOException;
import org.testng.annotations.Test;
import Resources.base;
import pageObjects.hrmsDirectory;
import pageObjects.hrmsLoginpage;

public class Directorysearch extends base {
@Test

public void employeeSearch() throws IOException
{
	driver=InitializeDriver();
	driver.get("https://hrms.synerzip.in/");
	
	
	hrmsLoginpage hr=new hrmsLoginpage(driver);
	hr.login();
	hrmsDirectory hr1=new hrmsDirectory(driver);
	hr1.directory().click();
    hr1.empname().sendKeys("yash shaha");
	hr1.empid().sendKeys("2571");
	hr1.search().click();
	driver.quit();
	
}
}
